package sn.isi.traitement;

import sn.isi.entities.Rn;
import sn.isi.entities.Zone;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RnImp implements IRn{
    private Scanner sc = new Scanner(System.in);
    private Rn rn = new Rn();
    @Override
    public Rn saisie() {
        List <Zone> zones = new ArrayList<Zone>();
        String rep=null;
        do {
            Zone zone = new Zone();
            System.out.println("Entrer l'id de la zone");
            zone.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entrer le nom");
            zone.setNom(sc.nextLine());
            System.out.println("Entrer la lattitude");
            zone.setLattitude(Double.parseDouble(sc.nextLine()));
            System.out.println("Entrer la longitude");
            zone.setLongitude(Double.parseDouble(sc.nextLine()));
            zones.add(zone);
            rn.setZones(zones);
            System.out.println("UNE AUTRE ZONE");
            rep = sc.nextLine();
        }while (rep.equalsIgnoreCase("oui"));
            System.out.println("Entrer l' id de la route: ");
            rn.setId(Integer.parseInt(sc.nextLine()));
            System.out.println("Entrer la longitude : ");
            rn.setLongitude(Double.parseDouble(sc.nextLine()));
            System.out.println("Entrer la lattitude :");
            rn.setLatitude(Double.parseDouble(sc.nextLine()));
        return rn;
    }

    @Override
    public void afficher(Rn rn) {
        List<Zone> zones = new ArrayList<Zone>();
        Zone zone = new Zone();
        System.out.println("L'id : "+rn.getId());
        System.out.println("La lattitude : "+rn.getLatitude());
        System.out.println("La longitude : "+rn.getLongitude());
        System.out.println("----ZONE(S)-----");
        zones = rn.getZones();
        for (Zone zo: zones)
        {
            System.out.println("L'ID : "+zo.getId());
            System.out.println("NOM : "+zo.getNom());
            System.out.println("LONGITUDE : "+zo.getLongitude());
            System.out.println("LATTITUDE : "+zo.getLattitude());
        }
    }
}
