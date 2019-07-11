package chain;

public class Gerente extends TomarDecisao {
    @Override
    public void aprovar(Compra compra) {
        if (compra.getValorDaCompra() < 1000F) {
            System.out.println("Compra aprovada pelo Gerente.");
        }
        else if (sucessor != null) {
            sucessor.aprovar(compra);
        }

    }
}
