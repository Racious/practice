package Beverage;

public class Yakult extends Topping {
    Beverage beverage;//宣告一個飲料型態的變數

    public Yakult(Beverage beverage){//把前一個飲料訂單的資訊放入
        this.beverage=beverage;
    }


    @Override
    public String getName() {
        return beverage.getName()+"+多多";//加上配料的名稱
    }

    public double getCost(){
        return beverage.getCost()+10;//加上配料的價錢
    }
}
