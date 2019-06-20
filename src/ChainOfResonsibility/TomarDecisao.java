package ChainOfResonsibility;
public  abstract class TomarDecisao {
    protected TomarDecisao sucessor;

    public void setSucessor(TomarDecisao sucessor) {
        this.sucessor = sucessor;
    }

    public abstract void aprovar(Compra compra);
}
