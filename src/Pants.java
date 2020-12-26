public class Pants extends Сlothes implements MensClothing, WomensClothing{
    public Pants() {
    }

    public Pants(ClothingSize clothingSize, String color, int price) {
        super(clothingSize, color, price);
    }

    @Override
    public void dressMan() {

    }

    @Override
    public void dressWoman() {

    }
}
