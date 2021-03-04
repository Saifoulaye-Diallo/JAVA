import sn.isi.entities.User;
import sn.isi.services.UserImp;
import sn.isi.services.IUser;

public class Main {
    public static void main(String[] args){
        IUser iseur = new UserImp();
        User us = new User();
        us=iseur.saisie();
        iseur.afficher(us);
    }
}
