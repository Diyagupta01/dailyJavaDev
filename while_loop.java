
import java.util.Scanner;public class while_loop {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        String name = "";
while(name.isBlank()){
System.err.println("Enter your name: ");
name = scanner.nextLine();
}

        System.out.println("Hello "+ name );
scanner.close();
    }
}
