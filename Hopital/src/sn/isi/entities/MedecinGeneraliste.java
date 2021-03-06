package sn.isi.entities;

import java.util.List;

public class MedecinGeneraliste extends Medecin{
    private List<Specialite> listSpecialistes;

    public List<Specialite> getListSpecialistes() {
        return listSpecialistes;
    }

    public void setListSpecialistes(List<Specialite> listSpecialistes) {
        this.listSpecialistes = listSpecialistes;
    }
}
