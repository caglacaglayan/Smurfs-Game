package Labirent;

import javax.swing.*;
import java.awt.*;

public class Azman extends Dusman{

    private Image azman;

    Azman(){
        ImageIcon img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//azman.png");
        azman = img.getImage();
    }

    public Image getAzman() {
        return azman;
    }
}
