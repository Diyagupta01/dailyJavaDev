class Human {
    String name;
    int age;
    int weight;

    // Constructor
    public Human(String name, int age, int weight) {
        this.name = name;
        this.age = age;
        this.weight = weight;
    }

    // Method to display human details
    public void display() {
        System.out.println("Name: " + name + ", Age: " + age + ", Weight: " + weight);
    }
}

public class constructors {
    public static void main(String[] args) {
        Human human1 = new Human("Diya", 20, 47);
        Human human2 = new Human("Riya", 26, 67);

        human1.display();
        human2.display();
    }
}
