package ATM;

import java.util.Scanner;

public class ATM {
    public static void main(String[] args) {
        //建立物件acc1
        Account acc1 = new Account(1000);
        //歡迎詞
        acc1.Hello();
        //請求輸入
        Scanner req = new Scanner(System.in);
        //判斷輸入
        while (req.hasNext()) {
            if (acc1.select(req.nextInt())) {
                req.close();
                return;
            }
        }
    }
}