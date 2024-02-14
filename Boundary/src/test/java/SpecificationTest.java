
import com.mycompany.boundary.Specification;

import org.junit.jupiter.api.*;
import org.junit.jupiter.params.*;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class SpecificationTest {

               
    @Test
    public void insideDisplayAreaTest(){
        
        
        
        //Testing HD
        
        Specification.setDefinition(0);
        
        
        
        assertAll("", 
                
         // Testing Starting Point of Display
        () ->assertTrue(Specification.insideDisplayArea(0, 0)),
        
        //Testing Edge Point of Disply
        
        ()->assertTrue(Specification.insideDisplayArea(1280, 720)),
        
        //Testing Pixels within the Range of Pixels
        
        () ->assertFalse(Specification.insideDisplayArea(1280, 300)),
        () ->assertFalse(Specification.insideDisplayArea(900, 720)),
        () ->assertTrue(Specification.insideDisplayArea(900, 300)),
        
        //Testing Negative Point Outside the Range of Pixels
        
        () ->assertFalse(Specification.insideDisplayArea(1280, 720)),
        () ->assertFalse(Specification.insideDisplayArea(-1280, 720)),
        () ->assertFalse(Specification.insideDisplayArea(-1280, -720))
        
        );
        
        //Testing FHD
        
        Specification.setDefinition(1);
        
        
        assertAll("", 
        
        ()->assertTrue(Specification.insideDisplayArea(0, 0)),
        
        //Testing Edge Point of Disply
        
        ()->assertFalse(Specification.insideDisplayArea(1920, 1080)),
        
        //Testing Pixels within the Range of Pixels
        
        ()->assertFalse(Specification.insideDisplayArea(1920, 720)),
        ()->assertFalse(Specification.insideDisplayArea(1280, 1080)),
        ()->assertTrue(Specification.insideDisplayArea(1280, 720)),
        
        //Testing Negative Point Outside the Range of Pixels
        
        ()->assertFalse(Specification.insideDisplayArea(1920, -1080)),
        ()->assertFalse(Specification.insideDisplayArea(-1920, 1080)),
        ()->assertFalse(Specification.insideDisplayArea(-1920, -1080))
        
        );
    }
    
    @Test
    public void messageIsValidTest(){
        
        
        assertAll("",
                
                
        //Testing combinations of chars and numbers within and outside range
                
        ()->assertTrue(Specification.messageIsValid("abcdef", true)),
        
        ()->assertTrue(Specification.messageIsValid("ab", true)),
        
        ()->assertTrue(Specification.messageIsValid("ab5def", true)),
        
        ()->assertFalse(Specification.messageIsValid("a", true)),
        
        ()->assertTrue(Specification.messageIsValid("abcdef", false)),
        
        ()->assertTrue(Specification.messageIsValid("ab", false)),
        
        ()->assertTrue(Specification.messageIsValid("ab5def", false)),
        
        ()->assertFalse(Specification.messageIsValid("a", false)),
        
        
        //Testing combinations of numbers within and outside range
        
        ()->assertFalse(Specification.messageIsValid("555555", true)),
        
        ()->assertFalse(Specification.messageIsValid("55", true)),
        
        ()->assertFalse(Specification.messageIsValid("5", true)),
        
        ()->assertFalse(Specification.messageIsValid("5", true)),
        
        ()->assertFalse(Specification.messageIsValid("", true)),
        
        //Testing more combinations of chars and numbers within and outside range
        
        ()->assertTrue(Specification.messageIsValid("555abc", true)),
        
        ()->assertTrue(Specification.messageIsValid("5a", true)),
        
        ()->assertFalse(Specification.messageIsValid("", true)),
        
        
        ()->assertTrue(Specification.messageIsValid("555abc", false)),
        
        ()->assertTrue(Specification.messageIsValid("5a", false)),
        
        ()->assertFalse(Specification.messageIsValid("", false)),
        
        //Testing with hyphen with combinations of numbers and chrs
        
        ()->assertTrue(Specification.messageIsValid("abcde-f", false)),
        
        ()->assertFalse(Specification.messageIsValid("abcde-f", true)),
        
        ()->assertFalse(Specification.messageIsValid("abcde-fg", true)),
        
        ()->assertTrue(Specification.messageIsValid("a33de-f", false)),
        
        ()->assertFalse(Specification.messageIsValid("a33de-f", true)),
        
        ()->assertFalse(Specification.messageIsValid("a33de-fg", true)),
        
        //Testing above range of chars or number only
        
        ()->assertFalse(Specification.messageIsValid("abcdefg", false)),
        
        ()->assertFalse(Specification.messageIsValid("abcdefg", true)),
        
        ()->assertFalse(Specification.messageIsValid("5555555", false)),
        
        ()->assertFalse(Specification.messageIsValid("5555555", true))
        
        );
    }


    
   
}