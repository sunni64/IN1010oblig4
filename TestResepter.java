class TestResepter {
  public static void main(String[] args) {
    //endre instanser til protected
    //if-sjekker med hva jeg forventer å få ut, skriv ut at det er noe feil hvis noe er feil + all info, ellers "fullført test"

    Narkotisk heroin = new Narkotisk("heroin", 99.90, 111.11, 101);
    Lege lege = new Lege("hansemann");

    //Vanlig hvit

    System.out.println("Tester hvit resept:");
    Hvit med1 = new Hvit(heroin, lege, 123, 4);
    System.out.println("forventer true:");
    if (med1.farge() == "Hvit") {
      System.out.println(true);
      System.out.println("fargetest fullf0rt");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("fargen er "+med1.farge());
    }
    System.out.println("forventer true:");
    if (med1.prisAaBetale() == 99.90){
      System.out.println(true);
      System.out.println("pristest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("prisen er "+med1.prisAaBetale());
    }
    System.out.println(med1.toString());

    System.out.println("");

    //Militær
    System.out.println("Tester militaerresept:");
    Militaer med2 = new Militaer(heroin, lege, 123, 4);
    System.out.println("forventer true");
    if (med2.farge() == "Hvit") {
      System.out.println(true);
      System.out.println("fargetest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("fargen er "+med2.farge());
    }
    System.out.println("forventer false");
    if (med2.prisAaBetale() == 99.90){
      System.out.println(true);
      System.out.println("pristest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("prisen er "+med2.prisAaBetale());
    }
    System.out.println(med2.toString());

    System.out.println("");

    //Presept
    System.out.println("tester presept: ");
    PResept med3 = new PResept(heroin, lege, 123, 4);
    System.out.println("forventer true");
    if (med3.farge() == "Hvit") {
      System.out.println(true);
      System.out.println("fargetest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("fargen er "+med3.farge());
    }
    System.out.println("forventer false");
    if (med3.prisAaBetale() == 99.90){
      System.out.println(true);
      System.out.println("pristest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("prisen er "+med3.prisAaBetale());
    }
    System.out.println(med3.toString());

    System.out.println("");

    //Blå resept
    System.out.println("tester blaa resept");
    Blaa med4 = new Blaa(heroin, lege, 123, 4);
    System.out.println("forventer false");
    if (med4.farge() == "Hvit") {
      System.out.println(true);
      System.out.println("fargetest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("fargen er "+med4.farge());
    }
    System.out.println("forventer false");
    if (med4.prisAaBetale() == 99.90){
      System.out.println(true);
      System.out.println("pristest fullfort");
    } else {
      System.out.println(false);
      System.out.println("noe er galt");
      System.out.println("prisen er "+med4.prisAaBetale());
    }
    System.out.println(med3.toString());
  }
}
