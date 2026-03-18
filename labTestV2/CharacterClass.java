package labTestV2;

public enum CharacterClass {
    WARRIOR(50, 50),
    MAGE(75, 25),
    ROGUE(100, 0);

    private int baseAttack;
    private int baseArmour;

    private CharacterClass(int baseAttack, int baseArmour) {
        this.baseAttack = baseAttack;
        this.baseArmour = baseArmour;
    }

    public int getBaseAttack() {
        return this.baseAttack;
    }

    public int getBaseArmour() {
        return this.baseArmour;
    }

    @Override
    public String toString() {
        return String.format("%s[Attack: %s, Armour: %s]", name(), this.baseAttack, this.baseArmour);
    }
}
