public class Main {
    public static void main(String[] args) {
        
        Smartphone smartphone = new Smartphone(1000000, "Iphone");
        Car car = new Car(100, "Hitam", 20);
        Bulldog bulldog = new Bulldog(3, 20);

        smartphone.move();
        car.move();
        bulldog.move();
        bulldog.describe();
    }
    
}
