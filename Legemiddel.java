abstract class Legemiddel {
  protected  String navn;
  protected int ID = 0;
  protected static int teller = 0;
  protected double pris;
  protected double virkestoff;

//konstruktøren til legemiddel
  protected Legemiddel(String navnet, double prisen, double stoffet){
    navn = navnet;
    pris = prisen;
    virkestoff = stoffet;
    ID = teller;
    teller ++;

  }

  public int hentId(){
    return ID;
  }

  public String hentNavn(){
    return navn;
  }

  public double hentPris(){
    return pris;
  }

  public double hentVirkestoff(){
    return virkestoff;
  }

  public void settNyPris(double nyPris){
    pris = nyPris;
  }

//Gjør informasjonen til string
  public String toString(){
    String utskrift = "";

    utskrift += "Navn: " + navn + " ID: " + ID + " Pris: "
    + pris + " Virkestoff: " + virkestoff;

    return utskrift;
  }

}
