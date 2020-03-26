package Taiwan_Id_check2;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        IdCheck check=new IdCheck();
        String id="A123123123";
        String phone="0956551561";
        String mail="abcd-efg@gamil.com";
        String birthday="2000-03-26";
        String password="AbCd9876";
        //驗證資料
        try{
            check.checkid(id);
            check.checkmail(mail);
            check.checkphone(phone);
            check.checkbirthday(birthday);
            check.checkpasswork(password);
            //驗證無誤後再丟入set
        }catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        System.out.println("身分證字號:"+id.toUpperCase()+" 正確");
        System.out.println("手機號碼:"+phone+" 正確");
        System.out.println("電子信箱:"+mail+" 正確");
        System.out.println("生日: "+birthday+"正確");
        System.out.println("密碼: "+password+"正確");
    }
}
