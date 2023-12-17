public class Bus implements Car, Object{
    protected String carModel;
    protected String engineType;
    protected Double enginePower;
    protected Double carWeight;
    protected Integer carMileage;
    protected Integer numberOfPlaces;

    public Bus(){
        this.carModel = "Mercedes";
        this.engineType = "Diesel";
    }
    public Bus(String carModel, String engineType, Double enginePower, Double carWeight, Integer carMileage, Integer numberOfPlaces){
        this.carModel = carModel;
        this.engineType = engineType;
        this.enginePower = enginePower;
        this.carWeight = carWeight;
        this.carMileage = carMileage;
        this.numberOfPlaces = numberOfPlaces;
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
    public Integer getNumberOfPlaces(){
        return numberOfPlaces;
    }
    @Override
    public void startEngine () {
        System.out.println(this.getCarModel() + " с двигателем " + this.getEngineType() + " запущен и готов к перевозке пассажиров по маршрутным рейсам");
    }
    @Override
    public void print(){
        System.out.println("\nInformation about Bus class object");
        System.out.println("Car model: "+ this.getCarModel());
        System.out.println("Engine type: "+ this.getEngineType());
        System.out.println("Engine power: "+ this.getEnginePower());
        System.out.println("Car weight: "+ this.getCarWeight());
        System.out.println("Car mileage: "+ this.getCarMileage());
        System.out.println("Number of places: "+ this.getNumberOfPlaces());
    }
}
