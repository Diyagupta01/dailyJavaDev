import java.util.Scanner;
public class nested_loop {
    public static void main(String[] args){
Scanner scanner = new Scanner(System.in);

int rows, columns;
String sybmol = "";

System.out.println("Enter the number of rows: ");
rows = scanner.nextInt();
scanner.nextLine();
System.out.println("Enter the symbol: ");
sybmol = scanner.nextLine();
System.out.println("Enter the number of columns: ");
columns = scanner.nextInt();
scanner.nextLine();
scanner.close();
for (int i = 0; i < rows; i++) {
    for (int j = 0; j < columns; j++) {
        System.out.print(sybmol + " ");
    }
    System.out.println();
    }
}
}