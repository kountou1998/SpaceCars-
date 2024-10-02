package ihu.students.spacecars;

public class CarsSearchModel {
    Integer carsID;
    String make, model;
    Integer year, price;

    public CarsSearchModel(Integer carsID, String make, String model, Integer year, Integer price) {
        this.carsID = carsID;
        this.make = make;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Integer getCarsID() {
        return carsID;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public Integer getYear() {
        return year;
    }

    public Integer getPrice() {
        return price;
    }

    public void setCarsID(Integer carsID) {
        this.carsID = carsID;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
