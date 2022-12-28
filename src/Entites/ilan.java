package Entites;

public class ilan {
    private String ilanid;
    private  String konutipii;
    private String ısınma;
    private String odasayisi;
    private String alan;
    private String yapımyili;
    private String fiyat;

    public String getIlanid() {
        return ilanid;
    }

    public void setIlanid(String ilanid) {
        this.ilanid = ilanid;
    }

    public String getKonutipii() {
        return konutipii;
    }

    public void setKonutipii(String konutipii) {
        this.konutipii = konutipii;
    }

    public String getIsınma() {
        return ısınma;
    }

    public void setIsınma(String ısınma) {
        this.ısınma = ısınma;
    }

    public String getOdasayisi() {
        return odasayisi;
    }

    public void setOdasayisi(String odasayisi) {
        this.odasayisi = odasayisi;
    }

    public String getAlan() {
        return alan;
    }

    public void setAlan(String alan) {
        this.alan = alan;
    }

    public String getYapımyili() {
        return yapımyili;
    }

    public void setYapımyili(String yapımyili) {
        this.yapımyili = yapımyili;
    }

    public String getFiyat() {
        return fiyat;
    }

    public void setFiyat(String fiyat) {
        this.fiyat = fiyat;
    }

    @Override
    public String toString() {
        return
                ilanid +
                konutipii +
                ısınma +
                odasayisi +
                alan +
                yapımyili  +
                 fiyat
                ;
    }

}
