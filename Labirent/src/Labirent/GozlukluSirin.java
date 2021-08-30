package Labirent;

import javax.swing.*;
import java.awt.*;

public class GozlukluSirin extends Oyuncu{

    private Image gozluklusirin;

    public GozlukluSirin(){

        ImageIcon img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//gozluklusirin.png");
        gozluklusirin= img.getImage();

    }

    public Image getGozluklusirin() {
        return gozluklusirin;
    }

    @Override
    int katsayiHesapla() {
        return 2;
    }
}
