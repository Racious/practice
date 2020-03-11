package TaiwanIDNumber;

import java.util.Random;
//身分證產生器
public class CreatId {
    //身分證出生地
    char[] city = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'
            , 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    Random random = new Random();
    int idnumber;
    int select;
    String id;
    //隨機產生身分證
    public void build(IDCheck idCheck, Greeting greeting) {
        //亂數26個，隨機首字字母(出生地)
        int firstid = random.nextInt(26);
        //將對應的數字帶入陣列，並傳回該陣列的值轉換給id字串
        String id = String.valueOf(city[firstid]);
        //第二個字，隨機男性或女性
        for (int j = 0; j < 1; j++) {
            idnumber = 1 + random.nextInt(2);
            id = id + Integer.toString(idnumber);
        }
        //後8個數字
        for (int i = 0; i < 8; i++) {
            idnumber = random.nextInt(10);
            id = id + Integer.toString(idnumber);
        }
        //將產生的ID進行確認
        select=1;
        int ary[] = idCheck.correctid(id, greeting,select);
        //尾數修正
        id = id.substring(0, id.length() - 1);
        id = id + Integer.toString(ary[9]);
        greeting.ramdomid(id, ary);
    }
}
