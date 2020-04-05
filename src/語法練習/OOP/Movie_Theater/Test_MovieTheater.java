package Movie_Theater;

import java.util.ArrayList;
import java.util.List;

public class Test_MovieTheater {

    public static void main(String[] args) {
        List<Ticket> tickets = new ArrayList<Ticket>();
        Ticket t0 = new Matinee();//早場票250
        Ticket t1 = new Full_Ticket();//全票300
        Ticket t2=  new Ticket(2,"半票",260);
        //增加訂單
        t0.addToShoppingCart(tickets, t0,4);  t0.addToShoppingCart(tickets, t1,5);
        t0.addToShoppingCart(tickets,t2,8);   t0.addToShoppingCart(tickets,t2,1);
        t0.addToShoppingCart(tickets, t1,6);  t0.addToShoppingCart(tickets,t0,3);
        //顯示購物車
        t0.display(tickets);
        double sumPrice = t0.sumPrice(tickets);
        System.out.println("總額是:\t" + Math.round(sumPrice) + "元");
        System.out.println("==================================");
        //使用信用卡付款
        double creditCard = t0.creditCard(tickets);
        System.out.println("若您使用的是信用卡付款，享有6折優惠");
        System.out.println("一共是" + Math.round(creditCard) + "元");
        System.out.println("==================================");
        //電信小額付費
        System.out.println("若您使用的是電信小額付款");
        System.out.println("一共是" + Math.round(sumPrice) + "元");
        System.out.println("==================================");
        //會員儲值卡
        double memberPrice = t0.memberPrice(tickets);
        System.out.println("若您使用的是專屬會員卡付款，享有8折優惠");
        System.out.println("一共是" + Math.round(memberPrice) + "元");
    }


}

