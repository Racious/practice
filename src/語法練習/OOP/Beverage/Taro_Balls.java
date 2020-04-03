package Beverage;

public class Taro_Balls extends Topping{
    Beverage beverage;//宣告一個飲料型態的變數

    public Taro_Balls(Beverage beverage) {//把前一個飲料訂單的資訊放入
        this.beverage=beverage;
    }

    /**
     * 先前點的飲料加上此配料
     * @return
     */
    @Override
    public String getName() {
        return beverage.getName()+"+芋圓";//加上配料的名稱
    }

    public double getCost(){
        return beverage.getCost()+5;//加上配料的價錢
    }
}
