package Beverage;

public abstract class Beverage {
    private String name;//產品名稱
    private double cost;//價錢

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }
}
