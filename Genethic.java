import java.sql.SQLException;
import java.util.ArrayList;

public class Genethic {
    Database database = new Database();

    void fitness() throws SQLException {
        // f(x) = x^2
        ArrayList<RandomUser> randomUsers = database.Rread();
        for (RandomUser randomUser : randomUsers) {
        Double fitnessValue  =    Math.pow(randomUser.getuUserName().length(), 2);
            database.insert("qualifiedusernames",
                    "'" + randomUser.getuId() + "','" + randomUser.getuUserName() + "','" + fitnessValue + "',"+0);
        }
    }

    void cross() throws SQLException {
        ArrayList<QualifiedUser> qualifiedUsers = database.Qread();
        int size = qualifiedUsers.size() - 2;
        int index =0;
        for (QualifiedUser qualifiedUser : qualifiedUsers) {
            String f = String.valueOf(qualifiedUser.getUserName().charAt(0))+String.valueOf(qualifiedUser.getUserName().charAt(1))+String.valueOf(qualifiedUser.getUserName().charAt(2));
            int len = qualifiedUsers.get(index+1).getUserName().length();
            String l = String.valueOf(qualifiedUsers.get(index+1).getUserName().charAt(len-1))+String.valueOf(qualifiedUsers.get(index+1).getUserName().charAt(len-2))+String.valueOf(qualifiedUsers.get(index+1).getUserName().charAt(len-3)) ;
            System.out.println("'"+qualifiedUser.getuID()+"','"+l+f+"'");
            if (size ==index){
                break;
            }
            index++;
        }


    }

    ArrayList<QualifiedUser> roulette() throws SQLException {
        ArrayList<QualifiedUser> qualifiedUsers = new ArrayList<>();
        ArrayList<QualifiedUser> qualifiedUsers1  = database.Qread();
        int sum = database.getSum();
        for (QualifiedUser user:qualifiedUsers1){
            database.update("qualifiedusernames","val", String.valueOf(user.getQualityValue()/sum),"id",user.getuID());

        }
        return qualifiedUsers;
    }


}

