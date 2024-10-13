public class Friend {
  
    String name;
    static int numfriends;

     Friend(String name){
        this.name = name;
        numfriends++;
    }

    static void  display(){
        System.out.println("Number of friends: " + numfriends);
    }
}
