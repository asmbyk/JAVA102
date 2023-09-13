import java.sql.SQLOutput;
import java.util.Scanner;

public class Player {
    private int damage;
    private int healthy;
    private int money;
    private String name;
    private String charName;
    private Scanner input = new Scanner(System.in);
    private Inventory inventory;

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        Samurai samurai = new Samurai();
        Arrow arrow = new Arrow();
        knight knight = new knight();
        GameChar[] charList = {new Samurai(), new Arrow(), new knight()};
        System.out.println("Karakterler : ");
        for (GameChar gamechar : charList) {
            System.out.println("-------------------------------------------------------------");

            System.out.println(" Secilecek olan karakter idsi : " + gamechar.getId() + "  karakter ismi : " + gamechar.getName() + " hasar : " + gamechar.getDamage() + " sağlık : " + gamechar.getHealht() + " para : " + gamechar.getMoney());

        }


        System.out.println("-------------------------------------------------------------");
        System.out.println("Lütfen  bir karakter idsi giriniz : ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Arrow());
                break;
            case 3:
                initPlayer(new knight());
                break;
            default:
                initPlayer(new Samurai());
        }

    }


    public void initPlayer(GameChar gamechar) {
        this.setDamage(gamechar.getDamage());
        this.setHealthy(gamechar.getHealht());
        this.setMoney(gamechar.getMoney());
        this.setCharName(gamechar.getName());

    }

     /*public void printInfo() {
        System.out.println(
                " Silahınız : " + this.getInventory().getWeapon().getName() +
                        ", Hasarınız   : " + this.getDamage() +
                        " , Saglık : " + this.getHealthy() +
                        " para : " + this.getMoney());


    } */
      public  int getTotelDamage(){
          return damage + this.getInventory().getWeapon().getDamage();
      }
    public int getDamage() {
        return damage + this.getInventory().getWeapon().getDamage();
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealthy() {
        return healthy;
    }

    public void setHealthy(int healthy) {
        this.healthy = healthy;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    // public void printInfo() {
    }

