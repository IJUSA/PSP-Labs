public abstract class PassengerCar implements Car, Object{
    protected String carModel;
    protected String engineType;
    protected Double enginePower;
    protected Double carWeight;
    protected Integer carMileage;
    protected Double fuelConsumptionPer100km;
    protected Double accelerationTimeTo100kmPerHour;
    public PassengerCar(){
        this.carModel = "Bentley";
        this.engineType = "Diesel";
    }
    public PassengerCar(String carModel, String engineType, Double enginePower, Double carWeight, Integer carMileage, Double fuelConsumptionPer100km, Double accelerationTimeTo100kmPerHour){
        this.carModel = carModel;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.carWeight = carWeight;
        this.carMileage = carMileage;
        this.fuelConsumptionPer100km = fuelConsumptionPer100km;
        this.accelerationTimeTo100kmPerHour = accelerationTimeTo100kmPerHour;
    }
    public String getCarModel(){
        return carModel;
    }
    public String getEngineType(){
        return engineType;
    }
    public Double getEnginePower(){
        return enginePower;
    }
    public Double getCarWeight(){
        return  carWeight;
    }
    public Integer getCarMileage(){
        return  carMileage;
    }
    public Double getFuelConsumptionPer100km(){
        return fuelConsumptionPer100km;
    }
    public Double getAccelerationTimeTo100kmPerHour(){
        return accelerationTimeTo100kmPerHour;
    }
}
