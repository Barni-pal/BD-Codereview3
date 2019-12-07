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
        bikes.add(id);
            System.out.println("Citybike " + id +  " has been added to the station " + stationID);
    }
    public void removeBike(int id){
        bikes.remove(id);
        System.out.println("Citybike " + id +  " has been removed from the station " + stationID);
    }
}
