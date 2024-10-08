import java.util.Scanner;
public class if_statements {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.err.println("Enter your age to check if you are eligible or not: ");
        int age = scanner.nextInt();

        if(age >= 21){
            System.out.println("You are an eligible adult");
        }
        else if(age>=18){
            System.out.println("You are an adult but not eligible.");
        }
        else{
            System.out.println("You are a minor");
        }

        scanner.close();

    }
}
