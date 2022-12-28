package Entites;

public class Rent_House extends House{
    private String Kira_Sozlesmesi;
    private String Esya_Durumu;
    public Rent_House()
    {

    }

    public String getKira_Sozlesmesi() {
        return Kira_Sozlesmesi;
    }

    public void setKira_Sozlesmesi(String kira_Sozlesmesi) {
        Kira_Sozlesmesi = kira_Sozlesmesi;
    }

    public String getEsya_Durumu() {
        return Esya_Durumu;
    }

    public void setEsya_Durumu(String esya_Durumu) {
        Esya_Durumu = esya_Durumu;
    }
}
