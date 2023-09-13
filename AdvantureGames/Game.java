import java.util.Scanner;

public class Game {
    private Scanner input = new Scanner(System.in);

    public void Start() {
        System.out.println("Macera oyununa hoşgeldiniz !!!");
        System.out.println("Lütfen karakterinize bir isim veriniz.");
        String playerName = input.nextLine();
        Player player = new Player(playerName);
        System.out.println("Sayın" + player.getName() + " bu karanlık ve maceralı adaya hoşgeldiniz !!!");
        System.out.println("burda yaşananlar gelecekte desten olarak  anlatılacak ! başarılar");
        System.out.println("Lütfen size en uygun karakteri seçiniz !");
        player.selectChar();
        Location location = null;

        while (true) {
            // player.printInfo();
            System.out.println();
            System.out.println("Bölgeler");
            System.out.println();
            System.out.println("1- Güvenli ev ---------------> Burası sizin için güvenli bir ev düşman yok !!!");
            System.out.println();
            System.out.println("2- Eşya Dükkanı ---------------->Magaza güvenli bir yerdir düşman yoktur ve kendinize uygun eşyaları  satın alabilirisiniz. ");
            System.out.println();
            System.out.println("3- Magara ---------------> Mağaraya gir ! zorluk : basit ");
            System.out.println();
            System.out.println("4 - Orman  ---------------> Ormana gir ! zorluk : orta");
            System.out.println();
            System.out.println("5- Nehir -----------------> Nehire Git ! zorluk : zor");
            System.out.println();
            System.out.println("0 - Oyundan cıkmak için 0 tuşlayabilirsiniz");
            int selectLoc = input.nextInt();
            switch (selectLoc) {
                case 0:
                    location = null;

                    break;
                case 1:
                    location = new SafeHouse(player);
                    break;
                case 2:
                    location = new ToolStore(player);
                    break;
                case 3:
                    location = new Cave(player);
                    break;
                case 4:
                    location = new Forest(player);
                    break;
                case 5:
                    location = new River(player);
                    break;

                default:
                    location = new SafeHouse(player);
            }
            if (location == null) {
                System.out.println(" Bu karanlık ve sisli adadan cabuk vazgeçtin !");
                break;
            }
            if (!location.onLocation()) {
                System.out.println("Öldünüz oyun bitti :( ");
                break;
            }

        }


    }
}
