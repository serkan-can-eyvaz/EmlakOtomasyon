package Entites;

public class Sale_House extends House{
  private String karMarjı;

  public int hesapla(int aylık)
  {
      return aylık*7;
  }

    public String getKarMarjı() {
        return karMarjı;
    }

    public void setKarMarjı(String karMarjı) {
        this.karMarjı = karMarjı;
    }
}
