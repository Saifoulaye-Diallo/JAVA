import sn.isi.entities.User;
import sn.isi.services.IUser;
import sn.isi.services.UserEmp;

public class Main {
    public static void main(String[] args){
       IUser iu = new UserEmp();
       User user = new User();
       user = iu.saisie();
       iu.affiche(user);
    }
}
