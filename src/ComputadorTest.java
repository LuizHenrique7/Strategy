import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ComputadorTest {

    @Test
    public void deveSalvarArquivoHD() {

        Usuario usuario = new Usuario();
        String arquivo1 = "arquivo.txt";
        String expectedArquivoSalvo = "Caminho do arquivo salvo no HD";
        usuario.salvarHD(arquivo1);
        String actualArquivoSalvo = usuario.getArquivo();
        Assert.assertEquals(expectedArquivoSalvo, actualArquivoSalvo);
    }

    @Test
    public void deveSalvarArquivoSSD() {

        Usuario usuario = new Usuario();
        String arquivo1 = "arquivo.txt";
        String expectedArquivoSalvo = "Caminho do arquivo salvo no SSD";
        usuario.salvarSSD(arquivo1);
        String actualArquivoSalvo = usuario.getArquivo();
        Assert.assertEquals(expectedArquivoSalvo, actualArquivoSalvo);
    }

    @Test
    public void deveSalvarArquivoNuvem() {

        Usuario usuario = new Usuario();
        String arquivo1 = "arquivo.txt";
        String expectedArquivoSalvo = "Caminho do arquivo salvo na Nuvem";
        usuario.salvarNuvem(arquivo1);
        String actualArquivoSalvo = usuario.getArquivo();
        Assert.assertEquals(expectedArquivoSalvo, actualArquivoSalvo);
    }

}