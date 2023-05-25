public interface IBuilderSandwich {
    public Sandwich.BuilderSandwich addGarniture(String item);

    public Sandwich.BuilderSandwich estCuit();

    public Sandwich build();
}
