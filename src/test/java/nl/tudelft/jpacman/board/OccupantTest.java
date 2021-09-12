package nl.tudelft.jpacman.board;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Test suite to confirm that {@link Unit}s correctly (de)occupy squares.
 *
 * @author Jeroen Roosen 
 *
 */
class OccupantTest {

    /**
     * The unit under test.
     */
    private Unit unit;

    /**
     * Resets the unit under test.
     */
    @BeforeEach
    void setUp() {
        unit = new BasicUnit();
    }

    /**
     * Asserts that a unit has no square to start with.
     */
    @Test
    void noStartSquare() {
        // Remove the following placeholder:
        assertThat(unit.hasSquare()).isFalse();
    }

    /**
     * Tests that the unit indeed has the target square as its base after
     * occupation.
     */
    @Test
    void testOccupy() {
        // Remove the following placeholder:
        Square sq = new BasicSquare();
        unit.occupy(sq);
        assertThat(unit.hasSquare()).isTrue();
        assertThat(unit.getSquare()).isEqualTo(sq);
        assertThat(sq.getOccupants().size()).isEqualTo(1);
        assertThat(sq.getOccupants().get(0)).isEqualTo(unit);
    }

    /**
     * Test that the unit indeed has the target square as its base after
     * double occupation.
     */
    @Test
    void testReoccupy() {
        // Remove the following placeholder:
        Square sq1 = new BasicSquare();
        unit.occupy(sq1);
        Square sq2 = new BasicSquare();
        assertThat(sq2.getOccupants()).isEmpty();
        unit.occupy(sq2);
        assertThat(unit.hasSquare()).isTrue();
        assertThat(unit.getSquare()).isEqualTo(sq2);
        assertThat(sq2.getOccupants().size()).isEqualTo(1);
        assertThat(sq2.getOccupants().get(0)).isEqualTo(unit);
    }
}
