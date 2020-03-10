package TaiwanIDNumber;

import java.util.Random;

public class CreatId {
    char[] city= {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N'
            , 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
    Random random=new Random();
    int firstid = random.nextInt(26);
    int idnumber;
    String id;

    public void build(IDCheck idCheck,Greeting greeting){
        String id =String.valueOf(city[firstid]);
        for(int j=0;j<1;j++){
            idnumber=1+random.nextInt(2);
            id=id+Integer.toString(idnumber);
        }
        for(int i=0;i<8;i++){
            idnumber=random.nextInt(10);
            id=id+Integer.toString(idnumber);
        }
        int ary[]=idCheck.ramdomid(id,greeting);
        id=id.substring(0,id.length()-1);
        id=id+Integer.toString(ary[9]);
        greeting.ramdomid(id,ary);
    }
}
