package TaiwanIDNumber;

import java.util.Scanner;
//確認ID
public class IDCheck {
    //ID組成規則
    String idpattern = "[A-Za-z][1-2][0-9]{8}";
    String id;
    //出生地
    String location;
    //陣列 放身分證字號
    int ary[] = new int[10];
    //換算英文字的數字
    int digit = 0;
    int tensdigit = 0;
    int firstletter = 0;
    int sum;
    //判斷輸入的ID是否符合身分證編碼規則
    public void idkeyin(Greeting greeting, Scanner choose) {
        greeting.myid();
        while (choose.hasNext()) {
            id = choose.nextLine().toUpperCase();
            //符合的話就開始計算是否為有效ID
            if (id.matches(idpattern)) {
                correctid(id, greeting);
                return;
            } else {
                System.out.println("格式錯誤唷，請在確認");
                greeting.myid();
            }
        }

    }
    //驗證是否為有效ID
    public void correctid(String id, Greeting greeting) {
        sum = 0;
        digit = 0;
        sum = 0;
        // 利用迴圈，依序讀取字串的每一個字元
        for (int i = 1; i < id.length(); i++) {
            // 將捉到的字元轉為整數，存入陣列
            ary[i] = Integer.parseInt(id.substring(i, i + 1));
        }
        //將字母轉換成數字並計算總合
        switch (id.substring(0, 1)) {
            case "A":
                ary[0] = 10;
                location = "臺北市";
                break;
            case "B":
                ary[0] = 11;
                location = "臺中市";
                break;
            case "C":
                ary[0] = 12;
                location = "基隆市";
                break;
            case "D":
                ary[0] = 13;
                location = "臺南市";
                break;
            case "E":
                ary[0] = 14;
                location = "高雄市";
                break;
            case "F":
                ary[0] = 15;
                location = "新北市";
                break;
            case "G":
                ary[0] = 16;
                location = "宜蘭縣";
                break;
            case "H":
                ary[0] = 17;
                location = "桃園市";
                break;
            case "I":
                ary[0] = 34;
                location = "嘉義市";
                break;
            case "J":
                ary[0] = 18;
                location = "新竹縣";
                break;
            case "K":
                ary[0] = 19;
                location = "苗栗縣";
                break;
            case "L":
                ary[0] = 20;
                location = "台中縣";
                break;
            case "M":
                ary[0] = 21;
                location = "南投縣";
                break;
            case "N":
                ary[0] = 22;
                location = "彰化縣";
                break;
            case "O":
                ary[0] = 35;
                location = "新竹市";
                break;
            case "P":
                ary[0] = 23;
                location = "雲林縣";
                break;
            case "Q":
                ary[0] = 24;
                location = "嘉義縣";
                break;
            case "R":
                ary[0] = 25;
                location = "臺南縣";
                break;
            case "S":
                ary[0] = 26;
                location = "高雄縣";
                break;
            case "T":
                ary[0] = 27;
                location = "屏東縣";
                break;
            case "U":
                ary[0] = 28;
                location = "花蓮縣";
                break;
            case "V":
                ary[0] = 29;
                location = "臺東縣";
                break;
            case "W":
                ary[0] = 32;
                location = "金門縣";
                break;
            case "X":
                ary[0] = 30;
                location = "澎湖縣";
                break;
            case "Y":
                ary[0] = 31;
                location = "陽明山管理局";
                break;
            case "Z":
                ary[0] = 33;
                location = "連江縣";
                break;
        }
        tensdigit = (ary[0] / 10);
        digit = (ary[0] % 10);
        firstletter = tensdigit + (digit * 9);
        for (int j = 1; j < 9; j++) {
            sum = sum + (ary[j] * (9 - j));
        }
        sum = sum + firstletter + ary[9];
        //System.out.println(sum);
        //如果餘數為0，則為有效身分證
        if (sum % 10 == 0) {
            greeting.yes(location, ary);
        }
        else {
            greeting.no();
        }
    }


    //隨機產生身分證
    public int[] ramdomid(String id, Greeting greeting) {
        sum = 0;
        digit = 0;
        sum = 0;
        for (int i = 1; i < id.length(); i++) { // 利用迴圈，依序讀取字串的每一個字元
            ary[i] = Integer.parseInt(id.substring(i, i + 1)); // 將捉到的字元轉為整數，存入陣列
        }
        switch (id.substring(0, 1)) {
            case "A":
                ary[0] = 10;
                location = "臺北市";
                break;
            case "B":
                ary[0] = 11;
                location = "臺中市";
                break;
            case "C":
                ary[0] = 12;
                location = "基隆市";
                break;
            case "D":
                ary[0] = 13;
                location = "臺南市";
                break;
            case "E":
                ary[0] = 14;
                location = "高雄市";
                break;
            case "F":
                ary[0] = 15;
                location = "新北市";
                break;
            case "G":
                ary[0] = 16;
                location = "宜蘭縣";
                break;
            case "H":
                ary[0] = 17;
                location = "桃園市";
                break;
            case "I":
                ary[0] = 34;
                location = "嘉義市";
                break;
            case "J":
                ary[0] = 18;
                location = "新竹縣";
                break;
            case "K":
                ary[0] = 19;
                location = "苗栗縣";
                break;
            case "L":
                ary[0] = 20;
                location = "台中縣";
                break;
            case "M":
                ary[0] = 21;
                location = "南投縣";
                break;
            case "N":
                ary[0] = 22;
                location = "彰化縣";
                break;
            case "O":
                ary[0] = 35;
                location = "新竹市";
                break;
            case "P":
                ary[0] = 23;
                location = "雲林縣";
                break;
            case "Q":
                ary[0] = 24;
                location = "嘉義縣";
                break;
            case "R":
                ary[0] = 25;
                location = "臺南縣";
                break;
            case "S":
                ary[0] = 26;
                location = "高雄縣";
                break;
            case "T":
                ary[0] = 27;
                location = "屏東縣";
                break;
            case "U":
                ary[0] = 28;
                location = "花蓮縣";
                break;
            case "V":
                ary[0] = 29;
                location = "臺東縣";
                break;
            case "W":
                ary[0] = 32;
                location = "金門縣";
                break;
            case "X":
                ary[0] = 30;
                location = "澎湖縣";
                break;
            case "Y":
                ary[0] = 31;
                location = "陽明山管理局";
                break;
            case "Z":
                ary[0] = 33;
                location = "連江縣";
                break;
        }

        tensdigit = (ary[0] / 10);
        digit = (ary[0] % 10);
        firstletter = tensdigit + (digit * 9);
        for (int j = 1; j < 9; j++) {
            sum = sum + (ary[j] * (9 - j));
        }
        sum = sum + firstletter;
        if (sum % 10 == 0) {
            ary[9]=0;
            return ary;
        }
        else {
            int x=10-(sum%10);
            ary[9]=x;
            return ary;
        }
    }
}