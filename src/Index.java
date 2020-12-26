import java.util.ArrayList;

public class Index {

    public static void main(String[] args) {
      Dress dress = new Dress(ClothingSize.S, "blue", 5);
      Pants pants = new Pants(ClothingSize.M, "black", 4);
      Tie tie = new Tie(ClothingSize.XXS, "yellow", 1);
      TShirt tshirt = new TShirt(ClothingSize.M, "white", 2);

      ArrayList<Сlothes> clothes = new ArrayList<Сlothes>();
      clothes.add(dress);
      clothes.add(pants);
      clothes.add(tie);
      clothes.add(tshirt);

      Atelier atelier = new Atelier(clothes);


      ArrayList<MensClothing> mensClothing = atelier.mensChoice();
      ArrayList<WomensClothing> womensClothing = atelier.womensChoice();

      System.out.println(mensClothing + " <-- mensClothing");
      System.out.println(womensClothing + " <-- womensClothing");

    }
}
