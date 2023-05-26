public class FuncaoSalvarSSD implements Funcao {

    @Override
    public String salvar(String arquivo1) {
        System.out.println("Arquivo salvo no SSD.");
        String arquivoSalvo = "Caminho do arquivo salvo no SSD";
        return arquivoSalvo;
    }
}
