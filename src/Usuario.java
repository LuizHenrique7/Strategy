public class Usuario {

    private String arquivo;

    public String getArquivo() { return arquivo; }

    public void salvarHD(String arquivo1){
        Computador computador = new Computador(arquivo1);
        Funcao funcao = new FuncaoSalvarHD();
        this.arquivo = computador.salvar(funcao);
    }

    public void salvarSSD(String arquivo1){
        Computador computador = new Computador(arquivo1);
        Funcao funcao = new FuncaoSalvarSSD();
        this.arquivo = computador.salvar(funcao);
    }


    public void salvarNuvem(String arquivo1){
        Computador computador = new Computador(arquivo1);
        Funcao funcao = new FuncaoSalvarNuvem();
        this.arquivo = computador.salvar(funcao);
    }

}
