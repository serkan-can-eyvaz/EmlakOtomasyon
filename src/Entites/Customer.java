package Entites;

public  class  Customer {
    private int Customer_Id;
    private String telefon;
    private String Ad;
    private String Soyad;
    private String aciklama;
    private String Email;
    private String password;

    public int getCustomer_Id() {
        return Customer_Id;
    }

    public void setCustomer_Id(int customer_Id) {
        Customer_Id = customer_Id;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getAd() {
        return Ad;
    }

    public void setAd(String ad) {
        Ad = ad;
    }

    public String getSoyad() {
        return Soyad;
    }

    public void setSoyad(String soyad) {
        Soyad = soyad;
    }

    public String getAciklama() {
        return aciklama;
    }

    public void setAciklama(String aciklama) {
        this.aciklama = aciklama;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return   getCustomer_Id() +"&"+
                 getTelefon() +"&"
                + getAd() + "&"+
                 getSoyad() + "&"+
                 getAciklama() + "&"+
                 getEmail() +  "&"+
                 getPassword() +"&"
                ;
    }
}
