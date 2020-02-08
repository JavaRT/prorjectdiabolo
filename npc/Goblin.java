package prorject.diabolo.npc;

import prorject.diabolo.WeaponType;

public class Goblin extends Monster {
public Goblin(){
    hp = 25;
    strength = 3;
    weaponType = WeaponType.MACE;
    alive = true;
}
    @Override
    public int attack() {
        return strength + weaponType.getDamage();
    }
}
