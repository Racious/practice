package Movie_Theater;

import java.util.List;

public class Ticket {
    private int id;
    private String name;
    private double price;
    private int number;
    Calc calc=new Calc_Ticket();//介面窗口

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return  name +getNumber()+"張"+"\t共" + Math.round(price*getNumber())+"元";

    }
    //計算總額
    public double sumprice(List<Ticket> tickets){
        return calc.sum(tickets);
    }
    //顯示購物車
    public void display(List<Ticket> tickets) {
        calc.display(tickets);
    }
    //信用卡付款
    public double creditcard(List<Ticket> tickets) {
        return calc.creditcard(tickets);
    }
    //會員付款
    public double memberprice(List<Ticket> tickets) {
        return calc.memberprice(tickets);
    }
}
