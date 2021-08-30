package Labirent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Labirent {

    public static void main(String[] args) {
        OyuncuSecim();
    }

    public Labirent(String secilen){

        JFrame f = new JFrame();
        f.setTitle("Şirinler");
        f.add(new Board(secilen));
        f.setSize(665,645);
        f.setResizable(false);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void OyuncuSecim(){

        JFrame jf = new JFrame("Oyuncu Seçimi");
        JButton tembel = new JButton("Tembel Şirin");
        JButton gozluklu = new JButton("Gözlüklü Şirin");
        jf.setSize(400, 130);
        Container content = jf.getContentPane();
        content.setLayout(new FlowLayout());
        content.add(new JLabel("                             Lütfen oyuncu seçiniz :                       "));
        content.add(tembel);


        tembel.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String secilenOyuncu = "tembel";
                new Labirent(secilenOyuncu);

            }
        });
        content.add(gozluklu);
        gozluklu.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String secilenOyuncu = "gozluklu";
                new Labirent(secilenOyuncu);
            }
        });
        jf.setResizable(false);
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

}
