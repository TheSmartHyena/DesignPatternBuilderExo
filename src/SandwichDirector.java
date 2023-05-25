public class SandwichDirector {
    public static Sandwich makeParisien() {
        return new Sandwich.BuilderSandwich("Baguette classique").addGarniture("Jambon").addGarniture("Beure").build();
    }
}
