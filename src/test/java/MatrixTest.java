import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.sql.Array;

import static org.junit.jupiter.api.Assertions.*;

class MatrixTest {

    @BeforeEach
    void setUp() {

    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void avgArray() {
        Matrix array01 = new Matrix();
        int [] array = {1,3,5,7};
        assertEquals(4.0, array01.avgArray(array));

    }



    @Test
    void isMatrixSquare() {
        Matrix matrix02 = new Matrix();
        Integer[][] arrayM = {
                {3,5,8},
                {2,4,6},
                {1,3,2}

        };
        assertTrue(matrix02.isMatrixSquare(arrayM));

            }
    @Test
    void isMatrixNotSquare() {
        Matrix matrix02 = new Matrix();
        Integer[][] arrayM = {
                {3,5,8},
                {2,4,6},
                {1,3}

        };
        assertFalse(matrix02.isMatrixSquare(arrayM));

    }












}



