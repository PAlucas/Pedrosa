import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AppTest {

    @Test
    public void teste1(){
        Soma teste = new Soma(326);
        assertEquals("Quantidade de centenas3Quantidade de dezenas2Quantidade de unidades6", teste.fazerSoma());
    }

    @Test
    public void teste2(){
        Soma teste = new Soma(300);
        assertEquals("Quantidade de centenas3Quantidade de dezenas0Quantidade de unidades0", teste.fazerSoma());
    }

    @Test
    public void teste3(){
        Soma teste = new Soma(100);
        assertEquals("Quantidade de centenas1Quantidade de dezenas0Quantidade de unidades0", teste.fazerSoma());
    }

    @Test
    public void teste4(){
        Soma teste = new Soma(320);
        assertEquals("Quantidade de centenas3Quantidade de dezenas2Quantidade de unidades0", teste.fazerSoma());
    }

    @Test
    public void teste5(){
        Soma teste = new Soma(311);
        assertEquals("Quantidade de centenas3Quantidade de dezenas1Quantidade de unidades1", teste.fazerSoma());
    }

    @Test
    public void teste6(){
        Soma teste = new Soma(111);
        assertEquals("Quantidade de centenas1Quantidade de dezenas1Quantidade de unidades1", teste.fazerSoma());
    }

    @Test
    public void teste7(){
        Soma teste = new Soma(25);
        assertEquals("Quantidade de dezenas2Quantidade de unidades5", teste.fazerSoma());
    }

    @Test
    public void teste8(){
        Soma teste = new Soma(20);
        assertEquals("Quantidade de dezenas2Quantidade de unidades0", teste.fazerSoma());
    }

    @Test
    public void teste9(){
        Soma teste = new Soma(11);
        assertEquals("Quantidade de dezenas1Quantidade de unidades1", teste.fazerSoma());
    }

    @Test
    public void teste10(){
        Soma teste = new Soma(1);
        assertEquals("Quantidade de unidades1", teste.fazerSoma());
    }

    @Test
    public void teste11(){
        Soma teste = new Soma(7);
        assertEquals("Quantidade de unidades7", teste.fazerSoma());
    }

    @Test
    public void teste12(){
        Soma teste = new Soma(6);
        assertEquals("Quantidade de unidades6", teste.fazerSoma());
    }
}