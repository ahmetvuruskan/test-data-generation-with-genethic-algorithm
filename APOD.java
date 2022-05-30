
import com.fasterxml.jackson.annotation.JsonProperty;

public class APOD {
    public final String name;
    public final String address;
    public final String latitude;
    public final String longitude;
    public final String maiden_name;
    public final String phone_h;
    public final String email_d;
    public final String domain;
    public final String useragent;
    public final String ipv4;
    public final String macaddress;
    public final String plasticcard;
    public final String cardexpir;
    public final String bonus;
    public final String company;
    public final String color;
    public final String uuid;
    public final String height;
    public final String weight;
    public final String blood;
    public final String hair;
    public final String pict;
    public final String url;
    public final String sport;
    public final String ipv4_url;
    public final String email_url;
    public final String domain_url;

    public final String birth_data;
    public final String phone_w;
    public final String email_u;
    public final String username;
    public final String password;
    public final String eye;

    public APOD(@JsonProperty("name") String name,
                @JsonProperty("address") String adress,
                @JsonProperty("latitude") String latitude,
                @JsonProperty("longitude") String longitude,
                @JsonProperty("maiden_name") String maiden_name,
                @JsonProperty("birth_data") String birth_data,
                @JsonProperty("phone_h") String phone_h,
                @JsonProperty("phone_w") String phone_w,
                @JsonProperty("email_u") String email_u,
                @JsonProperty("email_d") String email_d,
                @JsonProperty("domain") String domain,
                @JsonProperty("plasticcard") String plasticcard,
                @JsonProperty("cardexpir") String cardexpir,
                @JsonProperty("bonus") String bonus,
                @JsonProperty("company") String company,
                @JsonProperty("color") String color,
                @JsonProperty("uuid") String uuid,
                @JsonProperty("height") String height,
                @JsonProperty("weight") String weight,
                @JsonProperty("blood") String blood,
                @JsonProperty("hair") String hair,
                @JsonProperty("pict") String pict,
                @JsonProperty("url") String url,
                @JsonProperty("sport") String sport,
                @JsonProperty("ipv4_url") String ipv4_url,
                @JsonProperty("email_url") String email_url,
                @JsonProperty("domain_url") String domain_url,
                @JsonProperty("useragent") String useragent,
                @JsonProperty("ipv4") String ipv4,
                @JsonProperty("macaddress") String macaddress,
                @JsonProperty("username") String username,
                @JsonProperty("eye") String eye,
                @JsonProperty("password") String password) {
        this.name = name;
        this.address = adress;
        this.latitude = latitude;
        this.longitude = longitude;
        this.maiden_name = maiden_name;
        this.birth_data = birth_data;
        this.phone_h = phone_h;
        this.phone_w = phone_w;
        this.email_u = email_u;
        this.email_d = email_d;
        this.username = username;
        this.eye = eye;
        this.password = password;
        this.domain = domain;
        this.useragent = useragent;
        this.ipv4 = ipv4;
        this.macaddress = macaddress;
        this.plasticcard = plasticcard;
        this.cardexpir = cardexpir;
        this.bonus = bonus;
        this.company = company;
        this.color = color;
        this.uuid = uuid;
        this.height = height;
        this.weight = weight;
        this.blood = blood;
        this.hair = hair;
        this.pict = pict;
        this.url = url;
        this.sport = sport;
        this.ipv4_url = ipv4_url;
        this.email_url = email_url;
        this.domain_url = domain_url;

    }
}
