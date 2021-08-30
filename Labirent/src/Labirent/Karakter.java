package Labirent;

public class Karakter {

    String ID, Ad, Tur;

    public void EnKisaYol(){}

    Karakter(){}

    Karakter(String ID, String Ad, String Tur){
        this.ID = ID;
        this.Ad = Ad;
        this.Tur = Tur;
    }

    public String getID() {
        return ID;
    }

    public String getAd() {
        return Ad;
    }

    public String getTur() {
        return Tur;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public void setTur(String tur) {
        Tur = tur;
    }

}
