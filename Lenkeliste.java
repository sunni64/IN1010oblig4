class Lenkeliste<T> implements Liste<T>{
  protected int stoerrelse = 0;
  class Node{
    Node neste = null;
    T data;
    Node(T x) {
      data = x;
    }
  }

  protected Node start = null;

  //sjekker hvor lang listen er
  public int stoerrelse(){
    return stoerrelse;
  }

  //legger til node på gitt posisjon
  public void leggTil(int pos, T x) throws UgyldigListeIndeks {
    if (pos < 0 || pos > stoerrelse) {
      throw new UgyldigListeIndeks(pos);
    }
    Node p = start;
    Node nyNode = new Node(x);
    if (pos == 0) {
      start = nyNode;
      start.neste = p;

      stoerrelse++;
      return;
    }
    for (int i = 0; i < pos-1; i++){
      p = p.neste;
    }
      Node spleis = p.neste;
      p.neste = nyNode;
      nyNode.neste = spleis;
      stoerrelse++;
  }


  //Legge til node bakerst i listen
  public void leggTil(T x) {
    Node p = start;
    if (start == null) {
      start = new Node(x);
      stoerrelse++;
    } else {
    while (p.neste != null) {
        p = p.neste;
      }
      p.neste = new Node(x);
      stoerrelse++;
  }
}

  //Gir en gitt node ny verdi
  public void sett(int pos, T x) throws UgyldigListeIndeks {
    if (pos < 0 || pos > stoerrelse-1) {
      throw new UgyldigListeIndeks(pos);
    }
    Node p = start;
    for (int i = 0 ; i < pos ; i++) {
      p = p.neste;
    }
    p.data = x;

  }

  //henter gitt node 
  public T hent(int pos) throws UgyldigListeIndeks {
    if (pos < 0 || pos > stoerrelse-1) {
      throw new UgyldigListeIndeks(pos);
    }
    Node p = start;
    for (int i=0 ; i<pos ; i++) {
      p = p.neste;
    }
    return p.data;
  }

//fjerne element på gitt indeks
  public T fjern(int pos) throws UgyldigListeIndeks {
    if (pos < 0 || pos > stoerrelse-1) {
      throw new UgyldigListeIndeks(pos);
    }
    Node p = start;
    if (pos == 0) {
      start = p.neste;
      stoerrelse--;
      return p.data;
    }
    for (int i = 0 ; i < pos-1 ; i++) {
      p = p.neste;
    }
    Node fjern = p.neste;
    Node spleis = fjern.neste;
    p.neste = spleis;
    stoerrelse--;
    return fjern.data;
  }

//fjerne elementet helt i starten av listen + returnere det
  public T fjern(){
    return fjern(0);
  }

}
