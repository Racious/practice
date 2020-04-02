package Beverage;

public class Test_Beverage {
    public static void main(String[] args) {
        Beverage drink1=new Black_Tea();//訂單1 只點紅茶
        System.out.println(drink1.getName()+" "+drink1.getCost()+"元");

        Beverage drink2=new Black_Tea();//訂單2 紅茶
        drink2=new Tapioca_Ball(drink2);//配料珍珠
        System.out.println(drink2.getName()+" "+drink2.getCost()+"元");

        Beverage drink3=new Milk_Tea();//訂單3 奶茶
        drink3=new Tapioca_Ball(drink3);//配料珍珠
        drink3=new Yakult(drink3);//配料多多
        System.out.println(drink3.getName()+" "+drink3.getCost()+"元");

        Beverage drink4=new Green_Tea();//訂單3 綠茶
        drink4=new Tapioca_Ball(drink4);//配料珍珠
        drink4=new Coconut_Jelly(drink4);//配料椰果
        drink4=new Taro_Balls(drink4);//配料芋園
        System.out.println(drink4.getName()+" "+drink4.getCost()+"元");
        System.out.println();
    }
}
/*飲料店練習
* 茶類:紅茶(Black_Tea)25元       綠茶(Green_Tea)25元   奶茶(Milk_Tea)30元
* 配料:珍珠(Tapioca_Ball)10元    多多(Yakult)10元      椰果(Coconut_Jelly)5元      芋園(Taro_Balls)5元
* 自行配料後加總計算價格及購買的品項
* */