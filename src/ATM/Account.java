package ATM;

import java.util.Scanner;

public class Account {
    //餘額
    private int money;

    public Account(int creatAcc) {
        money = creatAcc;
    }

    //查看餘額
    public int Balance() {
        return money;
    }

    //存錢
    public void savemoney(int number) {
        //餘額+存入金額
        money += number;
        System.out.println("餘額 = " + this.money);
    }

    //歡迎詞
    public void Hello() {
        System.out.println("\n請問要做什麼呢?\n" + "1. 查詢餘額\n" + "2. 存錢\n" + "3. 提款\n" + "4. 離開");
    }

    //提款
    public void getmoney(int number) {
        //判斷提款金額是否大於存款
        if (money < number) {
            System.out.println("餘額不足唷");
        } else {
            money -= number;
            System.out.println("餘額 = " + this.money);
        }

    }
    //服務選擇
    public boolean select(int number) {
        //判斷選擇需求
        Scanner req = new Scanner(System.in);
            //查詢餘額
        if (number == 1) {
            System.out.println("餘額 = " + Balance());
            Hello();
        } else if (number == 2) {
            //存錢
            System.out.println("請輸入存款金額");
            savemoney(req.nextInt());
            Hello();
        } else if (number == 3) {
            //提款
            System.out.println("請輸入提款金額");
            getmoney(req.nextInt());
            Hello();
        } else if (number == 4) {
            //結束程式
            req.close();
            return true;
        } else {
            //無此項目
            System.out.println("無此項目 請再重試");
            Hello();
        }
        return false;
    }
}
