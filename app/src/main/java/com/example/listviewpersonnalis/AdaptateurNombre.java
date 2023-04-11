package com.example.listviewpersonnalis;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.ArrayList;

public class AdaptateurNombre extends ArrayAdapter<Nombre> {
    public AdaptateurNombre(@NonNull Context context, ArrayList<Nombre> nombres) {
        super(context, 0,nombres);
    }
    @NonNull
    @Override
    public View getView(int position, @NonNull View convertView, @NonNull ViewGroup parent){
      View lsvElementView = convertView;
      if(lsvElementView == null){
          lsvElementView = LayoutInflater.from(getContext()).inflate(R.layout.lsvelement,parent,false);
      }
      Nombre nombreCourant = getItem(position);
        TextView NombreFrTextView = (TextView) lsvElementView.findViewById(R.id.txtFr);
        NombreFrTextView.setText(nombreCourant.get_NombreFr());

        TextView NombreAnTextView = (TextView) lsvElementView.findViewById(R.id.txtAn);
        NombreAnTextView.setText(nombreCourant.get_NombreAn());

        //affichage de l'image
        ImageView icone = (ImageView) lsvElementView.findViewById(R.id.imgNombre);
        if(!nombreCourant.AucuneImage()){
            icone.setImageResource(nombreCourant.get_ImageRessourceId());
        } else {
            icone.setVisibility(View.GONE);
        }


        return lsvElementView;
    }

}
