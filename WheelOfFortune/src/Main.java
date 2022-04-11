import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Zmienne ustawien gry
        int playersCount;
        int gameRoundsCount;
        int categoryNumber; //Zmienna do losowania kategori

        Scanner sc = new Scanner(System.in);
        Random r = new Random();

        //Ustawianie gry
        System.out.println("Podaj ilosc graczy(2-4): ");
        playersCount = sc.nextInt();
        if (playersCount < 2 || playersCount > 4){
            System.out.println("Podana ilosc graczy jest zla.");
            System.exit(0);
        }else{
            System.out.println("Podaj ilosc rund w grze: ");
            gameRoundsCount = sc.nextInt();
        }

        //Losowanie kategorii
        System.out.println("Teraz zostanie wylosowana kategoria.");
        categoryNumber = r.nextInt(10)+1;

        /*
        1 - Starozytnosc do powstania Rzymu
        2 - Starozytnosc po powstaniu Rzymu
        3 - Sredniowiecze
        4 - Nowozytnosc
        5 - Kolonializm
        6 - Wojny napoleonskie
        7 - I Wojna Swiatowa
        8 - II Wojna Swiatowa
        9 - Zimna wojna
        10 - Historia wpolczesna (po upadku ZSRR)
         */

        Wheel wheel = new Wheel();
        String category;

        loadQuestionsAndAnswers loadQAA = new loadQuestionsAndAnswers();

        switch (categoryNumber){
            case 1:
                category = "Starozytnosc do powstania Rzymu";

                break;
            case 2:
                category = "Starozytnosc po powstaniu Rzymu";
                loadQAA.load(category);
                break;
            case 3:
                category = "Sredniowiecze";
                loadQAA.load(category);
                break;
            case 4:
                category = "Nowozytnosc";
                loadQAA.load(category);
                break;
            case 5:
                category = "Kolonializm";
                loadQAA.load(category);
                break;
            case 6:
                category = "Wojny napoleonskie";
                loadQAA.load(category);
                break;
            case 7:
                category = "I Wojna Swiatowa";
                loadQAA.load(category);
                break;
            case 8:
                category = "II Wojna Swiatowa";
                loadQAA.load(category);
                break;
            case 9:
                category = "Zimna Wojna";
                loadQAA.load(category);
                break;
            case 10:
                category = "Historia wspolczesna (po upadku ZSRR)";
                loadQAA.load(category);
                break;
        }
    }
}
