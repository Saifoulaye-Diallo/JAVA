import sn.isi.entities.Chemise;
import sn.isi.entities.Montre;
import sn.isi.services.ChermiseImp;
import sn.isi.services.MontreImp;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("QUEL ARTICLE VOULEZ-VOUS??");
        System.out.println("1_____CHEMISE");
        System.out.println("2_____MONTRE");
        Integer rep = Integer.parseInt(sc.nextLine());
        switch (rep){
            case 1:
                Chemise chemise = new Chemise();
                ChermiseImp chermiseImp = new ChermiseImp();
                chemise = chermiseImp.saisie();
                System.out.println("Affichage des donnees de la chemise");
                chermiseImp.affiche(chemise);
                break;
            case 2:
                Montre montre = new Montre();
                MontreImp montreImp = new MontreImp();
                montre = montreImp.saisie();
                montreImp.affiche(montre);
                break;
            default:
                System.out.println("CHOIX INVALIDE");
        }
    }
}
