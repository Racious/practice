package Movie_Theater;

import java.util.List;

public interface Calc {
    void number(List<Ticket> tickets);//計算票數
    double sum(List<Ticket> tickets);//計算總額
    void display(List<Ticket> tickets);//顯示購物車
    double creditcard(List<Ticket> tickets);//信用卡價格
    double memberprice(List<Ticket> tickets);//會員價格
}
