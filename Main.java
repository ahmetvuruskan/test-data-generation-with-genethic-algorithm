import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) throws IOException, InterruptedException, SQLException {
        Database database = new Database();
        Request request = new Request();
        Genethic genethic = new Genethic();
      // database.insertFakeData(50, "randomuser");
      // ArrayList<RandomUser> randomUsers = database.Rread();

        //genethic.fitness();
database.getColumnNames("generatedUserNames");
      genethic.cross();

    }


}
