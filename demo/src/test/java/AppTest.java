import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

/********************************************[CASOS DE SUCESSO]******************************************/

    @Test
    public void testeBuscaProfSoned(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor soned = app.buscaProf(10); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Soned", soned.getNome());
        assertEquals(17, soned.getHorarioDeAtendimento());
        assertEquals("integral", soned.getPeriodo());
    }

    @Test
    public void testeBuscaProfGuilherme(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor guilherme = app.buscaProf(20); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Guilherme", guilherme.getNome());
        assertEquals(15, guilherme.getHorarioDeAtendimento());
        assertEquals("integral", guilherme.getPeriodo());
    }
    
    @Test
    public void testeBuscaProfYvo(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor yvo = app.buscaProf(30); //passando o ID que o MOCK trata
                                                //se passar ID != 10 vai falhar (diferente)

        assertEquals("Yvo", yvo.getNome());
        assertEquals(19, yvo.getHorarioDeAtendimento());
        assertEquals("noturno", yvo.getPeriodo());
    }


/*********************************************[CASOS DE FALHA]********************************************/

    @Test
    public void testeBuscaFalhaNome(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaNome = app.buscaProf(0);

        assertEquals("Erro", falhaNome.getNome());
        assertEquals(19, falhaNome.getHorarioDeAtendimento());
        assertEquals("noturno", falhaNome.getPeriodo());
    }

    @Test
    public void testeBuscaFalhaHorario(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaHorario = app.buscaProf(1);

        assertEquals("Yvo", falhaHorario.getNome());
        assertNotSame(19, falhaHorario.getHorarioDeAtendimento()); //o horario correto seria 19h
                                                                              //ou seja, para ocorrer erro
                                                                              //deve vir qualquer coisa menos 19
        assertEquals("noturno", falhaHorario.getPeriodo());
    }

    @Test
    public void testeBuscaFalhaPeriodo(){

        Service service = new Mock();
        App app = new App(service); //Instanciando Classe e passando o parametro que
                                    //INJETA as dependencias (MOCK) que sao requeridas
                                    //pelo CONSTRUTOR da Classe

        Professor falhaPeriodo = app.buscaProf(2);

        assertEquals("Soned", falhaPeriodo.getNome());
        assertEquals(17, falhaPeriodo.getHorarioDeAtendimento());
        assertEquals("tarde", falhaPeriodo.getPeriodo());
    }

}
