import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {
        Database database = new Database();
        Request request = new Request();
//  database.insert("randomuser", "'2008-05-20','Ahmet','Vuruskan','sadasd','0+','green','brown','0000000','alanya','ahmetF','ahmet','123456789','1324564987'");
        database.insertFakeData(3, "randomuser");

//        for (int i = 0; i < 5; i++) {
//         APOD apod =   request.request();
//
//         String value = "'"+apod.birth_data+"',"+"'";
//         database.insert("randomuser","");
//        }
    }
}
