class PResept extends Hvit {
  protected double rabatt = 108;
  protected double pris;

  protected PResept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reiten){
    super(legemiddel, utskrivendeLege, pasientId, 3);
  }

  public String toString(){
    String utskrift = "";
    utskrift += "ID: " + ID + "Legemiddel " + medisin + " Utskrivende lege: " + doktor + " PasientID: " + pasientID + " Reit: " + reit;
    return utskrift;
  }

  @Override
  public String farge() {
    return "Hvit";
    }

  @Override
  public double prisAaBetale() {
    if (medisin.hentPris() < rabatt) {
      return 0;
    } else {
      return medisin.hentPris() - rabatt;
    }
  }
}
