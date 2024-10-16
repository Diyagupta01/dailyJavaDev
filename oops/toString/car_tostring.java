//package toString;
public class car_tostring {

    String make = "Ford";
    String model = "Mustang";
    int year = 2021;
    String colour = "red";

    public String toString(){

        String mystring =  "Make: " + make + "\nModel: " + model + "\nYear: "
        + year + "\nColour: " + colour;
        return mystring;
    }
}
