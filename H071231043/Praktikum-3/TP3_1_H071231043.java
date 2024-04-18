class Driver {
    String name;
    int age;
    Vehicle primaryVehicle;
    
    Driver(String name, int age) {
        this.name = name;
        this.age = age;
        this.primaryVehicle = null;
    }

    Driver(String name, int age, Vehicle primaryVehicle) {
        this.name = name;
        this.age = age;
        this.primaryVehicle = primaryVehicle;
    }

    void drive (Vehicle vehicle) {
        this.primaryVehicle = vehicle;
    }

    void transportPassengers (int numberOfPassengers) {
        if (this.primaryVehicle != null && numberOfPassengers <= this.primaryVehicle.passengerCapacity) {
            System.out.println("==================================");
            System.out.println("Driver name         : " + this.name);
            System.out.println("Driver age          : " + this.age );
            System.out.println("Vehicle type        : " + this.primaryVehicle.type);
            System.out.println("Passenger Capacity  : " + this.primaryVehicle.passengerCapacity);
        } else {
            System.out.println("==================================");
            System.out.println("Kendaraan tidak tersedia atau jumlah penumpang melebihi kapasitas kendaraan");
        }
    }
}

class Vehicle {
    String type;
    int passengerCapacity;

    Vehicle (String type, int passengerCapacity){
        this.type = type;
        this.passengerCapacity = passengerCapacity;
    }
}

public class TP3_1_H071231043 {
    public static void main(String[] args) {
        
        Vehicle car = new Vehicle("car", 6);
        Vehicle bus = new Vehicle("bus", 30);

        Driver driver1 = new Driver ("Budi" , 30, car);
        Driver driver2 = new Driver("Andi", 28);
        driver2.drive(bus);

        driver1.transportPassengers(7);
        driver2.transportPassengers(30);
    }
}