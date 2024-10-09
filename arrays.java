public class arrays {
    public static void main(String[] args){
        String[] cars = {"CAMARO", "CORVETTE", "TESLA"};

        cars[0] = "Mustang";
        System.out.println(cars[1]);

        String[] flowers = new String[3];
        flowers[0] = "ROSE";
        flowers[1] = "LILY";
        flowers[2] = "DAISY";

        for(int i =0;i<3;i++){
        System.out.println(flowers[i]);
        }
    }
}