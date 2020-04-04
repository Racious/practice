package Movie_Theater;

import java.util.ArrayList;
import java.util.List;

public class Calc_Ticket implements Calc {
    /**
     * 計算總額
     *
     * @param tickets 購物車清單
     * @return
     */
    @Override
    public double sum(List<Ticket> tickets) {
        double c = 0;
        for (Ticket a : tickets) {
            c += a.getNumber() * a.getPrice();
        }
        return c;//總額
    }

    /**
     * 顯示購物車內商品
     *
     * @param tickets 購物車清單
     */
    @Override
    public void display(List<Ticket> tickets) {
        for (Ticket a : tickets) {
            System.out.println(a);
        }
    }

    /**
     * 計算信用卡價格
     *
     * @param tickets 購物車清單
     * @return
     */
    @Override
    public double creditcard(List<Ticket> tickets) {
        double price = sum(tickets);
        price *= 0.6;
        return price;
    }

    /**
     * 計算會員價格
     *
     * @param tickets 購物車清單
     * @return
     */
    @Override
    public double memberprice(List<Ticket> tickets) {
        double price = sum(tickets);
        price *= 0.8;
        return price;
    }

    /**
     * 加入購物車
     *
     * @param tickets   購物車清單
     * @param addticket 購買商品
     */
    @Override
    public void addToShoppingCart(List<Ticket> tickets, Ticket addticket, int num) {

        for (Ticket origticket : tickets) {
            if (origticket.getId() == addticket.getId()) {
                origticket.setNumber(origticket.getNumber() + num);
                return;
            }
        }
        addticket.setNumber(addticket.getNumber() + num);
        tickets.add(addticket);
    }
}


