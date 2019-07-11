package builder;

public class Cozinha {
    public void fazerSanduiche(SanduicheBuilder builder) {
        builder.abrePao();
        builder.insereIngredientes();
        builder.fechaPao();
    }
}
