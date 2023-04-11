package com.example.listviewpersonnalis;
public class Nombre {
    private  String _NombreFr;
    private  String _NombreAn;
    private int _ImageRessourceId = -1;

    public Nombre(String NombreFr, String NombreAn, int ImageRessourceId){
        _NombreFr = NombreFr;
        _NombreAn = NombreAn;
        _ImageRessourceId = ImageRessourceId;
    }

    public String get_NombreFr(){return _NombreFr;}
    public void set_NombreFr(String NombreFr){_NombreFr = NombreFr;}

    public String get_NombreAn(){return _NombreAn;}
    public void set_NombreAn(String NombreAn){_NombreAn = NombreAn;}

    public int get_ImageRessourceId(){return _ImageRessourceId;}
    public void set_ImageRessourceId(int ImageRessourceId){
        _ImageRessourceId = ImageRessourceId;
    }
    public  Boolean AucuneImage(){
        return _ImageRessourceId == -1;
    }

}