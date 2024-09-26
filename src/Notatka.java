/*
klasa: <Notatka>
opis: <klasa umożliwia tworzenie,wyswietlanie i diagnoze notatek z tytułem i trescia wraz z numerem id oraz licznkiem ich>
pola: <
int licznikNotatek - przechowuje wartosc liczbowa ktora sie zwieksza z kazda zrobiona notatka
int unikalnyIdentyfikator - przechowuje nr id ktory jest rowny wartoscia licznikNotatek
string tytul - przechowuje tekst stale napisowy zdefiniowany w funkcji main
string tresc -przechowuje tresc stale napisowa zdefiniowana w funkcji main
>
autor: <0000000000>
 */
public class Notatka {
    private static int licznikNotatek = 0;
    private int unikalnyIdentyfikator;
    protected String tytul;
    protected String tresc;

    public Notatka(String tytuł, String tresc) {
        this.tytul = tytuł;
        this.tresc = tresc;
        unikalnyIdentyfikator = licznikNotatek + 1;
        licznikNotatek++;

    }

    public void wyswietlanie() {
        System.out.println(tytul);
        System.out.println(tresc);
    }

    public void diagnoza() {
        System.out.println(unikalnyIdentyfikator + ";" + licznikNotatek + ";" + tytul + ";" + tresc);
    }
}
