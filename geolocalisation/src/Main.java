import sn.isi.entities.Rn;
import sn.isi.traitement.RnImp;

public class Main {
    public static void main(String[] args){
            Rn rn = new Rn();
            RnImp rnImp = new RnImp();
            rn=rnImp.saisie();
            rnImp.afficher(rn);
    }
}