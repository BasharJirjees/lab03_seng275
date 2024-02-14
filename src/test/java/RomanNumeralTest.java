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
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(45, RomanNumeral.convert("VL")), 
             
             () -> assertEquals(10, RomanNumeral.convert("X")),
             // Fails Before Updating Code of RomanNumeral.java   
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("x")),     
             
             () -> assertEquals(20, RomanNumeral.convert("XX")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("XX ")), 
             
             () -> assertEquals(40, RomanNumeral.convert("VVVVVVVV")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(40, RomanNumeral.convert("XL")),
             
             
             () -> assertEquals(30, RomanNumeral.convert("XVVVV")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(30, RomanNumeral.convert("XXL")), 
             
             
             () -> assertEquals(5, RomanNumeral.convert("V")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(5, RomanNumeral.convert("VX")), 
                     
             () -> assertEquals(8, RomanNumeral.convert("VIII")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(8, RomanNumeral.convert("IIX")), 

             
             () -> assertEquals(1, RomanNumeral.convert("I")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(1, RomanNumeral.convert("IIIIV")), 
             
             () -> assertEquals(55, RomanNumeral.convert("LV")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(55, RomanNumeral.convert("VXL")), 
             
             
             () -> assertEquals(12, RomanNumeral.convert("XII")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertEquals(12, RomanNumeral.convert("IIIIIIIIXX")), 
                
             
             () -> assertEquals(2, RomanNumeral.convert("II")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("I I")), 
            
             () -> assertEquals(42, RomanNumeral.convert("XXXXII")),
             // Fails Before Updating Code of RomanNumeral.java
             () -> assertThrows(IllegalArgumentException.class, ()-> RomanNumeral.convert("aXXXXII")) 
                     
          
             );
     
 }
}
