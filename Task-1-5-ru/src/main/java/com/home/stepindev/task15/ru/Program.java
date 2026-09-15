/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.home.stepindev.task15.ru;
import java.io.*;
/**
 *
 * @author PC
 */
public class Program 
{

    public static void main(String[] args) throws Exception
    {
        /*Настройка ввоода данных для считывания строк*/
        var stdin = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Сколько страниц будете читать в день? ");
        /*Преобразование введённой строки в положительное число*/
        var k = Integer.parseInt(stdin.readLine());
        System.out.print("Сколько страниц осталось прочитать? ");
        /*Преобразование введённой строки в положительное число*/
        var n = Integer.parseInt(stdin.readLine());
        var d = (n + k - 1) / k;  // Количество дней, на которое хватит книги
        // Вывод на экран
        System.out.printf("Этой книги вам хватит ещё на %d дня(ей).\r\n",d);
    }
}
