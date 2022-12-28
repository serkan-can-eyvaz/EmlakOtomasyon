package Entites;

public class User implements User_Process{
    private int Id;
    private String TC;
    private String Ad_Soyad;
    private int Yetki;

    public User()
    {}

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getTC() {
        return TC;
    }

    public void setTC(String TC) {
        this.TC = TC;
    }

    public String getAd_Soyad() {
        return Ad_Soyad;
    }

    public void setAd_Soyad(String ad_Soyad) {
        Ad_Soyad = ad_Soyad;
    }

    public int getYetki() {
        return Yetki;
    }

    public void setYetki(int yetki) {
        Yetki = yetki;
    }
}
