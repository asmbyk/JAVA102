public class Inventory  {
    private  Weapon weapon;
    private Armor armor;
    public Inventory(){
        this.weapon =  new Weapon("yumruk ", -1,-1 ,-1);
        this.armor = new Armor("Armor yok çıplak ", -1,-1,-1);
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }
}
