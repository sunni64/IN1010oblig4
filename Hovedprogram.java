class Hovedprogram {
  public static void main(String[] args) {

    //lager Legemiddel av hver type og tester alt
    Narkotisk heroin = new Narkotisk("heroin", 99.90, 111.11, 101);
    System.out.println(heroin.hentId());
    System.out.println(heroin.hentNavn());
    System.out.println(heroin.hentVirkestoff());
    System.out.println(heroin.hentPris());
    heroin.settNyPris(69.69);
    System.out.println(heroin.hentPris());
    System.out.println(heroin.toString());

    Vanedannende prozac = new Vanedannende("prozac", 88.80, 222.22, 202);
    System.out.println(prozac.hentId());
    System.out.println(prozac.hentNavn());
    System.out.println(prozac.hentVirkestoff());
    System.out.println(prozac.hentPris());
    prozac.settNyPris(69.69);
    System.out.println(prozac.hentPris());
    System.out.println(prozac.toString());

    Vanlig smertestillende =  new Vanlig("smertestillende", 77.70, 333.33);
    System.out.println(smertestillende.hentId());
    System.out.println(smertestillende.hentNavn());
    System.out.println(smertestillende.hentVirkestoff());
    System.out.println(smertestillende.hentPris());
    smertestillende.settNyPris(69.69);
    System.out.println(smertestillende.hentPris());
    System.out.println(smertestillende.toString());

    //Så til legene! her innså jeg intensjonen deres med toString()
    Lege lege = new Lege("hansemann");
    Spesialist spesialist = new Spesialist("smartingen", 123);

    System.out.println(lege.toString());
    System.out.println(spesialist.toString());

    //hvit resept

    Hvit med1 = new Hvit(prozac, lege, 123, 4);
    System.out.println(med1.farge());
    System.out.println(med1.prisAaBetale());
    System.out.println(med1.toString());


    //Militær

    Militaer med2 = new Militaer(prozac, lege, 123, 4);
    System.out.println(med2.farge());
    System.out.println(med2.prisAaBetale());
    System.out.println(med2.toString());

    //Presept

    PResept med3 = new PResept(smertestillende, lege, 123, 4);
    System.out.println(med3.farge());
    System.out.println(med3.prisAaBetale());
    System.out.println(med3.toString());

    //Blå resept

    Blaa med4 = new Blaa(heroin, spesialist, 123, 4);
    System.out.println(med4.farge());
    System.out.println(med4.prisAaBetale());
    System.out.println(med4.toString());

    //Resept

    System.out.println(med4.hentId());
    System.out.println(med4.hentLegemiddel());
    System.out.println(med4.hentLege());
    System.out.println(med4.hentPasientId());
    System.out.println(med4.hentReit());
    System.out.println(med4.bruk());






  }
}
