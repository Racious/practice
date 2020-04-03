package Movie_Theater;

import java.util.ArrayList;
import java.util.List;

public class Calc_Ticket implements Calc {

    @Override
    public void number(List<Ticket> tickets) {
        for (Ticket a : tickets) {//計算購買票數
            a.setNumber(a.getNumber() + 1);
        }
    }

    @Override
    public double sum(List<Ticket> tickets) {
        double c = 0;
        for (Ticket a : tickets) { //所有單價相加
            c = a.getPrice() + c;
        }
        return c;//總額
    }

    @Override
    public void display(List<Ticket> tickets) {//顯示幕前購買的品項及價錢總和
        //做一次票數加總
        number(tickets);
        List<Ticket> displayticket=new ArrayList<Ticket>(tickets);//複製一份購物車陣列
        //拿複製的陣列去計算，並把重複的品項刪掉
        for (int i = 0;i<displayticket.size()-1;i++){
            for (int j =displayticket.size()-1; j > i;j--){
                if (displayticket.get(j).equals(displayticket.get(i))) {
                    displayticket.remove(j);
                }
            }
        }
        for(Ticket a:displayticket){//顯示輸出
            System.out.println(a);
        }
    }

    @Override
    public double creditcard(List<Ticket> tickets) {
        double price=sum(tickets);
        price*=0.6;
        return price;
    }

    @Override
    public double memberprice(List<Ticket> tickets) {
        double price=sum(tickets);
        price*=0.8;
        return price;
    }


}


