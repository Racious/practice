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
            int number = req.nextInt();
            //判斷選擇需求
            if (number == 1) {
                System.out.println("餘額 = " + acc1.Balance());
                acc1.Hello();
            } else if (number == 2) {
                //存錢
                acc1.savemoney(req);
                acc1.Hello();
            } else if (number == 3) {
                //提款
                acc1.getmoney(req);
                acc1.Hello();
            } else if (number == 4) {
                //結束程式
                req.close();
                break;
            } else {
                //無此項目
                System.out.println("無此項目 請再重試");
                acc1.Hello();
            }

        }

    }

}