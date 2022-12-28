package Entites;

public class Buyer_customer extends Customer{

    private String ilanbilgi;
    private String evid;
    private String buyerid;
    private String saleid;
    Sale_Land sale_land=new Sale_Land();//composetion;

    public String getIlanbilgi() {
        return ilanbilgi;
    }

    public void setIlanbilgi(String ilanbilgi) {
        this.ilanbilgi = ilanbilgi;
    }

    public String getEvid() {
        return evid;
    }

    public void setEvid(String evid) {
        this.evid = evid;
    }

    public String getBuyerid() {
        return buyerid;
    }

    public void setBuyerid(String buyerid) {
        this.buyerid = buyerid;
    }

    public String getSaleid() {
        return saleid;
    }

    public void setSaleid(String saleid) {
        this.saleid = saleid;
    }
}

