import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame implements ActionListener {
    JButton btm;
    JLabel aciklama;
    JTextField mtn;

    public void Main() {
        btm = new JButton("Hesapla");
        aciklama = new JLabel("Sayı girişi :");
        mtn = new JTextField("", 10);
        setLayout(new FlowLayout()); // akış kulanma
        add(aciklama);
        add(btm);
        add(mtn);
        btm.addActionListener(this);


    }

    public static void main(String[] args) {
        Main form = new Main();
        form.setSize(300, 300);
        form.setTitle("GUI örnek soru ");
        form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        form.setVisible(true);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}