package citybike;

import java.util.HashMap;

public class Bike {
    public static int newBike = 1;
    public int bikeID;
    public String color;
    public String state;
    public Bike(String color, String state){
        bikeID = newBike;
        newBike++;
        this.state = state;
        this.color = color;

    }
}
