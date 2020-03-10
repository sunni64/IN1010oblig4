class Lege {
  protected String navn;

  public Lege(String navnet) {
    navn = navnet;
  }

  public String hentNavn(){
    return navn;
  }

  public String toString(){
    String utskrift = "";
    utskrift += "Legens navn: " + navn;
    return utskrift;
  }
}
