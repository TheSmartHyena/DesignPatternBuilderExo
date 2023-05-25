import java.util.ArrayList;

public class Sandwich {
    private String typePain = "";
    private boolean cuit = false;
    private ArrayList<String> ingredients = new ArrayList<String>();

    private Sandwich(BuilderSandwich builder) {
        this.cuit = builder.cuit;
        this.typePain = builder.typePain;
        this.ingredients = builder.ingredients;
    }

    public static class BuilderSandwich implements IBuilderSandwich {
        private String typePain = "";
        private boolean cuit = false;
        private ArrayList<String> ingredients = new ArrayList<String>();

        public BuilderSandwich(String typePain) {
            this.typePain = typePain;
        }

        @Override
        public BuilderSandwich addGarniture(String item) {
            this.ingredients.add(item);
            return this;
        }

        public BuilderSandwich estCuit() {
            this.cuit = true;
            return this;
        }

        @Override
        public Sandwich build() {
            return new Sandwich(this);
        }
    }
}
