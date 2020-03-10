class Pasient {
  protected String navn;
  protected String fdsnum;
  protected int ID;
  protected static int teller = 0;

  public Pasient(String navnet, String nummeret) {
    navn = navnet;
    fdsnum = nummeret;
    ID = teller;
    teller++; 
  }
}
