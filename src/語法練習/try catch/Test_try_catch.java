
public class Test_try_catch {
    public static void main(String[] args) {
        Test_Date testdate=new Test_Date();
        Check check=new Check();
        String age="12";
        String id="a123456789";
        String phone="0910345167";
        try {
            check.checkage(age);
            check.checkid(id);
            check.checkphone(phone);
            testdate.setAge(Integer.parseInt(age));
            testdate.setId(id);
            testdate.setPhone(phone);
        }catch (Exception e){
            System.out.println(e.getMessage());
            //e.printStackTrace();
            return;
        }
        System.out.println(testdate.getAge());
        System.out.println(testdate.getId());
        System.out.println(testdate.getPhone());
    }

}

