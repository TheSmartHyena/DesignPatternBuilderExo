public class Main {
    public static void main(String[] args) {
        // Without builder pattern -> Multi line hard to read and maintain.
        Kebab kebab1 = new Kebab(true, true, true, true, false, true, true, "Blanche", "", false);

        Kebab kebab2 = new Kebab();
        kebab2.setMaxi(true);
        kebab2.setFeta(true);
        kebab2.setPiment(true);
        kebab2.setSalade(true);
        kebab2.setOignon(true);
        kebab2.setTomate(true);
        kebab2.addSauce("Andalouse");
        kebab2.addSauce("Harissa");

        Sandwich parisien = SandwichDirector.makeParisien();

        // With Builder pattern
    }
}