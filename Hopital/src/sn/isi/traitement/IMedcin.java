package sn.isi.traitement;

import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;

public interface IMedcin {
    public Medecin saisie();
    public void affiche(Medecin medecin);
    public MedecinChef saisieMC();
    public void afficheMC(MedecinChef medecinChef);
    public MedecinGeneraliste saisieMG();
    public void afficheMG(MedecinGeneraliste medecinGeneraliste);
    public MedecinSpecialiste saisiMS();
    public void afficheMS(MedecinSpecialiste medecinSpecialiste);
    public Integer choix();


}
