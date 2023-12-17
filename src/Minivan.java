public class Minivan extends PassengerCar{
    public Minivan(String carModel, String engineType, Double enginePower, Double carWeight, Integer carMileage, Double fuelConsumptionPer100km, Double accelerationTimeTo100kmPerHour){
        super(carModel, engineType, enginePower, carWeight, carMileage, fuelConsumptionPer100km, accelerationTimeTo100kmPerHour);
    }
    @Override
    public void startEngine () {
        System.out.println("Минивэн "+this.getCarModel() + " с двигателем " + this.getEngineType() + " запущен и готов к перевозке пассажиров");
    }
    @Override
    public void print () {
        System.out.println("\nInformation about Minivan class object");
        System.out.println("Car model: "+ this.getCarModel());
        System.out.println("Engine type: "+ this.getEngineType());
        System.out.println("Engine power: "+ this.getEnginePower());
        System.out.println("Car weight: "+ this.getCarWeight());
        System.out.println("Car mileage: "+ this.getCarMileage());
        System.out.println("Fuel consumption per 100 km: "+this.getFuelConsumptionPer100km());
        System.out.println("Acceleration time to 100 km per hour: "+this.getAccelerationTimeTo100kmPerHour());;
    }
}
