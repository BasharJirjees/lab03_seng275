/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
import com.mycompany.boundary.GameBoard;

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
public class GameBoardTest {

    static private GameBoard gmb;

    @BeforeAll
    public static void init() {
        gmb = new GameBoard(6, 6);

    }

    @Test
    public void make_moveTest() {

        //5 Good Weather Tests
        assertTrue(gmb.make_move(1, 3));
        assertTrue(gmb.make_move(0, 5));
        assertTrue(gmb.make_move(2, 4));
        assertTrue(gmb.make_move(3, 3));
        assertTrue(gmb.make_move(4, 5));
        
        
        //4 Bad Weather Tests
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(1, 6));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(6, 1));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(7, 0));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(-2, -1));
        
        
        //Testing Further Outside-range and Within-range Cases
        //To Make Sure the User is Never Allowed to Make a Move Above or Below
        //Board Range of Positions.

        assertTrue(gmb.make_move(5,5));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(6, 5));
        
        assertTrue(gmb.make_move(5,0));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(5, -5)); 
        
        assertTrue(gmb.make_move(1,1));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(1, 9)); 
        
        assertTrue(gmb.make_move(0,5));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(0, 6)); 
        
        assertTrue(gmb.make_move(5,1));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(5, 7)); 

        assertTrue(gmb.make_move(0,3));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(6, 3));  
        
        assertTrue(gmb.make_move(3,1));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(-3, 1)); 
        
        assertTrue(gmb.make_move(4,1));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(4, -1)); 

        assertTrue(gmb.make_move(2,2));
        assertThrows(IllegalArgumentException.class, ()->gmb.make_move(-1, 2)); 
    }
}
