package sn.isi.service;

import sn.isi.entities.Consultant;
import sn.isi.entities.Personne;
public interface IConsultant {
    public Consultant saisie();
    public void affiche(Consultant cst);
}
