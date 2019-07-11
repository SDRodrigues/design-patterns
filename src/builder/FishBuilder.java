package builder;

public abstract class FishBuilder extends SanduicheBuilder {
    private Sanduiche sanduiche = new FishBurguer();

    public void abrePao(){
        System.out.println("Abre pão de hamburguer");
    }

    public void insereIngredientes(){
        System.out.println("Insere os ingredientes");
    }

    public void fecharPao(){
        System.out.println("Fecha pão de hamburguer");
    }

    public Sanduiche getSanduiche(){
        System.out.println("Hamburguer pronto!!!");
        return sanduiche;
    }
}
