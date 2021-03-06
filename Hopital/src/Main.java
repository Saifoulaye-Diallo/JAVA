import sn.isi.entities.Medecin;
import sn.isi.entities.MedecinChef;
import sn.isi.entities.MedecinGeneraliste;
import sn.isi.entities.MedecinSpecialiste;
import sn.isi.traitement.MedecinImp;

public class Main {
    public static void main(String[] args)
    {
        MedecinImp medImp = new MedecinImp();
        switch (medImp.choix()){
            case 1:
                Medecin med = new Medecin();
                medImp.saisie();
                medImp.affiche(med);
            break;
            case 2:
                MedecinChef MC = new MedecinChef();
                MC=medImp.saisieMC();
                medImp.afficheMC(MC);
             break;
            case 3:
                MedecinGeneraliste MG = new MedecinGeneraliste();
                MG=medImp.saisieMG();
                medImp.afficheMG(MG);
                break;
            case 4:
                MedecinSpecialiste MS = new MedecinSpecialiste();
                MS=medImp.saisiMS();
                medImp.afficheMS(MS);
                break;
            default:
                System.out.println("Choix non disponible !!!");
        }
    }
}
