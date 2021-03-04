package sn.isi.entities;

public class Consultant extends Personne{
    private Integer nbHeure;
    private Double tauxHorraire;

    public Double getTauxHorraire() {
        return tauxHorraire;
    }

    public Integer getNbHeure() {
        return nbHeure;
    }

    public void setNbHeure(Integer nbHeure) {
        this.nbHeure = nbHeure;
    }

    public Double getTauxHorraire(double v) {
        return tauxHorraire;
    }

    public void setTauxHorraire(Double tauxHorraire) {
        this.tauxHorraire = tauxHorraire;
    }
}
