abstract class Resept {
  protected int ID;
  protected static int teller = 0;
  protected Legemiddel medisin;
  protected Lege doktor;
  protected int pasientID;
  protected int reit;

  public Resept(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reiten) {
    medisin = legemiddel;
    doktor = utskrivendeLege;
    pasientID = pasientId;
    reit = reiten;
    ID = teller;
    teller ++;
  }

  public int hentId() {
    return ID;
  }

  public Legemiddel hentLegemiddel() {
    return medisin;
  }

  public Lege hentLege() {
    return doktor;
  }

  public int hentPasientId() {
    return pasientID;
  }

  public int hentReit() {
    return reit;
  }

  public boolean bruk() {
    if (reit < 1) {
      return false;
    } else {
      reit -= 1;
      return true;
    }
  }

  abstract public String farge();

  abstract public double prisAaBetale();

}
