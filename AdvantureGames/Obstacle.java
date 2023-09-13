public class Obstacle {
    private  int id ;
    private int damage ;

    private  int health;
    private String name ;
    private  int  award;
    private int  orginalHealth ;


    public Obstacle(int id, String name,  int damage, int health, int award ) {
        this.id = id;
        this.damage = damage;
        this.orginalHealth = health;
        this.name = name;
        this.award = award;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAward() {
        return award;
    }

    public void setAward(int award) {
        this.award = award;
    }

    public int getOrginalHealth() {

        return orginalHealth;
    }

    public void setOrginalHealth(int orginalHealth) {
        this.orginalHealth = orginalHealth;
    }
}