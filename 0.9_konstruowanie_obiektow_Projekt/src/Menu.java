import java.util.Scanner;

public class Menu {
    GameLogic gameLogic = new GameLogic();

    public void menuInit(){
        Scanner sc = new Scanner(System.in);
        boolean on = true;

        while (on){
            System.out.println("Podaj opcje ktora chcesz wybrac: \n"
                    +"1 - Rozpocznij \n"
                    +"2 - Wyjdz");
            String option = sc.nextLine();
            switch(option){
                case "1":
                    gameLogic.game();
                    break;

                case "2":
                    on = false;
                    break;

                default:
                    System.out.println("Nie ma takiej opcji");
            }
        }
    }
}
