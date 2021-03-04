package sn.isi.traitement;

import sn.isi.entities.Zone;

import java.util.Scanner;

public class ZoneImp implements IZone{
    private Scanner sc = new Scanner(System.in);
    private Zone zone = new Zone();
    @Override
    public Zone saisie() {
        System.out.println("Entrer l'id");
        zone.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le nom");
        zone.setNom(sc.nextLine());
        System.out.println("Entrer la lattitude");
        zone.setLattitude(Double.parseDouble(sc.nextLine()));
        System.out.println("Entrer la longitude");
        zone.setLongitude(Double.parseDouble(sc.nextLine()));
        return zone;
    }

    @Override
    public void afficher(Zone zone) {
        System.out.println("L'id est : "+zone.getId());
        System.out.println("Le nom est : "+zone.getNom());
        System.out.println("La longitude est : "+ zone.getLongitude());
        System.out.println("La lattitude est : "+ zone.getLattitude());
    }
}
