package Kingdom;

public class Empty_hand implements Weapon {
    @Override
    public String weapon_attack(Character player) {
        String message="使用空手進行攻擊，造成"+player.getAttack()+"傷害";
        return message;
    }
}
