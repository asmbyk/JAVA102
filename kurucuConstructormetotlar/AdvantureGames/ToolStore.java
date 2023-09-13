import java.sql.SQLOutput;

public class ToolStore extends NormalLoc {
    public ToolStore(Player player) {
        super(player, "Magaza");

    }

    @Override
    public boolean onLocation() {
        System.out.println("------------------Magazaya Hoşgelniz !!-------------------");
        boolean showMenu = true;
        while (showMenu) {
            System.out.println("1. Silahlar :");
            System.out.println("2. Zırhlar");
            System.out.println("3. Çıkıs yap !");
            System.out.println();
            System.out.println("Secimizini yapınız ? ");
            int selectCase = input.nextInt();
            while (selectCase < 1 && selectCase > 3) {
                System.out.println(" Geçersiz deger giridiniz . ");
                System.out.println();
                System.out.println(" Örnek olarak silaha gitmek için 1 yazabilirsiniz . ");
                selectCase = input.nextInt();

            }
            switch (selectCase) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 3:
                    System.out.println(" birdaha bekleriz ");
                    showMenu = false;
                    break;



            }


        }return true;
    }

    public void printWeapon() {
        System.out.println("--------------Silahlar-------------");
        for (Weapon w : Weapon.weapon()) {
            System.out.println("<isim" + w.getName() + " <Sila id numarası " + w.getId() + " <Para : " + w.getPrice() + " <Hasar: " + w.getDamage());

        }
        System.out.println(" --------CIKMAK İÇİN 0 YAZABİLİRSİNİZ !!!!-------- ");

    }

    public void buyWeapon() {
        System.out.println(" Bir silah seciniz (id no ) : ");
        int selectWeopon = input.nextInt();
        while (selectWeopon < 0 && selectWeopon > Weapon.weapon().length) {
            System.out.println(" Geçersiz deger giridiniz . ");
            System.out.println();
            selectWeopon = input.nextInt();

        }
        if (selectWeopon != 0) {


            Weapon selectedWeopen = Weapon.getWeaponObjbyID(selectWeopon);
            if (selectedWeopen != null) {
                if (selectedWeopen.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("yeterli paranız bulunmaktadır . ");
                } else {
                    System.out.println(selectedWeopen.getName() + " Silahını satın aldınız !!!");
                    int balance = this.getPlayer().getMoney() - selectedWeopen.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println(" kalan paranız: " + this.getPlayer().getMoney());
                    System.out.println();
                    System.out.println(" Önceki silahınız: " + this.getPlayer().getInventory().getWeapon().getName());
                    this.getPlayer().getInventory().setWeapon(selectedWeopen);
                    System.out.println(" Su anki mevcut  silahınız: " + this.getPlayer().getInventory().getWeapon().getName());

                }
            }
        }
    }

    public void printArmor() {
        System.out.println("-------------Zırhlar-------------");
        for (Armor a : Armor.armors()) {
            System.out.println(a.getId() + " - " + a.getName() +
                    "<Zırh değeri  >" + a.getBlock() + "  Fiyatı : " + a.getPrice());
        }
        System.out.println(" --------CIKMAK İÇİN 0 YAZABİLİRSİNİZ !!!!-------- ");

    }

    public void buyArmor() {
        System.out.println("Bir Zırh seçiniz : ");
        int selectArmorID = input.nextInt();
        while (selectArmorID < 1 && selectArmorID > Weapon.weapon().length) {
            System.out.println(" Geçersiz deger giridiniz . ");
            System.out.println();
            selectArmorID = input.nextInt();
        }
        if (selectArmorID != 0) {
            Armor selectedArmor = Armor.getArmorObjbyID(selectArmorID);

            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("yeterli paranız bulunmamaktadır . ");
                } else {
                    System.out.println(selectedArmor.getName() + " Zırh  satın aldınız !!!");
                    int balance = this.getPlayer().getMoney() - selectedArmor.getPrice();
                    this.getPlayer().setMoney(balance);
                    System.out.println(" kalan paranız: " + this.getPlayer().getMoney());
                    System.out.println();
                    System.out.println(" Önceki zırhınız: " + this.getPlayer().getInventory().getArmor().getName());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println(" Su anki mevcut  zırhnızı: " + this.getPlayer().getInventory().getArmor().getName());

                }
            }

        }
    }
}
