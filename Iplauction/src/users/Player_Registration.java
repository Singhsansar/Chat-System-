package users;

import databasehandling.Upload;
import functions.Func;

public class Player_Registration {

    public Player_Registration(){}
    public static void register(){
        Func.print("----------------Welcome to the Player Registration Dashboard----------------\n");
        Func.delay(1000);

        int Player_chose = Integer.parseInt(Func.input("1) Registeration\n2) Login"));
        switch (Player_chose) {
            case 1:
                Upload.addplalyer();
                break;
            case 2:
                //need to implement dashboard for player.
            default:
                Func.print("Invalid input");
                break;
        }
        
        
    }
}
