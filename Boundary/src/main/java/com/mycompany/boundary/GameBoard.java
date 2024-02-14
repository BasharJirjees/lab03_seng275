/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.boundary;

/**
 *
 * @author basha
 */
public class GameBoard {

    private static int width;
    private static int height;

    public GameBoard(int w, int h) {

        width = w;
        height = h;

    }

    public static boolean make_move(int w, int h) {

        if ((w >= width || h >= height) || (w < 0 || h < 0)) {

            System.out.println("The move made is outside the board possible locations.");
            throw new IllegalArgumentException();

        } else {
            
            return true;
            
        }
    }
}
