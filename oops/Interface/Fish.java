public class Fish implements Prey,Predator{

    @Override
    public void hunt() {
        System.out.println("This fish in hunting smaller fishes.");
    }

    @Override
    public void flee() {
        System.out.println("This fish is being fleed from larger fishes.");
    }

    
    
}
