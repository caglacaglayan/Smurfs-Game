package Labirent;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.util.Scanner;

public class Map {

    private Scanner m;
    private int Map[][] = new int[11][13];
    public String[] cumleler = new String[2];
    public String cumle1, cumle2;

    private Image zemin, duvar, baslangic, sirine, altin, mantar, kapiA, kapiB, kapiC, kapiD;

    public Map(){

        ImageIcon img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//zemin.png");
        zemin = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//duvar.png");
        duvar = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//baslangic.png");
        baslangic = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//kapiA.png");
        kapiA = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//kapiB.png");
        kapiB = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//kapiC.png");
        kapiC = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//kapiD.png");
        kapiD = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//sirine.png");
        sirine = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//mantar.png");
        mantar = img.getImage();
        img = new ImageIcon("C://Users//ISRAFIL//Desktop//Labirent//altin.png");
        altin = img.getImage();

        openFile();
        readFile();
        closeFile();
    }

    public Image getZemin() {
        return zemin;
    }

    public Image getDuvar() {
        return duvar;
    }

    public Image getBaslangic() {
        return baslangic;
    }

    public Image getKapiA() {
        return kapiA;
    }

    public Image getKapiB() {
        return kapiB;
    }

    public Image getKapiC() {
        return kapiC;
    }

    public Image getKapiD() {
        return kapiD;
    }

    public Image getSirine() {
        return sirine;
    }

    public Image getMantar() {
        return mantar;
    }

    public Image getAltin() {
        return altin;
    }

    public int getMap(int x, int y){
        int index = Map[y][x];
        return index;
    }

    public void openFile() {
        try {
            m = new Scanner(new File("C://Users//ISRAFIL//Desktop//Labirent//harita.txt"));
        } catch (Exception E){
            System.out.println("harita yuklenemedi");
        }
    }

    public void readFile(){
        for (int a=0 ; a<2 ; a++){
            cumleler[a] = m.nextLine();
        }

        while (m.hasNextInt()){
            for (int i=0 ; i<11 ; i++) {
                for (int j=0; j<13; j++) {
                    Map[i][j] = m.nextInt();
                }
            }
        }
    }

    public void closeFile(){
        m.close();
    }
}
