package chain;

public class VicePresidente extends TomarDecisao {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValorDaCompra() < 30000F) {
            System.out.println("Compra aprovada pelo Vice-Presidente");
        }
        else if (sucessor != null) {
            sucessor.aprovar(compra);
        }
    }
}
