package chain;
//  é responsavel por APROVAR a compra,
// é aquela que aprovara a compra, ou entao repassara a responsabilidade para sucessor, ou seja, quem esta acima dele.
//
//e o metodo abastrato aprovar, que será implementado pelas classes que herdam da classe TomarDecisao
public  abstract class TomarDecisao {
    protected TomarDecisao sucessor;

    public void setSucessor(TomarDecisao sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void aprovar(Compra compra);
}
