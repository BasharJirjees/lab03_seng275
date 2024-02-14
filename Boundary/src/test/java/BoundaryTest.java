
import com.mycompany.boundary.Boundary;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import java.util.stream.Stream;
import java.lang.IllegalArgumentException;
import static org.junit.jupiter.api.Assertions.*;

class BoundaryTest {
    @Test
    void isUnsafeTest() {

        //Testing with volume above 85

        assertTrue(Boundary.isUnsafe(120));


        //Testing with volume below 85

        assertFalse(Boundary.isUnsafe( 50));


        //Testing with volume below 0 for checking program execution safety


        assertFalse(Boundary.isUnsafe(-5));



        //Testing with for positive overflow

        assertTrue(Boundary.isUnsafe((int)2e35));


        //Testing with for negative overflow

        assertFalse(Boundary.isUnsafe((int)-2e-35));


    }
    @Test
    public void isComfortableTest(){



        //Testing with temperature above 20

        assertFalse(Boundary.isComfortable(100));

        //Testing with temperature within the range >= 5 and <= 20

        assertTrue(Boundary.isComfortable(15));


        //Testing with temperature below the minimal boundary of <=5

        assertFalse(Boundary.isComfortable(4));



        //Testing with for positive overflow

        assertFalse(Boundary.isComfortable((int)2e35));


        //Testing with for negative overflow

        assertFalse(Boundary.isComfortable((int)-2e-35));



    }

    @Test
    public void elevatorsRequiredTest(){


        //Testing with storeys above 6

        assertEquals(2, Boundary.elevatorsRequired(100));

        //Testing with storeys < 6

        assertEquals(1, Boundary.elevatorsRequired(5));

        //Testing with storeys = 1

        assertEquals(0, Boundary.elevatorsRequired(1));


        //Testing with for positive overflow

        assertEquals(2, Boundary.elevatorsRequired((int)2e35));


        //Testing with for negative overflow

        assertEquals(0 ,Boundary.elevatorsRequired((int)-2e-35));
    }


    @Test
    public void percentageToLetterGradeTest() throws IllegalArgumentException{

        //Testing above boundary 100
        
        assertThrows(IllegalArgumentException.class, ()->  Boundary.percentageToLetterGrade(150.0));


        //Testing within boundary 0 and 100
        
        assertEquals("B", Boundary.percentageToLetterGrade(75.0));


        //Testing below the boundary 0
        
        assertThrows(IllegalArgumentException.class, () -> Boundary.percentageToLetterGrade(-1.0));


        //Testing with for positive overflow

        assertThrows(IllegalArgumentException.class, () -> Boundary.percentageToLetterGrade(2e35));


        //Testing with for negative overflow

        assertThrows(IllegalArgumentException.class, () -> Boundary.percentageToLetterGrade((-2e-35)));


    }



}