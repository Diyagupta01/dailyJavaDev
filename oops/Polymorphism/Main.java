public class Main {
    public static void main(String[] args) {
        Car car  = new Car();
        Bicycle Bike  = new Bicycle();
        Boat boat =  new Boat();

        Vehicle[] racers = {car, Bike, boat};

        for(Vehicle x: racers){
            x.go();
        }
    }

}
