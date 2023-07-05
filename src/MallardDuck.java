public class MallardDuck extends Duck{
    MallardDuck(){
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    @Override
    public void display() {
        System.out.println("I am a real MallardDuck");
    }
}
