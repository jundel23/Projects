package CardGame;

public class Card{
  private Rank rank;
  private Suit suit;
  private boolean isfaceup;

  public Card(Rank r, Suit s){
    this.rank = r;
    this.suit = s;
    this.isfaceup = false;
  }
  public void flipCards(){
    isfaceup = true;
  }
  public String toString(){
    String str = "";
    if(this.isfaceup==true){
      str+= rank.getRank() + " of " + suit.getSuit();
    }
      return str;
  }
}