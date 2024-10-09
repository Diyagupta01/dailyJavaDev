import java.util.ArrayList;
public class for_each_loop {
    public static void main(String[] args) {
        
        //for-each =traversing technique to iterate through the elements in an array/collection
        //less steps, more readable
        //less flexible

        System.out.println("Using String: ");

        String[] animals = {"cat","dog","rat","bird"};

        for(String i: animals){
            System.out.println(i);
        }

        ArrayList<String> animal = new ArrayList<String>();

        animal.add("cat");
        animal.add("dog");
        animal.add("rat");
        animal.add("bird");

        System.out.println("Using ArrayList: ");

        for(String j: animal){
            System.out.println(j);
        }




    }
}
