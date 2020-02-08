package prorject.diabolo.npc;

public class Ghul extends Monster {
    public Ghul() {
        this.hp =  35;
        strength = 8;
        weaponType = weaponType.UNARMED;
    }

    @Override
    public int attack() {
        return 0;
    }
}
