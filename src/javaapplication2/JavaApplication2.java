/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication2;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/**
 *
 * @author Personal
 */
public class JavaApplication2 {
    
    public static void main(String[] args) throws IOException {
        int a,b;
        
        InputStreamReader inputstream=new InputStreamReader(System.in);
        
        BufferedReader br=new BufferedReader(inputstream);
        
        System.out.print("Enter a value");
        a=Integer.parseInt(br.readLine());
        System.out.print("Enter b value");
        b=Integer.parseInt(br.readLine());
        
        int c=a*b;
        
        System.out.print("The output is" +c);
    }
    
    
            
}

