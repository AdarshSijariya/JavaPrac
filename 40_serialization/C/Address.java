import java.io.Serializable;

class Address implements Serializable {
    String cityName;    
    String stateName;
    
    Address(String cityName, String stateName) {
        this.cityName = cityName;
        this.stateName = stateName;
    }
}
