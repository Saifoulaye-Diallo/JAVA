import sn.isi.dao.ProduitImp;
import sn.isi.dao.UserImp;
import sn.isi.enitities.Produit;
import sn.isi.enitities.User;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
       /* User user = new User();
        UserImp userImp = new UserImp();
        user.setNom("NIANG");
        user.setPrenom("AMADOU");
        user.setMail("saifondiallo2019@gmial.com");
        user.setPassword("1234");
        userImp.add(user);*/

        //LISTER
        /*List<User> liste= userImp.liste();
        for (User u : liste)
        {
            System.out.println("Id : "+u.getIdU()+"nom : "+u.getNom());
        }*/
        //MODIFIER
        /*user.setNom("DIALLO");
        user.setPrenom("SAIFON");
        user.setMail("saifondiallo2019@gmial.com");
        user.setPassword("11111");
        userImp.update(user,1);*/
        //DELECTE
       // userImp.delete(1);
        ProduitImp produitImp = new ProduitImp();
       /* Produit p = new Produit();
        p.setRef("1234");
        p.setNomProd("TELECPHONE");
        User user1 = new User();
        user1.setIdU(2);
        p.setUser(user1);
        //produitImp.update(p);
        produitImp.delete(p);*/

        List<Produit> liste= produitImp.liste();
        for (Produit p: liste)
        {
            System.out.println("Ref: "+p.getRef()+"nom : "+p.getNomProd());
        }
    }
}
