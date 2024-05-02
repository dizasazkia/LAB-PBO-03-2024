public class Car implements IMove {
    int totalForwardGear;
    String color;
    int maxSpeed;

    Car(int totalForwardGear, String color, int maxSpeed){
        this.totalForwardGear = totalForwardGear;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    public void move(){
        System.out.println("Mobil sedang berakselerasi");
    }
    
}
