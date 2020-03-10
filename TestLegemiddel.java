class TestLegemiddel {
  public static void main(String[] args) {

      Vanlig van = new Vanlig("antibac", 99.90, 2.3);
      System.out.println(van.hentId());
      System.out.println(van.hentNavn());
      System.out.println(van.hentVirkestoff());
      System.out.println(van.hentPris());
      van.settNyPris(69.69);
      System.out.println(van.hentPris());
      System.out.println(van.toString());


      Vanedannende vande = new Vanedannende("Prozac", 99.90, 2.3, 5);
      System.out.println(vande.hentId());
      System.out.println(vande.hentNavn());
      System.out.println(vande.hentVirkestoff());
      System.out.println(vande.hentPris());
      vande.settNyPris(69.69);
      System.out.println(vande.hentPris());
      System.out.println(vande.toString());


      Narkotisk nark = new Narkotisk("Heroin", 99.90, 2.3, 10);
      System.out.println(nark.hentId());
      System.out.println(nark.hentNavn());
      System.out.println(nark.hentVirkestoff());
      System.out.println(nark.hentPris());
      nark.settNyPris(69.69);
      System.out.println(nark.hentPris());
      System.out.println(nark.toString());

  }
}
