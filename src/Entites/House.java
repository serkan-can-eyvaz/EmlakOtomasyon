package Entites;

public class House {
    Sale_House sale_house =new Sale_House();//Compositon
    Rent_House rent_house=new Rent_House();
    Sale_Land sale_land=new Sale_Land();
    private int il_Id;
    private int ilce_Id;
    private int House_Id;
    private int Alici_Id;
    private int Satici_Id;
    private String Address;
    private String Satis_Durumu;
    private String Konut_Tipi ;
    private int Alan;
    private int Oda_Sayisi;
    private String İsitma_Sistemi;
    private int Fiyat;

    public House(){
    }

    public House(int il_Id, int ilce_Id, int house_Id, int alici_Id, int satici_Id, String address, String satis_Durumu, String konut_Tipi, int alan, int oda_Sayisi, String isitma_Sistemi, int fiyat) {
        this.il_Id = il_Id;
        this.ilce_Id = ilce_Id;
        House_Id = house_Id;
        Alici_Id = alici_Id;
        Satici_Id = satici_Id;
        Address = address;
        Satis_Durumu = satis_Durumu;
        Konut_Tipi = konut_Tipi;
        Alan = alan;
        Oda_Sayisi = oda_Sayisi;
        İsitma_Sistemi = isitma_Sistemi;
        Fiyat = fiyat;
    }

    public int getIl_Id() {
        return il_Id;
    }

    public void setIl_Id(int il_Id) {
        this.il_Id = il_Id;
    }

    public int getIlce_Id() {
        return ilce_Id;
    }

    public void setIlce_Id(int ilce_Id) {
        this.ilce_Id = ilce_Id;
    }

    public int getHouse_Id() {
        return House_Id;
    }

    public void setHouse_Id(int house_Id) {
        House_Id = house_Id;
    }

    public int getAlici_Id() {
        return Alici_Id;
    }

    public void setAlici_Id(int alici_Id) {
        Alici_Id = alici_Id;
    }

    public int getSatici_Id() {
        return Satici_Id;
    }

    public void setSatici_Id(int satici_Id) {
        Satici_Id = satici_Id;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public String getSatis_Durumu() {
        return Satis_Durumu;
    }

    public void setSatis_Durumu(String satis_Durumu) {
        Satis_Durumu = satis_Durumu;
    }

    public String getKonut_Tipi() {
        return Konut_Tipi;
    }

    public void setKonut_Tipi(String konut_Tipi) {
        Konut_Tipi = konut_Tipi;
    }

    public int getAlan() {
        return Alan;
    }

    public void setAlan(int alan) {
        Alan = alan;
    }

    public int getOda_Sayisi() {
        return Oda_Sayisi;
    }

    public void setOda_Sayisi(int oda_Sayisi) {
        Oda_Sayisi = oda_Sayisi;
    }

    public String getIsitma_Sistemi() {
        return İsitma_Sistemi;
    }

    public void setIsitma_Sistemi(String isitma_Sistemi) {
        İsitma_Sistemi = isitma_Sistemi;
    }

    public int getFiyat() {
        return Fiyat;
    }

    public void setFiyat(int fiyat) {
        Fiyat = fiyat;
    }

}
