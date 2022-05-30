import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;


class Database {
    Request request = new Request();
    static Connection dbConnection = null;
    Statement statement = null;
    static String url = "jdbc:postgresql://localhost:5432/optimization";
    static String user = "Ahmet";
    static String pass = "123456789";

    Database() {
        try {
            dbConnection = DriverManager.getConnection(url, user, pass);
            // System.out.println("Veritabanı bağlantısı başarılı");
        } catch (SQLException e) {
            System.out.println("Veritabanı bağlantı hatası: " + e.getMessage());
            System.exit(0);
        }
    }

    boolean insert(String tableName, String values) {
        try {
            statement = dbConnection.createStatement();
            String sql = "INSERT INTO " + tableName + "( " + this.getColumnNames(tableName) + ") VALUES ( " + values + " ) ";
            int status = statement.executeUpdate(sql);
//            statement.close();
//            dbConnection.close();
            if (status != 1) {
                return false;
            }
            System.out.println("Islem Basarili");
        } catch (SQLException e) {
            System.out.println(e.getMessage() + "   " + e.getErrorCode());
        }

        return true;
    }

     String getColumnNames(String table) {
        List<String> columns = new ArrayList<>();
        try {
            this.statement = dbConnection.createStatement();
            String sql = "SELECT * FROM INFORMATION_SCHEMA.COLUMNS WHERE TABLE_NAME = N'" + table + "' ORDER by ordinal_position ASC ";
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                columns.add(resultSet.getString("column_name"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
      //  System.out.println(String.join(",", columns));
        return String.join(",", columns);
    }

    void insertFakeData(int notationMax, String tableName) throws IOException, InterruptedException {
        APOD json;
        for (int i=0; i<notationMax;i++){
            json = request.request();
            String data[] = json.name.split(" ");
            insert(tableName,
                    "'"+json.plasticcard+"','"+data[0]+"','"+data[1]+"','"+json.maiden_name+"','"+json.birth_data+"','"+json.blood+"','"+json.eye+"','"+json.hair+"','"+json.phone_w+"','"
                            +json.address+"','"+json.email_u+"@"+json.email_d+"','"+json.username+"','"+json.password.toString()+"'");

            System.out.println("'"+json.plasticcard+"','"+data[0]+"','"+data[1]+"','"+json.maiden_name+"','"+json.birth_data+"','"+json.blood+"','"+json.eye+"','"+json.hair+"','"+json.phone_w+"','"
                    +json.address+"','"+json.email_u+"@"+json.email_d+"','"+json.username+"','"+json.password+"'");
            TimeUnit.MILLISECONDS.sleep(500);
        }


    }
}
