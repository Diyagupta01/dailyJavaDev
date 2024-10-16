public class overloaded_constructors {
    public static void main(String[] args) {

       Pizza pizza = new Pizza("Thin crust","tomato","mozarella","pepperoni");

       System.out.println("Here are the ingredients of your pizza: ");
       System.out.println("Crust: " + pizza.bread);
       System.out.println("Sauce: " + pizza.sauce);
       System.out.println("Cheese: " + pizza.cheese);
       System.out.println("Toppings: " + pizza.toppings);


    }
}
