package chain;

public class Presidente extends TomarDecisao {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValorDaCompra() < 100000F ) {
            System.out.println("Compra aprovada pelo Presidente");
        }
        else {
            System.out.println("Compra nao aprovada");
        }
    }
}
