package lv1_interfaces;

public class Car implements Sortable<Car> {

    private String carType;
    private int productionYear;
    private int drivenKilometer;

    public Car(String carType, int productionYear, int drivenKilometer){
        this.carType = carType;
        this.productionYear = productionYear;
        this.drivenKilometer = drivenKilometer;
    }

    @Override
    public int sort(Car s) {
        if (this.getProductionYear() == s.getProductionYear()){
            return 0;
        }
        if (this.getProductionYear() < s.getProductionYear()){
            return -1;
        }
        else {
            return 1;
        }
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(int productionYear) {
        this.productionYear = productionYear;
    }

    public int getDrivenKilometer() {
        return drivenKilometer;
    }

    public void setDrivenKilometer(int drivenKilometer) {
        this.drivenKilometer = drivenKilometer;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType='" + carType + '\'' +
                ", productionYear=" + productionYear +
                ", drivenKilometer=" + drivenKilometer +
                '}';
    }
}
