import java.util.ArrayList;

public class GameLogic {
    CardDraw cardDraw = new CardDraw();

    public void game(){
        ArrayList<CardObjects> playerCards = new ArrayList();
        for (int i=0; i<2; i++){
            playerCards.add(cardDraw.draw());
        }

        System.out.println(playerCards);
    }

    public void playerTour(){

    }

    public void oponentTour(){
        
    }
}
