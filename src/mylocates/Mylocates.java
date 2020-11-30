package Mylocates;
     import java.text.NumberFormat;
        import java.text.SimpleDateFormat;
        import java.util.Date;
        import java.util.Locale;


public class Mylocates {


    public static void main(String[] args) {
           

       Locale.setDefault(new Locale("ru", "KZ"));
       Locale current = Locale.getDefault();

        System.out.println(current.getCountry()); 
        System.out.println(current.getDisplayCountry());
        System.out.println(current.getLanguage());
        System.out.println(current.getDisplayLanguage());
        System.out.println();

        Locale[] locales = new Locale[]{Locale.JAPAN, new Locale("ro", "RO"), new Locale("sr", "RS"),new Locale("zh", "TW"), new Locale("am", "ET"),new Locale("es", "CL"),};

        for (Locale locale : locales) {
            NumberFormat currencyFormat = NumberFormat.getCurrencyInstance(locale);
            System.out.println("Валюта: "+locale.getDisplayName() + " = " + "   "
                    + currencyFormat.format(100) );
        }
        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }


        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full date format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getDateInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Short time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.SHORT, locale).format(new Date()));
        }



        System.out.println();
        for (Locale locale : locales) {
            System.out.println("Full time format in " + locale.getDisplayName() + " = "
                    + SimpleDateFormat.getTimeInstance(SimpleDateFormat.FULL, locale).format(new Date()));
        }

    }
}
