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
        //答案
        //System.out.println(x);

        //請求輸入
        Scanner req = new Scanner(System.in);
        Calc ans = new Calc();
        while (req.hasNext()) {
            //判斷大小
            int y = req.nextInt();
            //將亂數值x及猜測值y後送play方法計算，並傳回布林值
            if (ans.play(y, x)) {
                return;
            }
        }
    }
}