public class switches {
    public static void main(String[] args){
        // switch = statement that allows a variable to be tested for equality against a list of values (in case you are using a lot of if statements back to back, its better to use switch then)

        String day = "Friday";

        switch(day){
            case "Monday":  System.out.println("Today is Monday"); 
            break;
            case "Tuesday": System.out.println("Today is Tuesday"); 
            break;
            case "Wednesday": System.out.println("Today is Wednesday"); 
            break;
            case "Thursday": System.out.println("Today is Thursday"); 
            break;
            case "Friday": System.out.println("Today is Friday"); 
            break;
            case "Saturday": System.out.println("Today is Saturday"); 
            break;
            case "Sunday": System.out.println("Today is Sunday"); 
            break;
            default: System.out.println("Invalid day");
        }


    }
}
