import java.util.*;

public class two_dim_arraylist {
   public static void main(String[] args) {

    ArrayList<ArrayList<String>> groceryList = new ArrayList<>();
    
    ArrayList<String> bakeryList =  new ArrayList<String>();
    bakeryList.add("Bread");
    bakeryList.add("Cake");
    bakeryList.add("Cookies");
    bakeryList.add("Donuts");

    ArrayList<String> produceList =  new ArrayList<String>();
    produceList.add("Tomatoes");
    produceList.add("Pepper");
    produceList.add("Capcicum");

    ArrayList<String> drinkList =  new ArrayList<String>();
    
    drinkList.add("Soda");
    drinkList.add("Coffee"); 
    
    groceryList.add(bakeryList);
    groceryList.add(produceList);
    groceryList.add(drinkList);

    System.out.println(groceryList);
    System.out.println(groceryList.get(0).get(1));
   }
    
}
