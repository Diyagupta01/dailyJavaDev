public class methods {
    public static void main(String[] args) {
        // method = a block of code that is executed whenever it is called upon 
        hello("Diya",20);
        int w = sum(6,4);
        System.out.println("Sum is "+w);
    }
    
    static void hello(String name, int age){
        System.out.println("Hello "+name+". You are "+age+" years old!");
    }

    static int sum(int x,int y){
        //int z =  x+y;
        //System.out.println("Sum is "+z);
        return x+y;
    }
}
