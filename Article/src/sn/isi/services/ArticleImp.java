package sn.isi.services;

import sn.isi.entities.Article;

import java.util.Scanner;

public class ArticleImp implements  IArticle{
    private Scanner sc = new Scanner(System.in);
    Article a = new Article();
    @Override
    public Article saisie() {
        System.out.println("Entrer l'id de l'article");
        a.setId(Integer.parseInt(sc.nextLine()));
        System.out.println("Entrer le Libeller");
        a.setLib(sc.nextLine());
        return a;
    }

    @Override
    public void affiche(Article a) {
        System.out.println("Affichage de l'article");
        System.out.println("Id : "+a.getId());
        System.out.println("Libelle : "+a.getLib());
    }
}
