public class  Recursos {
    private  boolean mensagem;
    private  boolean internet;
    private  boolean email;
    private  boolean radio;
    private  boolean tv;
    private  boolean arquivo;
    float preco;

    public Recursos() {
        this.mensagem = mensagem;
        this.internet = internet;
        this.email = email;
        this.radio = radio;
        this.tv = tv;
        this.preco = preco;
    }

    public boolean isMensagem() {
        return mensagem;
    }

    public void setMensagem(boolean mensagem) {
        this.mensagem = mensagem;
    }

    public boolean isInternet() {
        return internet;
    }

    public void setInternet(boolean internet) {
        this.internet = internet;
    }

    public boolean isEmail() {
        return email;
    }

    public void setEmail(boolean email) {
        this.email = email;
    }

    public boolean isRadio() {
        return radio;
    }

    public void setRadio(boolean radio) {
        this.radio = radio;
    }

    public boolean isTv() {
        return tv;
    }

    public void setTv(boolean tv) {
        this.tv = tv;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }
}
