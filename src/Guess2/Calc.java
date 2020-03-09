package Guess2;

public class Calc {
    int max=99;
    int min=0;

    public  boolean play(int y,int x){
        if (y > x) {
            System.out.println("數字太大囉，再小一點");
            if(max>y){
                max=y;
            }
            System.out.println("請猜"+min+"~"+max+"的數字");
        } else if (y < x) {
            System.out.println("數字太小囉，再大一點");
            if(min<y){
                min=y;
            }
            System.out.println("請猜"+min+"~"+max+"的數字");
        } else if (x==y) {
            System.out.println("猜對了，真厲害");
            //表示猜對，可結束程式
            return true;
        }
        return false;
    }
}
