package week3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class checkPlayCount {
    @Test
    void checkPlayCount(){
        Game game = new Game();
        assertEquals(0, game.count);
        assertEquals(0, game.wins);

        game.makeGuess(game.secret);
        assertEquals(1, game.count);
        assertEquals(1,game.wins);

        game.makeGuess(-1);
        assertEquals(2, game.count);
        assertEquals(1, game.wins);

    }




}
