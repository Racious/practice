package Kingdom;

public class Attack_Sword implements Weapon{
    private int attack=5;//預設武器攻擊力
    private String name="劍";

    @Override
    public String name() {
        return name;
    }

    @Override
    public int attackDamage() {
        return 5;
    }

    @Override
    public String weapon_attack(Character player) {
        String message="使用劍進行攻擊，造成"+(player.getAttack()+attack)+"傷害";
        return message;
    }
}
