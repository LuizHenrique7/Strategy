public class Computador {

    private String arquivo1;

  public Computador(String arquivo1){
      this.arquivo1 = arquivo1;
  }

    public String salvar(Funcao funcao) { return funcao.salvar(arquivo1);}

}