public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Maruti","Swift",2008);
        Car car2 = new Car("Toyota","Camry",2010);
        Car car3 = new Car(car1); // copies current car1 detials to car3

        System.out.println(car1);
        System.out.println(car2);
        System.out.println(car3);

        car1.copy(car2); //copies car2 details to car1

        System.out.println(car1.getMake());
        System.out.println(car1.getModel());
        System.out.println(car1.getYear());

        System.out.println(car2.getMake());
        System.out.println(car2.getModel());
        System.out.println(car2.getYear());

        System.out.println(car3.getMake());
        System.out.println(car3.getModel());
        System.out.println(car3.getYear());
    }
}
