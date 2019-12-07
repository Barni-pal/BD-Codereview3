package citybike;

import java.util.HashMap;
import java.util.Map;

public class Out {
    public static Map<Integer, Bike> bike = new HashMap<>();
    public static Map<Integer, Stations> station = new HashMap<>();
    public static Map<Integer, User> user = new HashMap<>();
    public static void main(String[] args) {
        Bike bike1 = new Bike("Yellow", "InService");
        Bike bike2 = new Bike("Red", "CanBeRented");
        Bike bike3 = new Bike("Green", "CanBeRented");
        Bike bike4 = new Bike("Yellow", "CanNotBeRented");
        Bike bike5 = new Bike("Blue", "InService");
        Bike bike6 = new Bike("Orange", "Discarded");
        Bike bike7 = new Bike("Purple", "CanNotBeRented");
        Bike bike8 = new Bike("Red", "CanBeRented");
        bike.put(bike1.bikeID, bike1);
        bike.put(bike2.bikeID, bike2);
        bike.put(bike3.bikeID, bike3);
        bike.put(bike4.bikeID, bike4);
        bike.put(bike5.bikeID, bike5);
        bike.put(bike6.bikeID, bike6);
        bike.put(bike7.bikeID, bike7);
        bike.put(bike8.bikeID, bike8);
        Stations station1 = new Stations("Karlsplatz");
        Stations station2 = new Stations("Stephansplatz");
        Stations station3 = new Stations("Margaretengürtel");
        station.put(station1.stationID, station1);
        station.put(station2.stationID, station2);
        station.put(station3.stationID, station3);
        station1.addBike(1);
        station1.addBike(2);
        station1.addBike(3);
        station2.addBike(4);
        station2.addBike(5);
        station2.addBike(6);
        station2.addBike(7);
        User user1 = new User("Jimmy", "Smith");
        User user2 = new User("Carl", "Lock");
        User user3 = new User("Lindsy", "Fisher");
        User user4 = new User("Gabriel", "Law");
        user.put(user1.userID, user1);
        user.put(user2.userID, user2);
        user.put(user3.userID, user3);
        user.put(user4.userID, user4);
        bikeRent(1, 1);

    }
    public static void bikeRent(Integer renterid, Integer bikeid){
        User renter = user.get(renterid);
        renter.currentlyRentedBike = bikeid;
        renter.id.add(bikeid);
        System.out.println("You have successfully rented your bike!");
        station.remove(bikeid);


    }
}
