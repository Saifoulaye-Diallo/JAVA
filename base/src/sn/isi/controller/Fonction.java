package sn.isi.controller;

import java.util.Scanner;

public class Fonction {
    public String nomProfuit;
    public Double prixHt;
    public int qt;
    public final double TVA = 0.18;
    Scanner sc= new Scanner(System.in);
    public void calcule(){
        double montantTTC=0,montantHT=0;
        System.out.println("Entrer le nom du produit");
        nomProfuit=sc.nextLine();
        System.out.println("Entrer le prix HT");
        prixHt=Double.parseDouble(sc.nextLine());
        System.out.println("Entrer la quantite en stock");
        qt=Integer.parseInt(sc.nextLine());
        montantHT=prixHt*qt;
        montantTTC=montantHT*(1+TVA);
        System.out.println("Le montant TTC est "+montantTTC);
    }


    public void traitement(){
        int i;
        double d;
        char c;
        System.out.println("Entrer un entier");
        i=Integer.parseInt(sc.nextLine());
        System.out.println("Entrer un reel");
        d=Double.parseDouble(sc.nextLine());
        String reelChaine = String.valueOf(d);
        int decimal =Integer.parseInt(reelChaine.substring(reelChaine.indexOf(".")+1));
        System.out.println(""+decimal);
        System.out.println("Entrer un caractere");
        c=sc.nextLine().charAt(0);
        if (c=='A' || c=='B' || c=='a' || c=='b')
        {
            if (decimal>d){
                System.out.println("Le produit est "+(i*decimal));
            }
        }
    }

}
