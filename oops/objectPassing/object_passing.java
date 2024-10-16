//package objectPassing;
public class object_passing 
{
 public static void main(String[] args) {
    Garage garage = new Garage();

    Cars car1 = new Cars("BMW");

    garage.park(car1);
    Cars car2 = new Cars("Audi");

    garage.park(car2);

 }   
}
