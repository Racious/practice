package Kingdom;

public class Attack_Bow implements Weapon{
    private int attack=3;//預設武器攻擊力
    @Override
    public String weapon_attack(Character player) {
        String message="使用弓箭進行攻擊，造成"+(player.getAttack()+attack)+"傷害";
        return message;
    }
}
