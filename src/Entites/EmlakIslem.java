package Entites;

import java.util.ArrayList;

public class EmlakIslem extends House{
    public EmlakIslem(){};
    private int ilanId;
    private double kira;

    public int getIlanId() {
        return ilanId;
    }

    public void setIlanId(int ilanId) {
        this.ilanId = ilanId;
    }
    ArrayList<String> ilan=new ArrayList<String>();


    public EmlakIslem(int il_Id, int ilce_Id, int house_Id, int alici_Id, int satici_Id, String address, String satis_Durumu, String konut_Tipi, int alan, int oda_Sayisi, String isitma_Sistemi, int fiyat, int ilanId) {
        super(il_Id, ilce_Id, house_Id, alici_Id, satici_Id, address, satis_Durumu, konut_Tipi, alan, oda_Sayisi, isitma_Sistemi, fiyat);
        this.ilanId = ilanId;
    }

    public EmlakIslem(int ilanId) {
        this.ilanId = ilanId;
    }
    public double depozito(double kira)
    {
        return ((kira*2)*0.7)+kira;
    }

    public void ilanEkle(String id, String il, String ilce, String ilanId)


    {
        ilan.add(id);
        ilan.add(il);
        ilan.add(ilce);
        ilan.add(ilanId);

    }
    public void ilanSil(String id, String il, String ilce, String ilanId)
    {

        ilan.remove(id);
        ilan.remove(il);
        ilan.remove(ilce);
        ilan.remove(ilanId);
    }


    @Override
    public String toString() {
        return "EmlakIslem{" +
                " " + ilanId
                ;
    }
}
