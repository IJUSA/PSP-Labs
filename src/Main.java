public class Main {
    public static void main(String[] args) {
        Pickup pickup1 = new Pickup("Hyundai", "Diesel", 100.0, 990.0, 10000, 10.0, 1.9);
        Minivan minivan1 = new Minivan("Mersedes", "Carburetor", 120.0, 870.0, 15000, 9.0, 3.5);
        FreightCar freightCar1 = new FreightCar("Ural", "Diesel", 580.0, 2880.0, 8000, 2.4, "Opened");
        Bus bus1 = new Bus("Bentley", "Carburetor", 520.0, 2070.0, 10200, 40);

        pickup1.startEngine();
        minivan1.startEngine();
        freightCar1.startEngine();
        bus1.startEngine();

        pickup1.print();
        minivan1.print();
        freightCar1.print();
        bus1.print();
    }
}
