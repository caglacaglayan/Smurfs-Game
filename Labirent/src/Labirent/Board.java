package Labirent;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.util.Random;

public class Board extends JPanel implements ActionListener {

    private Timer timer;
    private  Map m;
    private Oyuncu o;
    private Dusman d1;
    private Dusman d2;

    private int sure = 0;
    private int x1, x2, y1, y2;

    private Random r = new Random();
    private Font font = new Font( "SansSerif", Font.PLAIN, 18);

    public Board(String secilen){
        m = new Map();
        d1 = new Azman();
        d2 = new Gargamel();

        if (secilen == "gozluklu"){
            o = new GozlukluSirin();
        }
        if (secilen == "tembel"){
            o = new TembelSirin();
        }

        addKeyListener(new Al());
        setFocusable(true);

        timer = new Timer(25,this);
        timer.start();
        if (m.cumleler[0].equals("Karakter:Gargamel,Kapi:A")){
            d2.setTileX(3);
            d2.setTileY(0);
            x2 = 3;
            y2 = 0;
        }
        if (m.cumleler[0].equals("Karakter:Gargamel,Kapi:B")){
            d2.setTileX(10);
            d2.setTileY(0);
            x2 = 10;
            y2 = 0;
        }
        if (m.cumleler[0].equals("Karakter:Gargamel,Kapi:C")){
            d2.setTileX(0);
            d2.setTileY(5);
            x2 = 0;
            y2 = 5;
        }
        if (m.cumleler[0].equals("Karakter:Gargamel,Kapi:D")){
            d2.setTileX(3);
            d2.setTileY(10);
            x2 = 3;
            y2 = 10;
        }

        if (m.cumleler[1].equals("Karakter:Azman,Kapi:A")){
            d1.setTileX(3);
            d1.setTileY(0);
            x1 = 3;
            y1 = 0;
        }
        if (m.cumleler[1].equals("Karakter:Azman,Kapi:B")){
            d1.setTileX(10);
            d1.setTileY(0);
            x1 = 10;
            y1 = 0;
        }
        if (m.cumleler[1].equals("Karakter:Azman,Kapi:C")){
            d1.setTileX(0);
            d1.setTileY(5);
            x1 = 0;
            y1 = 5;
        }
        if (m.cumleler[1].equals("Karakter:Azman,Kapi:D")){
            d1.setTileX(150);
            d1.setTileY(500);
            x1 = 3;
            y1 = 10;
        }
    }


    @Override
    public void actionPerformed(ActionEvent e) {
        repaint();
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);

        sure+=1;

        for (int y=0 ; y<11 ; y++){
            for(int x=0 ; x<13 ; x++){
                if (m.getMap(x,y) == 1){
                    g.drawImage(m.getZemin(),x*50,y*50,null);
                }
                if (m.getMap(x,y) == 0){
                    g.drawImage(m.getDuvar(),x*50,y*50,null);
                }
            }
        }

        g.drawImage(m.getSirine(),603,352,null);
        g.drawImage(m.getBaslangic(),300,250,null);
        g.drawImage(m.getKapiA(),150,0,null);
        g.drawImage(m.getKapiB(),500,0,null);
        g.drawImage(m.getKapiC(),0,250,null);
        g.drawImage(m.getKapiD(),150,500,null);
        g.drawImage(m.getAltin(),15,557,null);
        g.drawImage(m.getMantar(),205,557,null);

        g.setFont(font);
        g.drawString("PUAN: "+o.getSkor(),350,585);
        g.drawString(" : "+o.altin,65,585);
        g.drawString(" : "+o.mantar,255,585);

        int karakter = o.katsayiHesapla();
        if (karakter == 1) {
            g.drawImage(o.getTembelsirin(), o.getTileX() * 50, o.getTileY() * 50, null);
        }
        if (karakter == 2){
            g.drawImage(o.getGozluklusirin(), o.getTileX() * 50, o.getTileY() * 50, null);
        }

        g.drawImage(d1.getAzman(),d1.getTileX()*50,d1.getTileY()*50,null);
        g.drawImage(d2.getGargamel(),d2.getTileX()*50,d2.getTileY()*50,null);

        if (o.getTileX()*50 == 600 && o.getTileY()*50 == 350){
            timer.stop();
            String message = "Kazandiniz...\nPuaniniz : "+o.getSkor();
            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }
        if (o.getSkor() <= 0){
            timer.stop();
            String message = "GAME OVER...";
            JOptionPane.showMessageDialog(this,message);
            System.exit(0);
        }

        if (o.getTileX()*50 == d1.getTileX()*50 && o.getTileY()*50 == d1.getTileY()*50){
            o.setSkor(o.getSkor() - 5);
            d1.setTileX(x1);
            d1.setTileY(y1);
        }
        if (o.getTileX()*50 == d2.getTileX()*50 && o.getTileY()*50 == d2.getTileY()*50){
            o.setSkor(o.getSkor() - 15);
            d2.setTileX(x2);
            d2.setTileY(y2);
        }

    }

    public  class Al extends KeyAdapter{

        public void keyPressed(KeyEvent e) {
            int keycode = e.getKeyCode();
            int katsayi = o.katsayiHesapla();

            if (katsayi == 2) {
                if (keycode == KeyEvent.VK_UP) {
                    if (m.getMap(o.getTileX(), o.getTileY() - 2) != 0 && m.getMap(o.getTileX(), o.getTileY() - 1) !=0) {
                        o.Hamle(0, -1, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_DOWN) {
                    if (m.getMap(o.getTileX(), o.getTileY() + 2) !=0 && m.getMap(o.getTileX(), o.getTileY() + 1) !=0) {
                        o.Hamle(0, 1, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_RIGHT) {
                    if (m.getMap(o.getTileX() + 2, o.getTileY()) !=0 && m.getMap(o.getTileX() + 1, o.getTileY()) !=0) {
                        o.Hamle(1, 0, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_LEFT) {
                    if (m.getMap(o.getTileX() - 2, o.getTileY()) !=0 && m.getMap(o.getTileX() - 1, o.getTileY()) !=0) {
                        o.Hamle(-1, 0, katsayi);
                    }
                }

            } else if (katsayi == 1) {
                if (keycode == KeyEvent.VK_UP) {
                    if (m.getMap(o.getTileX(), o.getTileY() - 1) !=0) {
                        o.Hamle(0, -1, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_DOWN) {
                    if (m.getMap(o.getTileX(), o.getTileY() + 1) !=0) {
                        o.Hamle(0, 1, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_RIGHT) {
                    if (m.getMap(o.getTileX() + 1, o.getTileY()) !=0) {
                        o.Hamle(1, 0, katsayi);
                    }
                }
                if (keycode == KeyEvent.VK_LEFT) {
                    if (m.getMap(o.getTileX() - 1, o.getTileY()) !=0) {
                        o.Hamle(-1, 0, katsayi);
                    }
                }
            }
        }

        public void keyRelased(KeyEvent e){}

        public void keyTyped(KeyEvent e){}

    }


}
