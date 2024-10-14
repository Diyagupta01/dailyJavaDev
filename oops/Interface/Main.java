public class Main {
    public static void main(String[] args) {
        Fish smallFish = new Fish();
        Fish bigFish = new Fish();
        Hawk hawk = new Hawk();
        Rabbit rabbit = new Rabbit();

        smallFish.flee();
        bigFish.hunt();
        hawk.hunt();
        rabbit.flee();
    }
}
