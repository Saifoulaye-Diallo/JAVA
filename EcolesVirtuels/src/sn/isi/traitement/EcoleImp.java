package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class EcoleImp implements IEcole{
    private Scanner scanner = new Scanner(System.in);
    @Override
    public Map<Specialite, Ecole> saisir() {
        Map<Specialite, Ecole> mapecole = new Hashtable<Specialite,Ecole>();
        String rep = null;
        do{
            Ecole ecole = new Ecole();
            Specialite specialite = new Specialite();
            System.out.println("Entrer l'id de l'ecole");
            ecole.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Entrer le nom de l'ecole");
            ecole.setNomEcole(scanner.nextLine());
            System.out.println("ENTRER LES SPECIALITES");
            System.out.println("Entrer l'id de la specialite");
            specialite.setId(Integer.parseInt(scanner.nextLine()));
            System.out.println("Entrer le nom de la Specialite");
            specialite.setNomSpec(scanner.nextLine());
            ecole.setSpecialite(specialite);
            mapecole.put(specialite, ecole);
            System.out.println("Voulez-vous saisir de nouvelles informations? oui/non");
            rep = scanner.nextLine();
        }while (rep.equalsIgnoreCase("oui"));
        return mapecole;
    }

    @Override
    public void afficherSpecialite(Map<Specialite, Ecole> specialite) {
        for (Specialite i : specialite.keySet())
        {
            System.out.println("Id : "+i.getId()+" --> Nom :"+i.getNomSpec());
        }
    }

    @Override
    public void afficherEcole(Map<Specialite, Ecole> ecole) {
        for (Ecole i: ecole.values())
        {
            System.out.println("Id :"+i.getId()+" Nom :"+i.getNomEcole()+" Specialite: "+i.getSpecialite().getNomSpec());
        }
    }
}
