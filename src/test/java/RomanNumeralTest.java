/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.mycompany.boundary.RomanNumeral;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author basha
 */
public class RomanNumeralTest {
    
 @Test
 public void convertTest(){
     
     assertAll("", 
             
             () -> assertEquals(45, RomanNumeral.convert("XXXXV")),
             () -> assertEquals(45, RomanNumeral.convert("VL")), // Fails Before Updating Code
             
             () -> assertEquals(10, RomanNumeral.convert("X")),
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("x")), // Fails Before Updating Code       
             
             () -> assertEquals(20, RomanNumeral.convert("XX")),
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("XX ")), // Fails Before Updating Code
             
             () -> assertEquals(40, RomanNumeral.convert("VVVVVVVV")),
             () -> assertEquals(40, RomanNumeral.convert("XL")), // Fails Before Updating Code
             
             
             () -> assertEquals(30, RomanNumeral.convert("XVVVV")),
             () -> assertEquals(30, RomanNumeral.convert("XXL")), // Fails Before Updating Code
             
             
             () -> assertEquals(5, RomanNumeral.convert("V")),
             () -> assertEquals(5, RomanNumeral.convert("VX")), // Fails Before Updating Code
                     
             () -> assertEquals(8, RomanNumeral.convert("VIII")),
             () -> assertEquals(8, RomanNumeral.convert("IIX")), // Fails Before Updating Code

             
             () -> assertEquals(1, RomanNumeral.convert("I")),
             () -> assertEquals(1, RomanNumeral.convert("IIIIV")), // Fails Before Updating Code
             
             () -> assertEquals(55, RomanNumeral.convert("LV")),
             () -> assertEquals(55, RomanNumeral.convert("VXL")), // Fails Before Updating Code
             
             
             () -> assertEquals(12, RomanNumeral.convert("XII")),
             () -> assertEquals(12, RomanNumeral.convert("IIIIIIIIXX")), // Fails Before Updating Code
                
             
             () -> assertEquals(2, RomanNumeral.convert("II")),
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("I I")), // Fails Before Updating Code
            
             () -> assertEquals(42, RomanNumeral.convert("XXXXII")),
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("aXXXXII")) // Fails Before Updating Code
                     
          
             );
     
 }
}
