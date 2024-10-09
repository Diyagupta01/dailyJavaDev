import java.util.ArrayList;
public class arraylist {
    public static void main(String[] args) {

        ArrayList<String> food = new ArrayList<String>();

        food.add("Burger");
        food.add("Pizza");
        food.add("Hotdog");

        //methods:

        food.set(0,"Sushi");

        food.remove(2);

        //food.clear(); //clears  the list

        for(int i = 0; i<food.size(); i++){
            System.out.println(food.get(i));
        }



    }
}
