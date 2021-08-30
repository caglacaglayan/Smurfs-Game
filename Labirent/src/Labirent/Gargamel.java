package Labirent;

import javax.swing.*;
import java.awt.*;

public class Gargamel extends Dusman{

    private Image gargamel;

    Gargamel(){
        ImageIcon img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//gargamel.png");
        gargamel = img.getImage();
    }

    public Image getGargamel() {
        return gargamel;
    }
}
