public class RandomUser {
    private String uId;
    private String uName;
    private String uSurname;
    private String uUserName;
    private String uPassWord;

    public void setuId(String uId) {
        this.uId = uId;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public void setuPassWord(String uPassWord) {
        this.uPassWord = uPassWord;
    }

    public void setuSurname(String uSurname) {
        this.uSurname = uSurname;
    }

    public void setuUserName(String uUserName) {
        this.uUserName = uUserName;
    }

    public String getuId() {
        return uId;
    }

    public String getuName() {
        return uName;
    }

    public String getuSurname() {
        return uSurname;
    }

    public String getuUserName() {
        return uUserName;
    }

    public String getuPassWord() {
        return uPassWord;
    }
}
