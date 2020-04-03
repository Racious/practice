package Kingdom;

public abstract class Character {
    private String name;//角色名子
    private int attack;//角色攻擊力
    Weapon weapon=new Empty_hand();//透過介面宣告變數，並預設空手攻擊模式

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    @Override
    public String toString() {
        return  "名子：" + name + "\t" +
                "攻擊力：" + attack ;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
    //透過設定的介面窗口去實做方法
    public String useWeapon(Character player){
        return  weapon.weapon_attack(player);
    }
}
