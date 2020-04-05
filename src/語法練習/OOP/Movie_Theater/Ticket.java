package Movie_Theater;

import java.util.List;

public class Ticket {
    private int id;
    private String name;
    private double price;
    private int number=0;
    Calc calc=new Calc_Ticket();//透過介面宣告變數

    public Ticket() {
    }

    public Ticket(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

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

    /**
     * 商品加入購物車
     * @param tickets   購物車清單
     * @param addTicket 購買的商品
     */
    public void addToShoppingCart(List<Ticket> tickets,Ticket addTicket,int num){
        if(num!=0){
            calc.addToShoppingCart(tickets,addTicket,num);
        }

    }

    /**
     *計算總額
     * @param tickets   購物車清單
     * @return  總額
     */
    public double sumPrice(List<Ticket> tickets){
        return calc.sum(tickets);
    }

    /**
     * 顯示購物車資訊
     * @param tickets   購物車清單
     */
    public void display(List<Ticket> tickets) {
        calc.display(tickets);
    }

    /**
     * 信用卡付款
     * @param tickets   購物車清單
     * @return  總額
     */
    public double creditCard(List<Ticket> tickets) {
        return calc.creditCard(tickets);
    }

    /**
     * 會員付款
     * @param tickets   購物車清單
     * @return  總額
     */
    public double memberPrice(List<Ticket> tickets) {
        return calc.memberPrice(tickets);
    }
}
