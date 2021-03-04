package sn.isi.traitement;

import sn.isi.entities.Ecole;
import sn.isi.entities.Specialite;

import java.util.Map;

public interface IEcole {
    public Map<Specialite, Ecole> saisir();
    public void afficherSpecialite(Map<Specialite,Ecole> specialite);
    public void afficherEcole(Map<Specialite, Ecole> ecole);
}
