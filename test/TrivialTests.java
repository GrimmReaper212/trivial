import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import smellytrivial.Game;

public class TrivialTests {
    @Test
    public void true_is_true(){
        Assertions.assertTrue(false);
    }

    @Test
    public void crear_Game(){
        Game trivial = new Game();
    }

    @Test
    public void si_al_principio_saco_un_1_voy_a_casilla_1(){

        //Arrange
        Game sut = new Game();
        sut.agregar("Maria");
        sut.agregar("Juan");

        sut.tirarDado(1);

        String expected = "La nueva posición de Maria es 1";

        //Act
        String actual = sut.nuevaPosicionJugador();

        //Assert
        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void problema1(){
        Game sut = new Game();
        sut.agregar("Maria");

        Boolean expected = false;
        Boolean actual = sut.esJugable();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void problema2() throws ArrayIndexOutOfBoundsException{
        Game juego = new Game();
        try {
            juego.agregar("Maria");
            juego.agregar("Juan");
            juego.agregar("Antonio");
            juego.agregar("Mario");
            juego.agregar("Juana");
            juego.agregar("Antonia");
            juego.agregar("Antonia");

            Boolean expected = false;
            Boolean actual = juego.esJugable();
            Assertions.assertEquals(expected, actual);
        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No se puede más de 6 jugadores");
        }
    }
}
