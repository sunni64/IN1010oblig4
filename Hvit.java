class Hvit extends Resept {

  public Hvit(Legemiddel legemiddel, Lege utskrivendeLege, int pasientId, int reiten){
    super(legemiddel, utskrivendeLege, pasientId, reiten);
  }

 @Override
 public String farge() {
   return "Hvit";
 }

 @Override
 public double prisAaBetale() {
   return medisin.hentPris();
 }

 public String toString(){
   String utskrift = "";
   utskrift += "ID: " + ID + "Legemiddel " + medisin + " Utskrivende lege: " + doktor + " PasientID: " + pasientID + " Reit: " + reit;
   return utskrift;
 }

}
