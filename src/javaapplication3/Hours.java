/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author Estudiante
 */
public class Hours {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
            throws FileNotFoundException {
            Scanner input = new Scanner(System.in);
            File b = new File("Horas.txt");
            PrintStream output = new PrintStream(b);
            for(int i=0;i<10;i++){
            int a = input.nextInt();
            output.print(a+"\n");
            }
            Scanner out = new Scanner(b);
            int x=0;
            for(int i=0;i<10;i++){
                x+=out.nextInt();
            }
            System.out.println(x);
            
    }
    
}
