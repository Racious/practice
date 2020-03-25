package Taiwan_Id_check2;

public class Main {
    public static void main(String[] args) {
        Check check=new Check();
        String id="A123123123";
        String phone="0956551561";
        String mail="abcd_efg@gamil.com";
        try{
            check.checkid(id);
        }catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        System.out.println("身分證字號:"+id.toUpperCase()+" 正確");
        System.out.println("手機號碼:"+phone+" 正確");
        System.out.println("電子信箱:"+mail+" 正確");
    }
}
