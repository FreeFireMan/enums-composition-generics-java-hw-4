public class TShirt extends Сlothes implements MensClothing, WomensClothing {
    public TShirt() {
    }

    public TShirt(ClothingSize clothingSize, String color, int price) {
        super(clothingSize, color, price);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
