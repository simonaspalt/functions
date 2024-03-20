public class Main {
    public static void main(String[] args) {
        System.out.println("======= 1 ========");
        ///Sukurkite Funkciją kuri priima du int tipo kintamuosius. Juos susumuoja ir atspausdina.
        System.out.println(sumOfInt(225, 66));

        System.out.println("======= 2 ========");
        //Sukurkite Funkciją kuri vadinasi PISq.
        // Funkcija gražina double tipo reikšmę. Reikšmė yra : 9.8596; Gautą reikšmę atspausdinkite.

        System.out.println(PISq());
        System.out.println("======= 3 ========");
        //Sukurkite Funkciją kuri priima du int tipo kintamuosius.
        // Funkcija gražina skaičių sandaugą.; Gautą reikšmę atspausdinkite.
        System.out.println(multiOfInt(2, 5));
        System.out.println("======= 4 ========");
        //Sukurkite Funkciją kuri priima int[] tipo kintamąį, prasuka ciklą ir
        // atspausdina kiekvieną skaičių vienoje eilutėje.
        // printArrayInLine();
        System.out.println("======= 5 ========");
        //Sukurkite Funkciją kuri priima du int tipo kintamuosius, min ir max reikšmėms
        // nustatyti ir sugeneruoja random int skaičių ir jį gražintų.
        System.out.println(randomIntNumber(3, 20));
        System.out.println("======= 6 ========");
        ///Sukurkite Funkciją kuri sugeneruotų random int skaičių masyvą ir jį gražintų.
        // Funkcija priima tris int tipo kintamuosius, min, max ir length reikšmėms nustatyti.
        arrayIntRandom(0, 99, 20);
        System.out.println("======= 7 ========");
        //Sukurkite Funkciją kuri panaudotų 6tos užduoties masyvą (priimtų kaip kintamąjį), susumuotų ir gražintų reikšmę.
        int[] array1 = arrayIntRandom(0, 99, 19);
        printArrayInLine(array1);
        System.out.println();
        System.out.println(sumOfArray(array1));
        System.out.println("======= 8 ========");
        //Sukurkite Funkciją kuri priimtų 6tos užduoties masyvą ir gražintų jos skaičių vidurkį (double).
        System.out.println(avrArr(array1));
        System.out.println("======= 9 ========");
        //Sukurkite Funkciją kuri priimtų du int skaičius ir atspausdintų stačiakampį užpildytą žvaigždutėmis.
        // Pirmas int - išoriniam ciklui, antras vidiniam
        starRectangle(3, 6);
        System.out.println("======= 10 ========");
        //Sukurkite Funkciją kuri priimtų sakinį kaip kintamąjį ir atspausdintų kiek jame yra raidžių(simbolių) ir tarpų.
        // Sakinys - “Šiandien labai graži diena”. (kodas turi veikti padavus bet kokį sakinį)
        textLength("Šiandien labai graži diena");
        System.out.println("======= 11 ========");
        //Sukurkite Funkciją kuri priimtų sakinį, jį užkoduotų ir grąžintų.
        // Kodavimas - sakinį apsukame iš kitos pusės. Pvz “Naglis” turi gautis “silgaN”.
        System.out.println(mirrorText("Šiandien labai graži diena"));
        System.out.println("======= 1 sunk ========");
        //Parašykite funkciją, kurios argumentas būtų tekstas, kuris būtų atspausdinamas konsolėje pridedant
        // “---” pradžioje ir gale. PVZ (---labas---)
        dashFrameText("labas");
        System.out.println("======= 2 sunk ========");
        //Sugeneruokite atsitiktinį stringą iš raidžių ir skaičių (10 simbolių).
        // Atspausdinkite simbolius stulpeliu. Jei tai skaičius apgaubkite “ [ 7 ]”. Jei skaičiai eina keli iš eilės,
        // apgaubkite juos kartu. [75].
        String rndText = generateRndStr(10);
        System.out.println(rndText);
        textNumInBrac(rndText);
        System.out.println("======= 3 sunk ========");
        //Parašykite funkciją, kuri skaičiuotų, ir gražintų iš kiek sveikų skaičių
        // jos argumentas dalijasi be liekanos (išskyrus vienetą ir patį save).
        System.out.println(isNumPrimary(53));
        System.out.println("======= 4 sunk ========");
        //Sugeneruokite masyvą iš 100 elementų, kurio reikšmės atsitiktiniai skaičiai nuo 33 iki 77.
        // Išrūšiuokite masyvą pagal daliklių be liekanos kiekį mažėjimo tvarka, panaudodami trečio uždavinio funkciją.
        int[] arrayA = arrayIntRandom(33, 77, 100);
        int[] arraySorted = new int[100];
        int highDiv = isNumPrimary(arrayA[0]);
        for (int i = 0; i < arrayA.length - 1; i++) {
            if ( i == arrayA.length - 2){
                if (isNumPrimary(arrayA[i]) < isNumPrimary(arrayA[i + 1])){
                    highDiv = isNumPrimary(arrayA[i + 1]);
                }
            }else {
                if (isNumPrimary(arrayA[i]) < isNumPrimary(arrayA[i + 1])){
                    highDiv = isNumPrimary(arrayA[i + 1]);
                }
            }
        }if (isNumPrimary(arrayA[i]) < isNumPrimary(arrayA[i + 1])){
            highDiv = isNumPrimary(arrayA[i + 1]);

        System.out.println(highDiv);




    }

    public static int isNumPrimary(int number) {
        int counter = 0;
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                counter++;
            }
        }
        return counter;
        // if num is primary function returns 0, if not then > 0
    }

    public static void textNumInBrac(String text) {
        System.out.println();
        if (Character.isDigit(text.charAt(0)) == true) {
            System.out.print("[");
            System.out.print(text.charAt(0));
            if (Character.isDigit(text.charAt(1)) == false) {
                System.out.print("]");
                System.out.println();
            }
        } else if (Character.isDigit(text.charAt(1)) == true) {
            System.out.print(text.charAt(0));
            System.out.println();
            System.out.print("[");
        }
        if (Character.isDigit(text.charAt(0)) == false && Character.isDigit(text.charAt(1)) == false) {
            System.out.print(text.charAt(0));
        }
        for (int i = 1; i < (text.length() - 1); i++) {
            if (Character.isDigit(text.charAt(i)) == true) {
                if (Character.isDigit(text.charAt(i + 1)) == true)
                    System.out.print(text.charAt(i));
                if (Character.isDigit(text.charAt(i + 1)) == false) {
                    System.out.print(text.charAt(i));
                    System.out.print("]");
                    System.out.println();
                }
            } else if (Character.isDigit(text.charAt(i)) == false) {
                if (Character.isDigit(text.charAt(i + 1)) == true) {
                    System.out.print(text.charAt(i));
                    System.out.println();
                    System.out.print("[");
                }
                if (Character.isDigit(text.charAt(i + 1)) == false) {
                    System.out.print(text.charAt(i));
                }
            }
        }
        if (Character.isDigit(text.charAt(text.length() - 1)) == true) {
            System.out.print(text.charAt(text.length() - 1));
            System.out.print("]");
        } else {
            System.out.print(text.charAt(text.length() - 1));
        }
    }

    public static String generateRndStr(int length) {
        String symbols = "ABCDEFGHIJKLMNOPQRSTUVWXYZ12345678901234567890";
        String text = "";
        for (int i = 0; i < length; i++) {
            text += symbols.charAt((int) (Math.random() * symbols.length()));
        }
        return text;
    }

    public static void dashFrameText(String text) {
        System.out.println("---" + text + "---");
    }

    public static String mirrorText(String text) {
        String mirrorText = "";
        for (int i = (text.length() - 1); i >= 0; i--) {
            mirrorText = mirrorText + text.charAt(i);
        }
        return mirrorText;
    }


    public static void textLength(String text) {
        System.out.println("Text has " + text.length() + " characters");
    }

    public static void starRectangle(int line, int collum) {
        System.out.println();
        for (int i = 0; i < line; i++) {
            for (int p = 0; p < collum; p++) {
                System.out.print(" *");
            }
            System.out.println();
        }

    }

    public static double avrArr(int[] array) {
        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return (sum / array.length);
    }

    public static int sumOfArray(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + array[i];
        }
        return sum;
    }

    public static int[] arrayIntRandom(int min, int max, int length) {
        int[] array = new int[length];
        for (int i = 0; i < length; i++) {
            int number = (int) Math.round(Math.random() * (max - min) + min);
            array[i] = number;
        }
        return array;
    }


    public static int randomIntNumber(int min, int max) {
        return (int) Math.round(Math.random() * (max - min) + min);
    }

    public static void printArrayInLine(int[] array) {
        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }
        System.out.println();
    }

    public static int multiOfInt(int number1, int number2) {
        return number1 * number2;
    }

    public static int sumOfInt(int number1, int number2) {
        return number1 + number2;
    }

    public static double PISq() {
        return 9.8596;
    }


}