import java.util.Scanner;

public class ShowInformationToPlayer {
    private String choose;
    Scanner sc= new Scanner(System.in);
    public void showOptions(){
        System.out.println("S) Stand, H) Hit, P) Split, W) Automatilcy Win");
        System.out.println("Wybierz co chcesz zrobic: ");

        choose = sc.nextLine().toLowerCase();

        switch (choose){
            case "s":

                break;

            case "h":

                break;

            case "p":

                break;

            case "w":

                break;
        }
    }
}
