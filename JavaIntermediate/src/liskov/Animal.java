package liskov;

public class Animal {
    public static void learnToFly(FlyingBird flyBird){
        flyBird.fly();
    }
}