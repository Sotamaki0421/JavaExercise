package trainingOfInheritance2;

import test.Character;

public class Enemy extends Character {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Enemy() {
    }

    public Enemy(String name, int hp, int offence, int defence, String type) {
        super(name, hp, offence, defence);
        setType(type);
    }
}
