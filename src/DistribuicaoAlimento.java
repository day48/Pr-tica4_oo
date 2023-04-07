public class DistribuicaoAlimento extends  Projeto{

   String descAlimento;
   Float qtde;

   public DistribuicaoAlimento(String nomeprojeto, String endereco, String descricao, String datainicio, String datafim) {
      super(nomeprojeto, endereco, descricao, datainicio, datafim);
   }

   public void validaProjeto(Boolean valida){
      if (datafim != null){
         valida = false;
      }
      else valida = true;
   }
   public void imprimeProjeto(String imprime) {

      System.out.println(nomeprojeto + descricao + datainicio + datafim + descAlimento + qtde);
   }
}