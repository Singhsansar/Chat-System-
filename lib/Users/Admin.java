package Users;
import Main.Main;
import Usermanagement.CreateUser;
import Functions.Func;

public class Admin {
    public static void admin()
    {
        

         feature();
    }

private  static void feature() {
  
  try {
    Thread.sleep(2000);   
  }
  catch (InterruptedException ex)
  {
    ex.printStackTrace();
  }

       String obj = Func.input("Enter command /type 'help'");
       
    //list all the Actions that can be done in this project
         switch(obj)
         {    
         case "help": 
         {
         Func.print("\n");
         Func.print("--commands--    :  -------------Actions---------------- ");
         Func.print("  create        :        create cases profile");
         Func.print("  view          :        To view the cases profile");
         Func.print("  update        :        To update the cases details/ user details");
         Func.print("  changepsw     :        to change the password");
         Func.print("  createuser    :        to create a new user profile");
         Func.print("  logout        :        to logout");
         
         feature();
         break; 
         }
          case "create":
          {
         
        
         break;
          }
          case "view":
          {
         
        
         break;
          }
          case "update":
          {
         
        
         break;
          }

          case "changepsw":
          {
         
        
         break;
          }
          case "createuser":
          {
            CreateUser.createuser();
         
        
         break;
          }
          case "logout":
          {
         
            Main.getID_psw();
        
         break;
          }


            default:     
            System.out.println("Invalid Input /type 'help' "); 
            feature();
            
        }
         
    }
}