package homework6;

public class AlfaBankLoader extends SiteLoader {
    public static final String RATE = "rate";
    public static final char COLON = ':';

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://developerhub.alfabank.by:8273/partner/1.0.0/public/nationalRates?currencyCode=" + currencyName.getId(), currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        int rateIndex = content.lastIndexOf(RATE); //запрашивает индекс "rate" lastIndexOf потому что первым идёт слово rates

        String substring = content.substring(rateIndex);//вытягивает данные начиная с "rate"
        int i = substring.indexOf(COLON); //запрашивает индекс ":"

        String value = substring.substring(i + 1, i + 9); //первое i - двоеточие + 1, второе двоеточие + 7, т.е. цифры 2.675300

        return Double.parseDouble(value); //выводит валюту (2.6753)
    }
}
