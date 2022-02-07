import java.util.ArrayList;

public class GameLogic {
    CardDraw cardDraw = new CardDraw();

    public void game(){
        ArrayList<CardObjects> playerCards = new ArrayList();
        ArrayList<CardObjects> dealerCards = new ArrayList();
        for (int i=0; i<2; i++){
            playerCards.add(cardDraw.draw());
            dealerCards.add(cardDraw.draw());
        }

        for (int i=0; i<2; i++){
            System.out.println("Twoje karty: "+playerCards.get(i));
        }
        System.out.println("Krupiec posiada kartę: "+dealerCards.get(0));

    }

}
