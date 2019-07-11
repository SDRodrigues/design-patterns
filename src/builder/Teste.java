package builder;

public class Teste {
    public static void main(String[] args){
        Cozinha cozinha = new Cozinha();

        SanduicheBuilder builder1 = new HamburguerBuilder();
//        SanduicheBuilder builder2 = new FishBuilder();

        cozinha.fazerSanduiche(builder1);
        builder1.getSanduiche();
    }
}
