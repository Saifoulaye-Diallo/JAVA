import sn.isi.entities.Consultant;
import sn.isi.entities.Employe;
import sn.isi.service.ConsultantImp;
import sn.isi.service.EmployeImp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("CHOISIR LE TYPE DE PERSONNE DONT VOUS VOULEZ SAISIR");
        System.out.println("1_________CONSULTANT");
        System.out.println("2_________EMPLOYE");
        Integer rep = Integer.parseInt(sc.nextLine());
        switch (rep){
            case 1:
                Consultant consultant = new Consultant();
                ConsultantImp impConsul = new ConsultantImp();
                consultant = impConsul.saisie();
                impConsul.affiche(consultant);
                break;
            case 2:
                Employe employe = new Employe();
                EmployeImp impEmploye = new EmployeImp();
                employe = impEmploye.saisie();
                impEmploye.affiche(employe);
                break;
            default:
                System.out.println("CHOIX INVALIDE");
        }
    }
}
