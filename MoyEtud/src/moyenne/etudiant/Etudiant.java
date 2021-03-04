
package moyenne.etudiant;

import com.sun.xml.internal.bind.v2.runtime.output.SAXOutput;
import jdk.nashorn.internal.ir.CatchNode;

import javax.sound.midi.Soundbank;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
public class Etudiant {
   public static void CalculMoye() {
       Scanner saisir = new Scanner(System.in);
       String nom;
       String prenom;
       Double note;
       int coef;
       String repfin = null;
    do {
       System.out.println("Entrer le nom");
       nom = saisir.nextLine();
       System.out.println("Entrer le prenom");
       prenom = saisir.nextLine();
       System.out.println("Entrer la Date de naissance");
       Date date = null;
       try {
           SimpleDateFormat sdf = new SimpleDateFormat("dd-MMyyyy");
           date = sdf.parse(saisir.nextLine());
       } catch (Exception ex) {
           ex.printStackTrace();
       }
       String rep = null;
       Double notes = 0.0;
       int coefs = 0;
       do {
           do {
               System.out.println("Entrer la note");
               note = Double.parseDouble(saisir.nextLine());
           } while (note < 0 || note > 20);
           notes = +note;
           do {
               System.out.println("Entrer le coeficient");
               coef = Integer.parseInt(saisir.nextLine());
           } while (coef <= 0);
           coefs = +coef;
           System.out.println("Voulez vous saisir une note ? oui/non");
           rep = saisir.nextLine();
       } while (rep.equalsIgnoreCase("oui"));
       System.out.println("Nom :"+nom);
       System.out.println("prenom :"+prenom);
       System.out.println("Date de naissance :"+date);
       System.out.println("La moyenne est " + (notes / coefs));
       System.out.println("Voulez vous saisir un nouvel etudiant ? oui/non");
       repfin = saisir.nextLine();
    }while (repfin.equalsIgnoreCase("oui"));
   }
}
