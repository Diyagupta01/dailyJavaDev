public class array_of_objects {
    public static void main(String[] args) {
       // food[] refrFoods = new food[3];

        food food1 = new food("Pizza");
        food food2 = new food("Hamburger");
        food food3 = new food("Hotdog");

        food[] refrFoods = {food1,food2,food3};

        // refrFoods[0] = food1;
        // refrFoods[1] = food2;
        // refrFoods[2] = food3;

        System.out.println(refrFoods[0].name);
        System.out.println(refrFoods[1].name);
        System.out.println(refrFoods[2].name);
    }
    }

