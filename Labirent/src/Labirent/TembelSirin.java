package Labirent;

import javax.swing.*;
import java.awt.*;

public class TembelSirin extends Oyuncu{

    private Image tembelsirin;

    public TembelSirin(){

        ImageIcon img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//tembelsirin.png");
        tembelsirin = img.getImage();
    }


    public Image getTembelsirin() {
        return tembelsirin;
    }

    @Override
    int katsayiHesapla() {
        return super.katsayiHesapla();
    }

    @Override
    public void hamleHesapla() {
        super.hamleHesapla();

    }
}
