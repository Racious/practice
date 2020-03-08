package Guess2;

import java.util.Random;
import java.util.Scanner;

//簡易猜數字
public class Guess2 {
    public static void main(String[] args) {
        System.out.println("猜數字! 請猜0~99的數字");
        //產生亂數0~99
        Random random = new Random();
        int x = random.nextInt(100);
        int max=99;
        int min=0;
        //答案
        System.out.println(x);
        //請求輸入
        Scanner req = new Scanner(System.in);
        while (req.hasNext())
        {
            //判斷大小
            int y = req.nextInt();
            if (y > x) {
                System.out.println("數字太大囉，再小一點");
                max=y;
                System.out.println("請猜"+min+"~"+max+"的數字");
            } else if (y < x) {
                System.out.println("數字太小囉，再大一點");
                min=y;
                System.out.println("請猜"+min+"~"+max+"的數字");
            } else if (x==y) {
                System.out.println("猜對了，真厲害");
                return;
            }
        }
    }
}
