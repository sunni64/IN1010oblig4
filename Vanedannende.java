class Vanedannende extends Legemiddel{
  protected int vane;

//Konstruktør til vanedannende, sender til super og setter styrke
  public Vanedannende(String navnet, double prisen, double stoffet, int styrke){
    super(navnet, prisen, stoffet);
    vane = styrke;
  }
}
