package sn.isi.services;

import sn.isi.entities.Chemise;

import java.util.Scanner;

public class ChermiseImp implements IChemise{
    private Scanner sc=new Scanner(System.in);
    Chemise ch = new Chemise();
    @Override
    public Chemise saisie() {
        System.out.println("Entrer l'id");
        ch.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le libelle");
        ch.setLib(sc.nextLine());
        System.out.println("Entrer la couture");
        ch.setCouture(sc.nextLine());
        return ch;
    }

    @Override
    public void affiche(Chemise ch) {
        System.out.println("L'id est : "+ch.getId());
        System.out.println("Le libelle est : "+ch.getLib());
        System.out.println("La couture est : "+ch.getCouture());
    }
}
