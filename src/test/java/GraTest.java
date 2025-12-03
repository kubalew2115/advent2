import org.example.Gra;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class GraTest {

    private Gra gra;

    @BeforeEach
    void przygotuj() {
        gra = new Gra();
    }

    @Test
    void wygrana() {
        assertEquals(8, gra.obliczPunktyRundy("A Y"));
    }

    @Test
    void przegrana() {
        assertEquals(1, gra.obliczPunktyRundy("B X"));
    }

    @Test
    void remis() {
        assertEquals(6, gra.obliczPunktyRundy("C Z"));
    }

    @Test
    void caloscPrzyklad() {
        String[] linie = {"A Y", "B X", "C Z"};
        assertEquals(15, gra.obliczCalkowyWynik(linie));
    }
}