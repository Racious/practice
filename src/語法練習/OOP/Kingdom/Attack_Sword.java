package Kingdom;

public class Attack_Sword implements Weapon{
    private int attack=5;//預設武器攻擊力
    @Override
    public String weapon_attack(Character player) {
        String message="使用劍進行攻擊，造成"+(player.getAttack()+attack)+"傷害";
        return message;
    }
}
