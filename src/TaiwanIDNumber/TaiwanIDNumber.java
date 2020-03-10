package TaiwanIDNumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TaiwanIDNumber {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        IDCheck idCheck =new IDCheck();
        Greeting greeting = new Greeting();
        CreatId creatId=new CreatId();

        greeting.hello();
        while (choose.hasNext()){
            switch(choose.nextLine()){
                case "1":
                    creatId.build(idCheck,greeting);
                    greeting.hello();
                    break;
                case "2":
                    idCheck.idkeyin(greeting,choose);
                    greeting.hello();
                    break;
                case"3":
                    creatId.build(idCheck,greeting);
                    return;
                default:
                    System.out.println("無此服務唷 還請您再次確認\n");
                    greeting.hello();
                    break;
            }

        }

    }
}
