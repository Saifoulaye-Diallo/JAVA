package main;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;
import sn.isi.traitement.EcoleImp;

import java.util.Hashtable;
import java.util.Map;

public class Main {
    public static void main(String[] arg)
    {
        EcoleImp eimp = new EcoleImp();
        Map<Specialite, Ecole> mapecole = new Hashtable<Specialite,Ecole>();
        mapecole = eimp.saisir();
        eimp.afficherSpecialite(mapecole);
        eimp.afficherEcole(mapecole);
    }
}

