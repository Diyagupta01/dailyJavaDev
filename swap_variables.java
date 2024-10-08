public class swap_variables {
    public static void main(String[] args){
        String x1 = "Water";
        String y = "Juice";
        String temp;

        System.out.println("Before Swapping:- ");
        System.out.println("x: "+x1);
        System.out.println("y: "+y);

        System.out.println("After Swapping:- ");
        temp = x1;
        x1=y;
        y=temp;
        System.out.println("x: "+x1);
        System.out.println("y: "+y);
    }
}
