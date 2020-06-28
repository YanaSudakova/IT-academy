package homework6;

public class Test {
    public static void main(String[] args) {
        NBRBLoader nbrbLoader = new NBRBLoader();
        System.out.println(nbrbLoader.load(SiteLoader.Currency.EUR_NBRB));
        System.out.println(nbrbLoader.load(SiteLoader.Currency.RUS_NBRB));
        System.out.println(nbrbLoader.load(SiteLoader.Currency.USD_NBRB));

        AlfaBankLoader alfaBankLoader = new AlfaBankLoader();
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.EUR_ALFA));
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.RUS_ALFA));
        System.out.println(alfaBankLoader.load(SiteLoader.Currency.USD_ALFA));

        BelarusBankLoader belarusBankLoader = new BelarusBankLoader();
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.EUR_BELARUS));
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.RUS_BELARUS));
        System.out.println(belarusBankLoader.load(SiteLoader.Currency.USD_BELARUS));


    }
}
