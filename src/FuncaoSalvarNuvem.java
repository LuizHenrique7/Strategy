public class FuncaoSalvarNuvem implements Funcao {

    @Override
    public String salvar(String arquivo1) {
        System.out.println("Arquivo salvo na Nuvem.");
        String arquivoSalvo = "Caminho do arquivo salvo na Nuvem";
        return arquivoSalvo;
    }
}
