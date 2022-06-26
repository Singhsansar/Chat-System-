//For adding a user and Creating a players profile
package databasehandling;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import functions.Func;
import users.Player_Registration;

import com.mongodb.client.MongoClient;
import org.bson.Document;
public class Upload
{
       static String url ="mongodb+srv://Admin:12345@cluster0.ng8il.mongodb.net/?retryWrites=true&w=majority"; 
       static  MongoClient mongoClient =  MongoClients.create(url);
       static  MongoDatabase db = mongoClient.getDatabase("IPL_Auction_System");

    public static void addplalyer()
    {
        MongoCollection<Document> collection = db.getCollection("Player_details");

        Document docs = new Document();
            Func.delay(1000);
            Func.print("------------------Enter the Following details-------------------\n");
            docs.put("Country", Func.input("Country: "));
            docs.put("Age",  Func.input("Age: "));
            docs.put("Specialism", Func.input("Specialism: "));
            docs.put("Batting",  Func.input("Battinlg Style: "));
            docs.put("Bowling",  Func.input("Bowlinlg Style: "));
            docs.put("No_of_Ipl_matches",  Func.input("Number of IPL matches played: "));
            docs.put("Best_Score", Func.input("Enter your best score: "));
            docs.put("C/U/A",  Func.input("capped/uncapped:"));
            docs.put("Base Price",  Func.input("Base Price:"));
            collection.insertOne(docs);
            System.out.println(docs.toJson());
            Func.delay(1000);
            Func.print("-----------------player Added Successfully---------------------------------");


    }

    //Search the player to show the profile 
    // public void searchplayer()
    // {
    //     //String name = Func.input("Enter the Name of the player : ");
    //     //String country = Func.input("Enter the country of the player : ");
    // }
   
}

        
        
       
    