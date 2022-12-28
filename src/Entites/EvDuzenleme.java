package Entites;

public abstract class EvDuzenleme {
    private String evid;
    private String konumid;
    private String evData;
    private String evikon;

    public String getEvid() {
        return evid;
    }

    public void setEvid(String evid) {
        this.evid = evid;
    }

    public String getKonumid() {
        return konumid;
    }

    public void setKonumid(String konumid) {
        this.konumid = konumid;
    }

    public String getEvData() {
        return evData;
    }

    public void setEvData(String evData) {
        this.evData = evData;
    }

    public String getEvikon() {
        return evikon;
    }

    public void setEvikon(String evikon) {
        this.evikon = evikon;
    }

    public EvDuzenleme(String evid, String konumid, String evData, String evikon) {
        this.evid = evid;
        this.konumid = konumid;
        this.evData = evData;
        this.evikon = evikon;
    }
    public void duzenleme(String evid,String evikon)
    {

    }
}
