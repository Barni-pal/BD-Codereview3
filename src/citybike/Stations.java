package citybike;

import java.util.ArrayList;
import java.util.List;

public class Stations {
    public static int newStation = 1;
    public int stationID;
    public String location;
    public List<Integer> bikes = new ArrayList<>();
    public Stations(String location){
        stationID = newStation;
        newStation++;
    }
    public void addBike(int id){
        if (bikes.size() <= 5) {
            bikes.add(id);
            System.out.println("Citybike " + id + " has been added to the station " + stationID);
        }else{
            System.out.println("Station is full!");
        }
    }
}
