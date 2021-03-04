package sn.isi.service;

import sn.isi.entities.Employe;
import sn.isi.entities.Personne;

public interface IEmploye {
    public Employe saisie();
    public void affiche(Employe emp);
}
