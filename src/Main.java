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
        arrayIntRandom(0,99,20);
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
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);

        }
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