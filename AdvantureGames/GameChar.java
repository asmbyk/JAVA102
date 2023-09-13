public abstract class GameChar {
    private String name;
    private  int id ;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealht() {
        return healht;
    }

    public void setHealht(int healht) {
        this.healht = healht;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public GameChar(int id , String name, int damage, int healht, int money    ) {
        this.name = name;
        this.damage = damage;
        this.healht = healht;
        this.money = money;
        this.id = id ;
    }

    private int damage;
    private int healht;
    private int money;


}
