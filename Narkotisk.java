class Narkotisk extends Legemiddel{
  protected int narko;

//konstruktør til narkotisk, sender parametere til super og setter styrke
  public Narkotisk(String navnet, double prisen, double stoffet, int styrke){
    super(navnet, prisen, stoffet);
    narko = styrke;
  }
}
