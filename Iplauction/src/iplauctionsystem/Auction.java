package iplauctionsystem;
//import databasehandling.*;
//import functions.*;
import functions.Func;
import java.io.FileNotFoundException;

import databasehandling.Upload;
import databasehandling.userdata;
import users.Admin;
import users.Player_Registration;
public class Auction
{
    public static void main(String[] args) throws FileNotFoundException
     {
        Func.print("\n----------------Welcome to the IPL AUCTION SYSTEM----------------\n");
        Func.delay(1000);
        Func.print("\n Choose your category to proceeed:\n\n 1) Admin\n 2) Team Manager\n 3) Player\n");
        int chosen_option = Integer.parseInt(Func.input("Ex: Enter 1 if your admin.\n"));
       switch (chosen_option) {
        case 1:
            Admin.admin();
            break;

        case 2:
            // need to implement for team manager.
            break;

        case 3:
            Player_Registration.register();
           // Upload.addplalyer();
            break;

        default:
        Func.print("\nInvalid Input.");
            break;
       }
   // Upload.addplalyer();
    }
}
