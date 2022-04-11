import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Scanner;

public class loadQuestionsAndAnswers {
    File f = new File("Pytania.csv");
    Scanner sc;
    private String question;
    private String a1, a2, a3;
    private String data;
    private String categoryName;

    public void load(String categoryName){
        try {
            sc = new Scanner(f);
            while(sc.hasNext()){
                data = sc.nextLine();
            }
            splitData(data, categoryName);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void splitData(String data, String categoryName){
        System.out.println("splitData");
        System.out.println("Wylosowana kategoria to: "+categoryName);
        String[] tab = data.split(";");
        switch (categoryName){
            case "Starozytnosc do powstania Rzymu":

                break;
            case "Starozytnosc po powstaniu Rzymu":

                break;
            case "Sredniowiecze":

                break;
            case "Nowozytnosc":

                break;
            case "Kolonializm":

                break;
            case "Wojny napoleonskie":

                break;
            case "I Wojna Swiatowa":

                break;
            case "II Wojna Swiatowa":

                break;
            case "Zimna Wojna":

                break;
            case "Historia wspolczesna (po upadku ZSRR)":

                break;
        }
    }

    public String getQuestion() {
        return question;
    }

    public String getA1() {
        return a1;
    }

    public String getA2() {
        return a2;
    }

    public String getA3() {
        return a3;
    }
}
