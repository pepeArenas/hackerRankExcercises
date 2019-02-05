import java.text.NumberFormat;
import java.util.Currency;
import java.util.Locale;

public class CurrencyFormatter {

    public static void main(String[] args) {
        String french = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(12324.134);
        String integerInstance = NumberFormat.getIntegerInstance(Locale.FRANCE).format(12324.134);
        String numberInstance = NumberFormat.getNumberInstance(Locale.FRANCE).format(12324.134);
        String percentageInstance = NumberFormat.getPercentInstance(Locale.FRANCE).format(12324.134);

        Locale[] availableLocales = NumberFormat.getAvailableLocales();

        /*
        In order to create a new locale if there is not exist, we need to specify the language and the country
        The language must be in lowercase and the country must be in uppercase, then we just pass it to the
        NumberFormat.getCurrencyInstance(INDIA) for example
         */
        Locale INDIA = new Locale("en", "IN");


        String us = NumberFormat.getCurrencyInstance(Locale.US).format(12324.134);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(12324.134);
        String mexico = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("es_MX")).format(12324.134);
        String india = NumberFormat.getCurrencyInstance(INDIA).format(12324.134);

        System.out.println("Currency in french format: " + french);
        System.out.printf("Instance as integer: %s this will return as integer not decimal %n", integerInstance);
        System.out.printf("Instance as number: %s this will return as decimal with the comma separator %n", numberInstance);
        System.out.println("Instance as percentage: " + percentageInstance);
        System.out.println();
        System.out.println();

        for (int i = 0; i < availableLocales.length; i++) {
            System.out.printf("Country locale number %s.-%s %n", i, availableLocales[i].getDisplayCountry());
            System.out.printf("Locale locale number %s.-%s %n", i, availableLocales[i].getCountry());
        }

        System.out.println();
        System.out.println(us);
        System.out.println(china);
        System.out.println(mexico);
        System.out.println(india);
        System.out.println(Currency.getInstance(new Locale("hi", "IN")).getSymbol());
    }
}
