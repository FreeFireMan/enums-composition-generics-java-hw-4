public abstract class Сlothes {
    private ClothingSize clothingSize;
    private String color;
    private int price;

    public Сlothes(){}

    public Сlothes(ClothingSize clothingSize, String color, int price) {
        this.clothingSize = clothingSize;
        this.color = color;
        this.price = price;
    }

    public ClothingSize getClothingSize() {
        return clothingSize;
    }

    public void setClothingSize(ClothingSize clothingSize) {
        this.clothingSize = clothingSize;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
