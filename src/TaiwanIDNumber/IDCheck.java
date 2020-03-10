package TaiwanIDNumber;

import java.util.Scanner;

public class IDCheck {
    String idpattern = "[A-Za-z][1-2][0-9]{8}";
    String id;
    int ary[];

    public void idkeyin(Greeting greeting,Scanner choose) {
        greeting.myid();
        while (choose.hasNext()) {
            id = choose.nextLine().toUpperCase();
            if (id.matches(idpattern)) {
                correctid(id);
            } else {
                System.out.println("格式錯誤唷，請在確認");
                greeting.myid();
            }
        }

    }

public void correctid(String id){
    System.out.println(id);
//    for (int i = 1; i < id.length(); i++) { // 利用迴圈，依序讀取字串 s 中的每一個字元
//      ary[i] = Integer.parseInt(id.substring(i, i + 1)); // 將捉到的字元轉為整數，存入陣列
    }
}

