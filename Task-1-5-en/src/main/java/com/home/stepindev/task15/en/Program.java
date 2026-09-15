/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.stepindev.task15.en;
import java.io.*;

/**
 *
 * @author PC
 */
public class Program 
{

    public static void main(String[] args) throws Exception
    {
        /*Set input for reading strings*/
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("How many pages will you read per day? ");
        /*Convert string to an unsigned integer*/
        var k = Integer.parseUnsignedInt(stdin.readLine());
        System.out.print("How many pages remain to read? ");
        /*Convert string to an unsigned integer*/
        var n = Integer.parseUnsignedInt(stdin.readLine());    
        var d = (n + k - 1) / k;  // Number of days the book will last
        // Print to screen
        System.out.printf("This book will last you another %d days.\r\n",d);
    }
}
