public class swap_variables {
    public static void main(String[] args){
        String x = "Water";
        String y = "Juice";
        String temp;

        System.out.println("Before Swapping:- ");
        System.out.println("x: "+x);
        System.out.println("y: "+y);

        System.out.println("After Swapping:- ");
        temp = x;
        x=y;
        y=temp;
        System.out.println("x: "+x);
        System.out.println("y: "+y);
    }
}
