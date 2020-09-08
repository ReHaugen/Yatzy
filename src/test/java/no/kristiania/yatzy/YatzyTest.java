package no.kristiania.yatzy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class YatzyTest {

    private YatzyGame yatzyGame;

    @Test
    void shouldScoreOnes(){
        yatzyGame = new YatzyGame();
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] {1, 1, 2, 1, 1}));
        assertEquals(4, yatzyGame.score(YatzyCategory.ONES, new int[] {6, 5, 2, 1, 1}));
    }

}

