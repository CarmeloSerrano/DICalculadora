/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.dicalculadora;

/**
 *
 * @author DAM2
 */
public class Modelo {

    double num;
    double resultado;
    
    private void suma() {
        
        resultado=resultado+num;
    }
    
    private void resta() {
        
        resultado=resultado-num;
    }
    
    private void multiplicación() {
        
        resultado=resultado*num;
    }
    
    private void división() {
        
        resultado=resultado/num;
    }
    
 
    public double calcula(char operador) {
       
        switch (operador) {
            
            case '+':
                suma();
                break;
             
            case '-':
                resta();
                break;
                  
            case '*':
                multiplicación();
                break;
                
            case '/':
                división();
                break;    
                
            default:
                resultado = num;
        }
        
        return resultado;
        
    }

    public double getNum() {
        return num;
    }

    public void setNum(double num) {
        this.num = num;
    }   
}
