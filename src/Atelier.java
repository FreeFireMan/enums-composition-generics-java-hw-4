import java.util.ArrayList;

public class Atelier {

    private ArrayList<Сlothes> clothes = new ArrayList<Сlothes>();

    public Atelier() {}

    public Atelier(ArrayList<Сlothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<Сlothes> getClothes() {
        return clothes;
    }

    public void setClothes(ArrayList<Сlothes> clothes) {
        this.clothes = clothes;
    }

    public ArrayList<MensClothing> mensChoice () {
        ArrayList<MensClothing> mensClothing = new ArrayList<MensClothing>();
        for (Сlothes сloth : this.clothes) {
            if(сloth instanceof MensClothing) {
                mensClothing.add((MensClothing) сloth);
            }
        }
        return mensClothing;
    }

    public ArrayList<WomensClothing> womensChoice () {
        ArrayList<WomensClothing> womensClothing = new ArrayList<WomensClothing>();
        for (Сlothes сloth : this.clothes) {
            if(сloth instanceof WomensClothing) {
                womensClothing.add((WomensClothing) сloth);
            }
        }
        return womensClothing;
    }
}
