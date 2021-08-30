package Labirent;

import java.awt.*;

public class Dusman extends Karakter{

    String dusmanID, dusmanAdi, dusmanTur;

    private Lokasyon lok = new Lokasyon();

    Dusman(){

    }

    Dusman(String dusmanID, String dusmanAdi, String dusmanTur){
        this.dusmanID = dusmanID;
        this.dusmanAdi = dusmanAdi;
        this.dusmanTur = dusmanTur;
    }

    public int getTileX() {
        return lok.getTileX();
    }

    public int getTileY() {
        return lok.getTileY();
    }

    public void setTileX(int tileX) {
        lok.setTileX(tileX);
    }

    public void setTileY(int tileY) {
        lok.setTileY(tileY);
    }


    public String getDusmanID() {
        return dusmanID;
    }

    public String getDusmanAdi() {
        return dusmanAdi;
    }

    public String getDusmanTur() {
        return dusmanTur;
    }

    public void setDusmanID(String dusmanID) {
        this.dusmanID = dusmanID;
    }

    public void setDusmanAdi(String dusmanAdi) {
        this.dusmanAdi = dusmanAdi;
    }

    public void setDusmanTur(String dusmanTur) {
        this.dusmanTur = dusmanTur;
    }

    public Image getGargamel() {
        return getGargamel();
    }

    public Image getAzman() {
        return getAzman();
    }

}
