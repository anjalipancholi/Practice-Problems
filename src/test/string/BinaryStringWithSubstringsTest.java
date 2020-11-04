package string;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinaryStringWithSubstringsTest {

    @Test
    void queryString() {
        System.out.println("Starting queryString");
    }

    @Test
    void convertToBinary() {
        assertEquals("1010", BinaryStringWithSubstrings.convertToBinary(10));
    }
}
