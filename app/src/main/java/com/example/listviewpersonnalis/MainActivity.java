package com.example.listviewpersonnalis;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    ListView _lsvNombres;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        _lsvNombres = (ListView) findViewById(R.id.lsvNombres);
        //remplir notre ListView

      // listview avec un seul élément:
    /*    String[] nombres = new String[10];
        nombres[0] = "zéro";
        nombres[1] = "Un";
        nombres[2] = "Deux";
        nombres[3] = "Trois";
        nombres[4] = "Quatre";
        nombres[5] = "Cinq";
        nombres[6] = "Six";
        nombres[7] = "Sept";
        nombres[8] = "Huit";
        nombres[9] = "Neuf";

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,
                android.R.layout.simple_list_item_1,nombres);
        _lsvNombres.setAdapter(adapter);*/

        // listview avec deux éléments:
/*final ArrayList<Nombre> nombres = new ArrayList<Nombre>();
        nombres.add(new Nombre("Un","One"));
        nombres.add(new Nombre("Deux","Two"));
        nombres.add(new Nombre("Trois","Three"));
        nombres.add(new Nombre("Quatre","Four"));
        nombres.add(new Nombre("Cinq","Five"));
        nombres.add(new Nombre("Six","Six"));
        nombres.add(new Nombre("Sept","Seven"));
        nombres.add(new Nombre("Huit","Eight"));
        nombres.add(new Nombre("Neuf","Nine"));
        nombres.add(new Nombre("Dix","Ten"));

        AdaptateurNombre adapNombre = new AdaptateurNombre(this,nombres);
        _lsvNombres.setAdapter(adapNombre);*/

        // listview avec trois éléments:
        final ArrayList<Nombre> nombres = new ArrayList<Nombre>();
        nombres.add(new Nombre("Un","One",R.drawable.un));
        nombres.add(new Nombre("Deux","Two",R.drawable.deux));
        //CAS exceptionnel : absence d'image:
       // nombres.add(new Nombre("Deux","Two",-1));
        nombres.add(new Nombre("Trois","Three",R.drawable.trois));
        nombres.add(new Nombre("Quatre","Four",R.drawable.quatre));
        nombres.add(new Nombre("Cinq","Five",R.drawable.cinq));
        nombres.add(new Nombre("Six","Six",R.drawable.six));
        nombres.add(new Nombre("Sept","Seven",R.drawable.sept));
        nombres.add(new Nombre("Huit","Eight",R.drawable.huit));
        nombres.add(new Nombre("Neuf","Nine",R.drawable.neuf));
        nombres.add(new Nombre("Dix","Ten",R.drawable.dix));

        AdaptateurNombre adapNombre = new AdaptateurNombre(this,nombres);
        _lsvNombres.setAdapter(adapNombre);


    }
}