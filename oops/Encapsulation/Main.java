public class Main {
    public static void main(String[] args) {
        Car car = new Car("Maruti","Swift",2008);

        car.setYear(1998);

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getYear());
    }
}
