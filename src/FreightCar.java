public class FreightCar implements Car, Object{
    protected String carModel;
    protected String engineType;
    protected Double enginePower;
    protected Double carWeight;
    protected Integer carMileage;
    protected Double liftingCapacityInTons;
    protected String bodyType;

    public FreightCar(){
        this.carModel = "Ural";
        this.engineType = "Diesel";
        this.bodyType = "Opened";
    }
    public FreightCar(String carModel, String engineType, Double enginePower, Double carWeight, Integer carMileage, Double liftingCapacityInTons, String bodyType){
        this.carModel = carModel;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.carWeight = carWeight;
        this.carMileage = carMileage;
        this.liftingCapacityInTons = liftingCapacityInTons;
        this.bodyType = bodyType;
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
    public Double getLiftingCapacityInTons(){
        return liftingCapacityInTons;
    }
    public String getBodyType(){
        return bodyType;
    }
    @Override
    public void startEngine(){
        System.out.println(this.getCarModel() + " с двигателем " + this.getEngineType() + " запущен и готов к перевозке грузов");
    }
    @Override
    public void print(){
        System.out.println("\nInformation about FreightCar class object");
        System.out.println("Car model: "+ this.getCarModel());
        System.out.println("Engine type: "+ this.getEngineType());
        System.out.println("Engine power: "+ this.getEnginePower());
        System.out.println("Car weight: "+ this.getCarWeight());
        System.out.println("Car mileage: "+ this.getCarMileage());
        System.out.println("Lifting capacity in tons: "+ this.getLiftingCapacityInTons());
        System.out.println("Body type: "+ this.getBodyType());
    }
}
