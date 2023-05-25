import java.util.ArrayList;

public class Kebab {
    private boolean salade = false;
    private boolean tomate = false;
    private boolean oignon = false;

    private boolean maïs = false;
    private boolean chouxRouge = false;
    private boolean piment = false;
    private boolean maxi = false;

    private ArrayList<String> listeSauces = new ArrayList<String>();

    private boolean feta = false;

    public Kebab(boolean salade, boolean tomate, boolean oignon, boolean maïs, boolean chouxRouge, boolean piment, boolean maxi, String sauce1, String sauce2, boolean feta) {
        this.salade = salade;
        this.tomate = tomate;
        this.oignon = oignon;
        this.maïs = maïs;
        this.chouxRouge = chouxRouge;
        this.piment = piment;
        this.maxi = maxi;
        this.feta = feta;

        if (sauce1.length() > 0) {
            this.listeSauces.add(sauce1);
        }

        if (sauce2.length() > 0) {
            this.listeSauces.add(sauce2);
        }
    }

    public Kebab() {}

    public void setSalade(boolean salade) {
        this.salade = salade;
    }

    public void setTomate(boolean tomate) {
        this.tomate = tomate;
    }

    public void setOignon(boolean oignon) {
        this.oignon = oignon;
    }

    public void setMaïs(boolean maïs) {
        this.maïs = maïs;
    }

    public void setChouxRouge(boolean chouxRouge) {
        this.chouxRouge = chouxRouge;
    }

    public void setPiment(boolean piment) {
        this.piment = piment;
    }

    public void setMaxi(boolean maxi) {
        this.maxi = maxi;
    }

    public void addSauce(String sauce) {
        this.listeSauces.add(sauce);
    }

    public void setFeta(boolean feta) {
        this.feta = feta;
    }

    @Override
    public String toString() {
        return "Paint ...";
    }
}
