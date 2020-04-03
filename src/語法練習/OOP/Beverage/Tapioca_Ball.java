package Beverage;

public class Tapioca_Ball extends Topping {
    Beverage beverage;//宣告一個飲料型態的變數

    public Tapioca_Ball(Beverage beverage) {//把前一個飲料訂單的資訊放入
        this.beverage = beverage;
    }

    /**
     * 先前點的飲料加上此配料
     * @return
     */
    @Override
    public String getName() {
        return beverage.getName()+"+珍珠";//加上配料的名稱
    }
    public double getCost(){
        return beverage.getCost()+10;//加上配料的價錢
    }
}
