package trainingOfInheritance2;

import test.Character;
import test.MagicAttack;

public class Hero extends Character implements MagicAttack {

    private int weapon;

    public int getWeapon() {
        return weapon;
    }

    public void setWeapon(int weapon) {
        this.weapon = weapon;
    }

    public Hero() {
    }

    public Hero(String name, int hp, int offence, int defence, int weapon) {
        super(name, hp, offence, defence);
        this.weapon = weapon;
    }

    @Override
    public void attack(Character opponent) {

        int damage = super.getOffense() + this.getWeapon() + opponent.getDefense();

        if (damage > 0) {
            opponent.setHp(opponent.getHp() - damage);
            System.out.println(super.getName() + " は " + opponent.getName() + " に " + damage + "のダメージを与えた!");
        }else {
            System.out.println("ミス! " + super.getName() + " は " + opponent.getName() + " に " + "ダメージを与えられない!");
        }
    }

    @Override
    public void magic_attack(Character opponent) {
        int damage = 5;
        opponent.setHp(opponent.getHp() - damage);
        System.out.println(this.getName() + " は魔法で " + opponent.getName() + " に " + damage + " のダメージを与えた！");
    }
}
