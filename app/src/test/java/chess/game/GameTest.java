package chess.game;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {
    private static final Game G = new Game();

    @Test
    public void testAdd() {
        assertEquals(7, G.add(3, 4));
    }
}
