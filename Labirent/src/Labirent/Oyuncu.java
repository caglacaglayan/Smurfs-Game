package Labirent;

import java.awt.*;

public class Oyuncu extends Karakter{

    String oyuncuID, oyuncuAdi, oyuncuTur;

    private Lokasyon lok = new Lokasyon();

    public int Skor = 20, mantar = 0, altin = 0;

    Oyuncu(){
        lok.setTileX(6);
        lok.setTileY(5);
    }

    Oyuncu(String oyuncuID, String oyuncuAdi, String oyuncuTur, int Skor){
        this.oyuncuID = oyuncuID;
        this.oyuncuAdi = oyuncuAdi;
        this.oyuncuTur = oyuncuTur;
        this.Skor = Skor;
    }

    public int getTileX() {
        return lok.getTileX();
    }

    public int getTileY() {
        return lok.getTileY();
    }

    public void Hamle(int dx, int dy, int katsayi){
        lok.setTileX(getTileX() + katsayi*dx);
        lok.setTileY(getTileY() + katsayi*dy);
    }

    int katsayiHesapla(){
        return 1;
    }

    public void hamleHesapla(){

    }

    public void PuaniGoster(){

    }

    public String getOyuncuID() {
        return oyuncuID;
    }

    public String getOyuncuAdi() {
        return oyuncuAdi;
    }

    public String getOyuncuTur() {
        return oyuncuTur;
    }

    public int getSkor() {
        return Skor;
    }

    public void setOyuncuID(String oyuncuID) {
        this.oyuncuID = oyuncuID;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        this.oyuncuAdi = oyuncuAdi;
    }

    public void setOyuncuTur(String oyuncuTur) {
        this.oyuncuTur = oyuncuTur;
    }

    public void setSkor(int skor) {
        this.Skor = skor;
    }

    public Image getTembelsirin() {
        return getTembelsirin();
    }

    public Image getGozluklusirin() {
        return getGozluklusirin();
    }
}
