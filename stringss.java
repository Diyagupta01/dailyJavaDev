public class stringss {
    public static void main(String[] args) {
        
        String name = "Diya";

        boolean result1 = name.equalsIgnoreCase("diya");
        int result2 = name.length();
        int result3 = name.indexOf("y");
        char result4 = name.charAt(1);
        boolean result5 = name.isEmpty();
        String result6 = name.toUpperCase();
        String result7 = name.toLowerCase();
        String result8 = name.trim();
        String result9 = name.replace("i","ee");

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
        System.out.println(result7);
        System.out.println(result8);
        System.out.println(result9);

    }
}
