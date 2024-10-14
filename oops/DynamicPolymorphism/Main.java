import java.util.Scanner;
public class Main {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Animal animal;

        System.out.println("Which animal do you want to be?");
        System.out.println("Choose 1 for dog and 2 for cat.");

        int choice = scanner.nextInt();

        if(choice==1){
            animal = new Dog();
            animal.speak();
        }
        else if(choice==2){
            animal = new Cat();
            animal.speak();
        }
        else{
            animal = new Animal();
            System.out.println("Invalid choice");
            animal.speak();

        }

        
    }
    
}
