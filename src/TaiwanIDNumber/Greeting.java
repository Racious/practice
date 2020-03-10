package TaiwanIDNumber;

public class Greeting {

    //歡迎詞
    public void hello() {
        System.out.println("您好，請問要選擇什麼服務呢？\n" + "1. 隨機產生身分證\n" + "2. 驗證身分證\n" + "3. 離開");
    }
    //輸入要確認的身分證
    public void myid() {
        System.out.println("請輸入要確認的身分證字號");
    }
    //確認為有效的身分證字號
    public void yes(String location, int[] ary) {
        if (ary[1] == 1) {
            System.out.println("你的身分證正確 " + "出生"+location+" 男性\n");
        } else {
            System.out.println("你的身分證正確 " + "出生"+location+" 女性\n");
        }

    }
    //無效的身分證字號
    public void no() {
        System.out.println("不好意思 你輸入的身分證號碼是錯的\n");
    }
    //隨機產生的身分證
    public void ramdomid(String id,int[] ary) {
        if (ary[1] == 1) {
            System.out.println("你的身分證字號為 "+id+" 男性\n");
        } else {
            System.out.println("你的身分證字號為 "+id+" 女性\n");
        }

    }

}