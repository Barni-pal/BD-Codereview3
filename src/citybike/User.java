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
/*    public void bikeRent(int bikeid, int userid) {
        User renter = new User()
     *//*
            inv1.get(bookid).isrented = true;
            LibraryUser user = person.get(userid);
            user.id.add(bookid);
            System.out.println("Renting was succesful!");*//*
        }*/
        ArrayList<Integer> id = new ArrayList<>();
    }

