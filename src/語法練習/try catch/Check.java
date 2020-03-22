public class Check {
    public void checkage(String age) throws Exception{
        String agepattern = "[0-9]{0,3}";
        if(!(age.matches(agepattern))){
            throw new Exception("輸入的年齡有問題");
        }
    }
    public void checkid(String id) throws Exception{
        String idpattern = "[A-Za-z][1-2][0-9]{8}";
        if(!(id.matches(idpattern))) {
            throw new Exception("輸入的身分證格式不對");
        }
    }
    public void checkphone(String phone) throws Exception{
        String phonepattern = "[0][9][0-9]{8}";
        if(!(phone.matches(phonepattern))){
            throw new Exception("輸入的電話有誤");
        }
    }
}
