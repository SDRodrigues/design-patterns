package chain;

public class Diretor extends TomarDecisao {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValorDaCompra() < 10000F) {
            System.out.println("Compra aprovada pelo Diretor");
        }
        else if (sucessor != null) {
            sucessor.aprovar(compra);
        }
    }
}
