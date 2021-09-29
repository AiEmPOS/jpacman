package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
public class BoardTest {
    private final BasicSquare[][] grid = {
        {new BasicSquare()}
    };
    private Board board;

    @BeforeEach
    void setUp() {
        board = new Board(grid);
    }

    @Test
    void testBoard() {
        assertThat(board.getHeight()).isEqualTo(1);
        assertThat(board.getWidth()).isEqualTo(1);
        assertThat(board.squareAt(0, 0)).isEqualTo(grid[0][0]);
    }

    @Test
    void testNullBoard() {
        assertThatThrownBy(() -> board = new Board(null)).isInstanceOf(AssertionError.class);
//        assertThatThrownBy(() -> board = new Board(null)).isInstanceOf(NullPointerException.class);

//        board = new Board(null);
//        assertThat(board.getHeight()).isEqualTo(0);
//        assertThat(board.getWidth()).isEqualTo(0);
//        assertThat(board.squareAt(0, 0)).isEqualTo(null);
    }

    @Test
    void testNullSqure(){
        assertThatThrownBy(() -> board = new Board(new BasicSquare[1][1])).isInstanceOf(AssertionError.class); // fully cover the invariant method
    }

}
