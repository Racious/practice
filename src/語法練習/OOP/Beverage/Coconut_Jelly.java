package Beverage;

public class Coconut_Jelly extends Topping {
    Beverage beverage;//宣告一個飲料型態的變數

    public Coconut_Jelly(Beverage beverage) {//把前一個飲料訂單的資訊放入
        this.beverage=beverage;
    }

    @Override
    public String getName() {
        return beverage.getName()+"+椰果";//加上配料的名稱
    }
    public double getCost(){
        return beverage.getCost()+5;//加上配料的價錢
    }
}
