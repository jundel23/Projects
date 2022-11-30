public class Card{
  private String rank;
  private String suit;

  public Card(){
    rank = "ace";
    suit = "clubs";
  }
  public Card(String r, String s){
    rank = r;
    suit = s;
  }
  public String getRank(){
    return rank;
  }
  public String getSuit(){
    return suit;
  }
  public String toString(){
    return "rank: " + rank + "\n suit: " + suit;
  }
  public String compareTo(){
    return rank + "of " + suit;
  }
}