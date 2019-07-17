package builder;

public class Teste {
    public static void main(String[] args){
        var cozinha = new Cozinha();

        SanduicheBuilder builder1 = new HamburguerBuilder();
        cozinha.fazerSanduiche(builder1);
        builder1.getSanduiche();

        SanduicheBuilder builder2 = new FishBuilder();
        cozinha.fazerSanduiche(builder2);
        builder2.getSanduiche();
    }
}
