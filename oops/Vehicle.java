public class Vehicle {
    double speed;

    public void go (double speed){
        System.out.println("You are moving at "+speed+"  km/h");
    }

    public static void stop (double speed){
        System.out.println("You are stopped because you reached speed of "+speed+"  km/h");
    }

}
