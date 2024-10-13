public class inheritence {
    public static void main(String[] args) {
        Caar car = new Caar();
        car.go(40);
        car.stop(60);

            Bicycle cycle = new Bicycle();
            cycle.go(30);
            cycle.stop(50);

            System.out.println(car.doors);
            System.out.println(cycle.pedals);
    }
}
