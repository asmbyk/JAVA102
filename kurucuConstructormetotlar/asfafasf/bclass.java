abstract class bclass  extends  aclass{
    public bclass(int n) { //  A sınıfın B sınıfından kalıtım yapması isteniyorsa super geldi ;
        super(n);
    }

    public static void main(String[] args) {
        bclass b=new bclass(50) {
            @Override
            void hesapla() {
                for (int x = 1; x < n; x++) {
                    for (int y = x + 1; y < n; y++) {
                        for (int z = y + 1; z < n; z++) {
                            if (x * x + y * y == z * z) {
                                // Sayıları ekrana yaz
                                System.out.println("[" + x + ", " + y + ", " + z + "]");
                            }
                        }
                    }
                }
            }


        };

        b.hesapla();



    }
}
