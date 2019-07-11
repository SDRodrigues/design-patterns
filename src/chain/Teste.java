package chain;

public class Teste {
    public static void main(String[] args) {
        TomarDecisao presidente = new Presidente();

        TomarDecisao vicePresidente = new VicePresidente();

        TomarDecisao diretor = new Diretor();

        TomarDecisao gerente = new Gerente();

        gerente.setSucessor(diretor);

        diretor.setSucessor(vicePresidente);

        vicePresidente.setSucessor(presidente);

        Compra compra = new Compra(200F);
        gerente.aprovar(compra);

    }
}
