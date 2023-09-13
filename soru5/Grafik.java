
// JFrame ve JPanel kütüphanelerini içe aktardım
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.*;


public class Grafik extends JPanel {
    // paintComponent metodu grafik çizmek için kullanılır
    @Override
    public void paintComponent(Graphics g) {
        // Üst sınıfın metotunu çağır
        super.paintComponent(g);

        // x ve y değerlerini tutacak diziler oluştur
        double[] xData = new double[100];
        double[] yData = new double[100];

        // x değerlerini -20 ile 20 arasında eşit aralıklarla doldur
        for (int i = 0; i < xData.length; i++) {
            xData[i] = -20 + 0.2 * i;
        }

        // y değerlerini y=3+cos(x) formülüne göre hesapla
        for (int i = 0; i < yData.length; i++) {
            yData[i] = 3 + Math.cos(xData[i]);
        }

        // Eksenleri çizmek için renk seç
        g.setColor(Color.BLACK);

        // x-eksenini çiz (y=0)
        g.drawLine(0, getHeight() / 2, getWidth(), getHeight() / 2);

        // y-eksenini çiz (x=0)
        g.drawLine(getWidth() / 2, 0, getWidth() / 2, getHeight());

        // Eğriyi çizmek için renk seç
        g.setColor(Color.BLUE);

        // Eğriyi oluşturan noktaları birleştir
        for (int i = 0; i < xData.length - 1; i++) {
            // x ve y değerlerini piksel cinsinden hesapla
            int x1 = (int) (getWidth() / 2 + xData[i] * 10);
            int y1 = (int) (getHeight() / 2 - yData[i] * 10);
            int x2 = (int) (getWidth() / 2 + xData[i + 1] * 10);
            int y2 = (int) (getHeight() / 2 - yData[i + 1] * 10);

            // Noktaları birleştiren çizgiyi çiz
            g.drawLine(x1, y1, x2, y2);
        }
    }

    // Ana metot
    public static void main(String[] args) {
        // Bir JFrame nesnesi oluştur
        JFrame frame = new JFrame("Grafik");

        // Çıkış davranışını belirle
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Bir Grafik nesnesi oluştur ve frame'e ekle
        Grafik graph = new Grafik();
        frame.add(graph);

        // Frame'in boyutunu belirle ve görünür yap
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}


