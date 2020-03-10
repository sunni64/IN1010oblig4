class Blaa extends Resept {

  protected Blaa(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reiten){
    super(legemiddel, utskrivendeLege, pasientId, reiten);
  }

  public String toString(){
    String utskrift = "";
    utskrift += "ID: " + ID + "Legemiddel " + medisin + " Utskrivende lege: " + doktor + " PasientID: " + pasientID + " Reit: " + reit;
    return utskrift;
  }

  @Override
  public String farge() {
    return "Blaa";
    }

  @Override
  public double prisAaBetale() {
    return medisin.hentPris()*0.25;
  }
}
