import java.util.Scanner;

public class user_input {
    public static void main(String[] args){

        Scanner enter = new Scanner(System.in);
        System.out.println("What is your name?  ");
        String name = enter.nextLine();
        System.out.println("Hello, " + name + "!");

        System.out.println("How old are you?  ");
        int age = enter.nextInt();
        System.out.println("You are "+ age +"years old.");

        enter.nextLine(); //to remove extra \n left ater nextInt()

        System.out.println("What is your hobby?  ");
        String hobby = enter.nextLine();
        System.out.println("I love " + hobby + "!:)");
    }
}
