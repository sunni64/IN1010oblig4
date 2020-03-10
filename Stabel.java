class Stabel<T> extends Lenkeliste<T> {

  //bruker metode fra super til å legge node bakerst
  public void leggPaa (T x) {
    super.leggTil(x);
  }

  //itererer seg frem til neste siste node og setter neste til null
  public T taAv() {
    T fjernet = super.fjern(stoerrelse-1);
    return fjernet;
  }

}
