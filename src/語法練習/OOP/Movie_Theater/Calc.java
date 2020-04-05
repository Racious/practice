package Movie_Theater;

import java.util.List;

public interface Calc {
    double sum(List<Ticket> tickets);//計算總額
    void display(List<Ticket> tickets);//顯示購物車
    double creditCard(List<Ticket> tickets);//信用卡價格
    double memberPrice(List<Ticket> tickets);//會員價格
    void addToShoppingCart(List<Ticket> tickets,Ticket addTicket,int num);//加入購物車
}
