package Guess;

import java.util.Random;
import java.util.Scanner;

//幾A幾B 猜輸字程式
public class Guess {

    public static void main(String[] args) {

        //產生隨機數字
        int ansseat[] = new int[4];
        //產生亂數名為ans
        Random ans = new Random();
        //建立x用來存放產生的亂數
        int x;
        for (int j = 0; j < 4; j++) {
            do {
                x = ans.nextInt(10);
                //判斷產生的亂數使否有重複
            } while (x == ansseat[0] || x == ansseat[1] || x == ansseat[2] || x == ansseat[3]);
            //若沒重複將亂數放入陣列位子j
            ansseat[j] = x;
            //按順序顯示產生的亂數(答案)
            //System.out.print(ansseat[j]);
        }
        //亂數的答案
        System.out.println("答案:" + ansseat[0] + ansseat[1] + ansseat[2] + ansseat[3]);
        System.out.println("\n");        //輸入數字
        //GOOD Bad 等於A B數量
        int Good;
        int Bad;
        Scanner req = new Scanner(System.in);
        while (req.hasNext()) {
            String s = req.nextLine();
            int[] ary = new int[s.length()]; // 宣告一個整數陣列，長度為字串 s 的長度
            //判斷輸入的長度
            switch (ary.length) {
                case 4:
                    for (int i = 0; i < s.length(); i++) { // 利用迴圈，依序讀取字串 s 中的每一個字元
                        String s2 = s.substring(i, i + 1); // 利用 substring() 來捉每一個字元
                        ary[i] = Integer.parseInt(s2); // 將捉到的字元轉為整數，存入陣列
                    }
                    //判斷輸入的字是否有重複
                    if (ary[0] == ary[1] || ary[0] == ary[2] || ary[0] == ary[3] || ary[1] == ary[2] || ary[1] == ary[3] || ary[2] == ary[3]) {
                        System.out.println("輸入的字有重複唷！");
                    } else {
                        //判斷是否輸入4個數字
                        switch (ary.length) {
                            case 4:
                                //重置AB數
                                Good = 0;
                                Bad = 0;
                                //判斷AB數量
                                for (int i = 0; i < 4; i++) {
                                    for (int j = 0; j < 4; j++) {
                                        if (j == i) {
                                            if (ary[i] == ansseat[j]) {
                                                Good = Good + 1;
                                            }
                                        } else if (ary[i] == ansseat[j]) {
                                            Bad = Bad + 1;
                                        }
                                    }
                                }
                                //輸出顯示幾A幾B
                                System.out.println(Good + "A" + Bad + "B");
                                //若4A 結束遊戲
                                if (Good == 4) {
                                    System.out.println("恭喜猜對了！！");
                                    req.close();
                                    return;
                                } else {
                                    System.out.println("好可惜 再試試看");
                                }
                        }
                    }
                    break;
                //若輸入的數字不是4個
                default:
                    System.out.println("輸入的長度不對唷！");
                    break;
            }
        }
    }
}