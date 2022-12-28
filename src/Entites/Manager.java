package Entites;

public class Manager extends EmlakIslem  implements Manager_Process{
    private int Id;
    private String TC;
    private String Ad_Soyad;
    private int Yetki;
    public Manager()
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

    @Override
    public void ılanEkle() {

    }

    @Override
    public void ilanGuncelle() {

    }

}
