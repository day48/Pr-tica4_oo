public class  Projeto {
    String nomeprojeto;
    String endereco;
    String descricao;
    String datainicio;
    String datafim;

    public Projeto(String nomeprojeto, String endereco, String descricao, String datainicio, String datafim) {
        this.nomeprojeto = nomeprojeto;
        this.endereco = endereco;
        this.descricao = descricao;
        this.datainicio = datainicio;
        this.datafim = datafim;
    }

    public String getNomeprojeto() {
        return nomeprojeto;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getDatainicio() {
        return datainicio;
    }

    public String getDatafim() {
        return datafim;
    }

    public void setNomeprojeto(String nomeprojeto) {
        this.nomeprojeto = nomeprojeto;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void setDatainicio(String datainicio) {
        this.datainicio = datainicio;
    }

    public void setDatafim(String datafim) {
        this.datafim = datafim;
    }
    public void validaProjeto(Boolean valida){

    }
    public void imprimeProjeto(String imprime){

    }
}
