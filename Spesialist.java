class Spesialist extends Lege implements Godkjenningsfritak {
  protected int kontrollID;

  public Spesialist(String navn, int ID) {
    super(navn);
    kontrollID = ID;
  }

  public int hentKontrollID() {
    return kontrollID;
  }

  public String toString(){
    String utskrift = "";
    utskrift += "Legens navn: " + navn + " og ID: " + kontrollID;
    return utskrift;
  }
}
