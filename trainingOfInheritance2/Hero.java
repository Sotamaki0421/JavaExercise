package trainingOfInheritance2;

import test.Character;

public class Hero extends Character {

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
}
