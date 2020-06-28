package homework6;

public class BelarusBankLoader extends SiteLoader{
    public static final char COLON = ':';

    /**
     * Метод для запуска загрузки курса валют
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    public double load(Currency currencyName) {
        return load("https://belarusbank.by/api/kursExchange", currencyName);
    }

    /**
     * Обработка результата загрузки с сайта банка
     * @param content то что получилось загрузить
     * @param currencyName валюта которую мы ищем
     * @return курс который мы нашли
     */
    @Override
    protected double handle(String content, Currency currencyName) {
        int rateIndex = content.indexOf(currencyName.getId()); //запрашивает USD_out

        String substring = content.substring(rateIndex);//вытягивает данные начиная с "USD_out"
        int i = substring.indexOf(COLON); //запрашивает индекс ":"

        String value = substring.substring(i + 2, i + 8); //первое i - двоеточие + 2 (т.к. есть кавычки), второе двоеточие + 8, т.е. цифры 2.4050

        return Double.parseDouble(value); //выводит валюту (2.405)
    }
}
