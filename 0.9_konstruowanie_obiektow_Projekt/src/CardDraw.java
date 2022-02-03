import java.util.Random;

public class CardDraw {
    CardObjects co1;
    CardObjects co2;

    public CardObjects draw(){
        Random random = new Random();
        int card;
        card = random.nextInt(14)+1;

        switch (card){
            case 1:
                co1 = new CardObjects("as", 11);
                break;

            case 2:
                co1 = new CardObjects("dwa", 2);
                break;

            case 3:
                co1 = new CardObjects("trzy", 3);
                break;

            case 4:
                co1 = new CardObjects("cztery", 4);
                break;

            case 5:
                co1 = new CardObjects("piec", 5);
                break;

            case 6:
                co1 = new CardObjects("szesc", 6);
                break;

            case 7:
                co1 = new CardObjects("siedem", 7);
                break;

            case 8:
                co1 = new CardObjects("osiem", 8);
                break;

            case 9:
                co1 = new CardObjects("dziewiec", 9);
                break;

            case 10:
                co1 = new CardObjects("dziesiec", 10);
                break;

            case 11:
                co1 = new CardObjects("walet", 10);
                break;

            case 12:
                co1 = new CardObjects("dama", 10);
                break;

            case 13:
                co1 = new CardObjects("krol", 10);
                break;

            case 14:
                co1 = new CardObjects("inna", 0);
                break;
        }

        return co1;
    }
}
