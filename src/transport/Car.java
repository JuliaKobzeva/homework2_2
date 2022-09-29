package transport;

import java.time.LocalDate;

public class Car {

    public static class Key{
        private boolean remoteEngineStart;
        private boolean keylessAccess;

        public Key(boolean remoteEngineStart, boolean keylessAccess) {
            this.remoteEngineStart = remoteEngineStart;
            this.keylessAccess = keylessAccess;
        }

       public Key() {
            this(false, false);
       }

        @Override
        public String toString() {
            return remoteEngineStart + " " + keylessAccess;
        }
    }

    public class Insurance{
        private LocalDate insuranceValidityPeriod;
        private double insuranceCost;
        private String insuranceNumber;

        public Insurance(LocalDate insuranceValidityPeriod, double insuranceCost, String insuranceNumber) {

            if(insuranceValidityPeriod == null){
                this.insuranceValidityPeriod = LocalDate.now().plusDays(365);
            } else {
                this.insuranceValidityPeriod = insuranceValidityPeriod;
            }

            if(insuranceCost < 0){
                this.insuranceCost = Math.abs(insuranceCost);
            }else this.insuranceCost = insuranceCost;

            if(insuranceNumber.length() != 9){
                System.out.println("Номер страховки некорректный.");
            }else this.insuranceNumber = insuranceNumber;
        }

        public Insurance(){
            this(null,10_000, "123456789");
        }

        public LocalDate getInsuranceValidityPeriod() {
            return insuranceValidityPeriod;
        }

        public void setInsuranceValidityPeriod(LocalDate insuranceValidityPeriod) {
            this.insuranceValidityPeriod = insuranceValidityPeriod;
        }

        public double getInsuranceCost() {
            return insuranceCost;
        }

        public void setInsuranceCost(double insuranceCost) {
            this.insuranceCost = insuranceCost;
        }

        public String getInsuranceNumber() {
            return insuranceNumber;
        }

        public void setInsuranceNumber(String insuranceNumber) {
            this.insuranceNumber = insuranceNumber;
        }

        public void checkInsuranceValidityPeriod(){
            if(insuranceValidityPeriod.isBefore(LocalDate.now()) || insuranceValidityPeriod.isEqual(LocalDate.now())){
                System.out.println("Нужно срочно оформить новую страховку.");
            }
        }

        @Override
        public String toString() {
            return insuranceValidityPeriod + " " + insuranceCost + " " + insuranceNumber;
        }
    }

    private Key key;

    private Insurance insurance;
    private String brand;
    private String model;
    private double engineVolume;
    private String color;
    private int productionYear;
    private String productionCountry;

    private String transmission;

    private String bodyType;

    private String registrationNumber;

    private int numberOfSeats;

    private String summerOrWinterTires;


    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry,
               String transmission, String bodyType,  String registrationNumber,  int numberOfSeats, String summerOrWinterTires,
               Key key, Insurance insurance){
        if(brand == null || brand.isEmpty() || brand.isBlank()){
            this.brand = "default";
        }else this.brand = brand;

        if(model == null || model.isEmpty() || model.isBlank()){
            this.model = "default";
        }else this.model = model;

        if(engineVolume == 0){
            this.engineVolume = 1.5;
        }else this.engineVolume = engineVolume;

        if(color == null || color.isEmpty() || color.isBlank()){
            this.color = "белый";
        }else this.color = color;

        if(productionYear == 0){
            this.productionYear = 2000;
        }else this.productionYear = productionYear;

        if(productionCountry == null || productionCountry.isEmpty() || productionCountry.isBlank()){
            this.productionCountry = "default";
        }else this.productionCountry = productionCountry;

        if(transmission == null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "default";
        }else this.transmission = transmission;

        if(bodyType == null || bodyType.isEmpty() || bodyType.isBlank()){
            this.bodyType = "default";
        }else this.bodyType = bodyType;

        if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
            this.registrationNumber = "default";
        }else this.registrationNumber = registrationNumber;

        if(numberOfSeats < 0){
            this.numberOfSeats = Math.abs(numberOfSeats);
        }else this.numberOfSeats = numberOfSeats;

        if(summerOrWinterTires == null || summerOrWinterTires.isEmpty() || summerOrWinterTires.isBlank()){
            this.summerOrWinterTires = "default";
        }else this.summerOrWinterTires = summerOrWinterTires;

        if(key == null){
            this.key = new Key();
        }else this.key = key;

        if(key == null){
        this.insurance = new Insurance();
        }else this.insurance = insurance;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getBodyType() {
        return bodyType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        if(engineVolume == 0){
            this.engineVolume = 1.5;
        }else this.engineVolume = engineVolume;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if(color == null || transmission.isEmpty() || transmission.isBlank()){
            this.color = "белый";
        }else this.color = color;
    }

    public String getTransmission() {
        return transmission;
    }

    public void setTransmission(String transmission) {
        if(transmission == null || transmission.isEmpty() || transmission.isBlank()){
            this.transmission = "default";
        }else this.transmission = transmission;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        if(registrationNumber == null || registrationNumber.isEmpty() || registrationNumber.isBlank()){
            this.registrationNumber = "default";
        }else this.registrationNumber = registrationNumber;
    }

    public String getSummerOrWinterTires() {
        return summerOrWinterTires;
    }

    public void setSummerOrWinterTires(String summerOrWinterTires) {
        if(summerOrWinterTires == null || summerOrWinterTires.isEmpty() || summerOrWinterTires.isBlank()){
            this.summerOrWinterTires = "default";
        }else this.summerOrWinterTires = summerOrWinterTires;
    }

    public Key getKey() {
        return key;
    }

    public void setKey(Key key) {
        this.key = key;
    }

    public Insurance getInsurance() {
        return insurance;
    }

    public void setInsurance(Insurance insurance) {
        this.insurance = insurance;
    }

    @Override
    public String toString() {
        return brand + " " + model + ", объем двигателя: " + engineVolume + " литра, цвет кузова: " + color + ", год выпуска: " +
                productionYear + ", страна сборки: " + productionCountry + ", коробка передач: " + transmission + ", тип кузова: " +
                bodyType + ", регистрационный номер: " + registrationNumber + ", количество мест: " + numberOfSeats + ", тип резины: "
                + summerOrWinterTires;
    }

    public void changeTires(Car car){
        if(summerOrWinterTires == "летняя"){
            setSummerOrWinterTires("зимняя");
        } else {
            setSummerOrWinterTires("летняя");
        }
    }

    public boolean isCorrectRegNumber(){
        //x000xx000
        if(registrationNumber.length() != 9){
            return false;
        }
        char[]chars = registrationNumber.toCharArray();
        if(!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])){
            return false;
        }
        if(!Character.isDigit(chars[1]) || !Character.isDigit(chars[2]) || !Character.isDigit(chars[3]) ||
                !Character.isDigit(chars[6]) || !Character.isDigit(chars[7]) || !Character.isDigit(chars[8])){
            return false;
        }
        return true;
    }
}
