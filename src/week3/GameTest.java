package week3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GameTest {
    @Test
    void checkSecret(){
        Game game = new Game();
        boolean validSecret = game.secret > 0 && game.secret < 11;
        assertTrue(validSecret);
    }

}