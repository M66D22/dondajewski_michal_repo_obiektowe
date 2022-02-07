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

    public void showInformation(){
        System.out.println("Podaj opcje, ktora chczesz wybrac: \n"+
                "1) Rozpocznij Gre\n"+
                "2) Wyjdz");
    }
    public void defaultInSwitch(){
        System.out.println("Nie ma takiej opji!");
    }
}
