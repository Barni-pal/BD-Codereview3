package citybike;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.IdentityHashMap;
import java.util.Map;

public class User {
    public static int newUser;
    public int userID;
    public String name;
    public String surname;
    public int currentlyRentedBike;

    public User(String name, String surname) {
        this.userID = newUser;
        newUser++;
        this.name = name;
        this.surname = surname;
    }

    public void bikeRent(int bikeid, int stationid) {
        if (Out.bike.get(bikeid).state != "CanBeRented"){
            System.out.println("Bike can not be rented!");
        }else {
            Out.station.get(stationid).bikes.remove(bikeid);
            currentlyRentedBike = bikeid;
            Out.bike.get(currentlyRentedBike).state = "InService";
            System.out.println("You have successfully rented your bike!");
        }
    }
    public void  bikeRet(int bikeid, int stationid){
        if (Out.bike.get(bikeid).state != "InService"){
            System.out.println("Bike can not be returned to the station! Please contact our customer support service!");
        }else {
            Out.station.get(stationid).bikes.add(bikeid);
            currentlyRentedBike = bikeid;
            Out.bike.get(currentlyRentedBike).state = "CanBeRented";
            System.out.println("The bike has been returned to the station " + stationid + "!");
        }
    }
}

