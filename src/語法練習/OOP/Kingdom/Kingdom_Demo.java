package Kingdom;

import java.util.ArrayList;
import java.util.List;

public class Kingdom_Demo {
    public static void main(String[] args) {
        Character player1 = new Swordsman();//建立劍士
        Character player2 = new Assassin();//建立刺客
        //劍士Demo
        System.out.println(player1.getName() + player1.useWeapon(player1));//空手攻擊
        player1.setWeapon(new Attack_Sword());//裝備劍
        System.out.println(player1.getName() + player1.useWeapon(player1));
        player1.setWeapon(new Attack_Bow());//裝備弓
        System.out.println(player1.getName() + player1.useWeapon(player1));

        System.out.println("==============================");//分隔線
        //刺客Demo
        System.out.println(player2.getName() + player2.useWeapon(player2));//空手攻擊
        player2.setWeapon(new Attack_Sword());//裝備劍
        System.out.println(player2.getName() + player2.useWeapon(player2));
        player2.setWeapon(new Attack_Bow());//裝備弓
        System.out.println(player2.getName() + player2.useWeapon(player2));

        System.out.println("==============================");//分隔線
        //List陣列
        List<Character> player = new ArrayList<Character>();//建立存放角色的陣列
        player.add(player1);
        player.add(player2);
        for (int i = 0; i < player.size(); i++) {
            System.out.println(player.get(i));//顯示角色訊息(toString)
        }
    }
}
