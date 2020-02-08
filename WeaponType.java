package prorject.diabolo;

public enum WeaponType {
    SWORD(10), MACE(5), UNARMED(2);
    private final int damage;

    WeaponType(int damage) {
        this.damage = damage;
    }
        public int getDamage() {
            return damage;
        }

    }
