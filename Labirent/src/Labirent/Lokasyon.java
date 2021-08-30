package Labirent;

public class Lokasyon {

    int tileX, tileY;

    public Lokasyon(){}

    public Lokasyon(int tileX, int tileY){
        this.tileX = tileX;
        this.tileY = tileY;
    }

    public int getTileX() {
        return tileX;
    }

    public int getTileY() {
        return tileY;
    }

    public void setTileX(int tileX) {
        this.tileX = tileX;
    }

    public void setTileY(int tileY) {
        this.tileY = tileY;
    }
}
