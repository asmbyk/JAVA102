import java.util.Random;

public abstract class BattleLoc extends Location {
    private Obstacle obstacle;
    private String award;
    private int maxObstacle;

    public BattleLoc(Player player, String name, Obstacle obstacle, String award, int maxObstacle) {
        super(player, name);
        this.obstacle = obstacle;
        this.award = award;
        this.maxObstacle = maxObstacle;

    }

    @Override
    boolean onLocation() {
        int obsNumber = this.randomObstacleNumber();

        System.out.println("Şu an  buradasınız : " + this.getName());

        System.out.println("Dikkatli  ol !  " + obsNumber + "   tane " + this.getObstacle().getName() + " Yaşıyor !");
        System.out.println("<S>avaş veya <K>aç");
        System.out.println("savasmak için : s ");
        System.out.println("kaçmak için :  k ");
        String selectCase = input.nextLine();
        selectCase = selectCase.toUpperCase();
        if (selectCase.equals("S")) {
            if(combat(obsNumber)){
                System.out.println( this.getName() + " Tüm düşmanları yendiniz !!");
                return  true;
            }
        }
        if(this.getPlayer().getHealthy()< 0 ){
            System.out.println("Öldünüz");
            return false;

        }
        return true;
    }

    public boolean combat(int obsNumber) {

        for (int i = 1; i <= obsNumber; i++) {
            this.getObstacle().setHealth(this.getObstacle().getOrginalHealth());
            playerStats();
            obstacleStats();
            while (this.getObstacle().getHealth() > 0 && this.getPlayer().getHealthy() > 0) {
                System.out.println("<V>ur veya  <K>aç ");
                String selectCombat = input.nextLine().toUpperCase();
                if (selectCombat.equals("V")) {
                    System.out.println("Siz vurdudunuz !");
                    this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getTotelDamage());
                    afterhit();

                    if (this.getObstacle().getHealth() <= 0) {
                        System.out.println();
                        System.out.println("Canavar size vurdu !");
                        int obstacleDamge = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                        if (obstacleDamge < 0) {
                            obstacleDamge = 0;

                        }
                        this.getPlayer().setHealthy(this.getPlayer().getHealthy() - obstacleDamge);
                        afterhit();

                    }


                }
            }

        }

        return false;
    }

    public void afterhit() {
        System.out.println("Canınız : " + this.getPlayer().getHealthy());
        System.out.println(this.getObstacle().getName() + "  canı : " + this.getObstacle().getHealth());
        System.out.println();

    }

    public void playerStats() {
        System.out.println("oyuncu değerleri !!");
        System.out.println();
        System.out.println("---------------------");
        System.out.println(" Sağlık degeri : " + this.getPlayer().getHealthy());
        System.out.println();
        System.out.println("Silah : " + this.getPlayer().getInventory().getWeapon().getName());
        System.out.println();
        System.out.println("Zırh : " + this.getPlayer().getInventory().getArmor().getName());
        System.out.println();
        System.out.println("Blocklama : " + this.getPlayer().getInventory().getArmor().getBlock());
        System.out.println();
        System.out.println("  Hasar :   " + this.getPlayer().getTotelDamage());
        System.out.println();
        System.out.println(" Mevcut Paranız : " + this.getPlayer().getMoney());
        System.out.println();

    }

    public void obstacleStats() {
        System.out.println(this.getObstacle().getName() + " degerleri : ");
        System.out.println("--------------");
        System.out.println(this.getObstacle().getName() + "  Saglıgı :" + this.getObstacle().getHealth());
        System.out.println();
        System.out.println(this.getObstacle().getName() + "  Hasarı " + this.getObstacle().getDamage());
        System.out.println();
        System.out.println(this.getObstacle().getName() + "  Ödülü : " + this.getObstacle().getAward());

    }

    public int randomObstacleNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObstacle()) + 1;
    }

    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }

    public int getMaxObstacle() {
        return maxObstacle;
    }

    public void setMaxObstacle(int maxObstacle) {
        this.maxObstacle = maxObstacle;
    }
}
