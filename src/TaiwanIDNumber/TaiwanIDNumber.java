package TaiwanIDNumber;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TaiwanIDNumber {
    public static void main(String[] args) {
        Scanner choose = new Scanner(System.in);
        IDCheck idCheck =new IDCheck();
        Greeting greeting = new Greeting();

        greeting.hello();
        while (choose.hasNext()){
            switch(choose.nextLine()){
                case "1":
                    System.out.println("1");
                    greeting.hello();
                    break;
                case "2":
                    idCheck.idkeyin(greeting,choose);
                    break;
                default:
                    return;
            }




        }


        String pattern = "[A-Za-z][0-1][0-9]{8}";
        String idn = "C12356789";
        System.out.println(idn +" is "+Pattern.matches(pattern, idn));
        if(idn.matches(pattern))
            System.out.println("格式正確");
    }
}
