package hw17;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SimpleMathLibraryTest {
    @DisplayName("#add")
    @Test
    void add() {
        assertEquals(6.5, new SimpleMathLibrary().add(2.5, 4));
    }

    @DisplayName("#minus")
    @Test
    void minus() {
        assertEquals(1.5, new SimpleMathLibrary().minus(3, 1.5));
    }

    @DisplayName("#extractElements - when 1 four")
    @Test
    void extractElements_OneFour() {
        int[] intArray = {1, 2, 4, 5, 6};
        int[] expectedResult = {5, 6};
        assertArrayEquals(expectedResult, new SimpleMathLibrary().extractElements(intArray));
    }

    @DisplayName("#extractElements - when 2 fours")
    @Test
    void extractElements_TwoFour() {
        int[] intArray = {1, 2, 4, 5, 6, 4, 7, 8};
        int[] expectedResult = {5, 6, 4, 7, 8};
        assertArrayEquals(expectedResult, new SimpleMathLibrary().extractElements(intArray));
    }

    @DisplayName("#extractElements - when NO four")
    @Test
    void extractElements_NOFour() {
        int[] intArray = {1, 2, 5, 6, 7, 8};
        Throwable exception = assertThrows(RuntimeException.class, () -> SimpleMathLibrary.extractElements(intArray));
        assertEquals("There is no '4' in the array.", exception.getMessage());
    }

    @DisplayName("#checkArrayComposition - when array contains 1 & 4")
    @Test
    void checkArrayComposition_OneAndFour() {
        int[] intArray = {1, 1, 4, 4};
        assertTrue(SimpleMathLibrary.checkArrayComposition(intArray));
    }

    @DisplayName("#checkArrayComposition - when array contains only 1")
    @Test
    void checkArrayComposition_OnlyOne() {
        int[] intArray = {1, 1, 1};
        assertFalse(SimpleMathLibrary.checkArrayComposition(intArray));
    }

    @DisplayName("#checkArrayComposition - when array contains only 4")
    @Test
    void checkArrayComposition_OnlyFour() {
        int[] intArray = {4, 4, 4};
        assertFalse(SimpleMathLibrary.checkArrayComposition(intArray));
    }

    @DisplayName("#checkArrayComposition - when array contains NO 1 & 4")
    @Test
    void checkArrayComposition_NOOneAndFour() {
        int[] intArray = {5, 6, 7};
        assertFalse(SimpleMathLibrary.checkArrayComposition(intArray));
    }

}