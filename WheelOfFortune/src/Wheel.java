import java.util.Scanner;

public class Wheel {
    String question;
    String answer1, answer2, answer3;
    String userAnswer;
    String correctAnswer;

    loadQuestionsAndAnswers loadQuestionsAndAnswers = new loadQuestionsAndAnswers();

    Scanner sc = new Scanner(System.in);

    private void checkAnswer(){
        switch(userAnswer){
            case "a":

                break;
            case "b":

                break;
            case "c":

                break;
            default:
                System.out.println("Taka odpowiedz nie istnieje!");
                break;
        }
    }
}