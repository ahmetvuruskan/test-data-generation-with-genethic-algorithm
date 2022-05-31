public class QualifiedUser {
    private String uID;
    private String userName;
    private  double qualityValue;



    public double getQualityValue() {
        return qualityValue;
    }

    public String getuID() {
        return uID;
    }

    public String getUserName() {
        return userName;
    }



    public void setQualityValue(double qualityValue) {
        this.qualityValue = qualityValue;
    }

    public void setuID(String uID) {
        this.uID = uID;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


}
