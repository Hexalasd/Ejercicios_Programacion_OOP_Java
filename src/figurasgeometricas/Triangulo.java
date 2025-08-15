/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author 66047656
 */

public class Triangulo extends Figura{
    private double base = 0;
    private double altura = 0;
    private double lado1 = 0;
    private double lado2 = 0;
    private double lado3 = 0;
    
    
    public Triangulo(double base, double altura, double lado1, double lado2, double lado3){
        this.altura =altura;
        this.base= base;
        this.lado1= lado1;
        this.lado2= lado2;
        this.lado3= lado3;
        
          
    }
    
    @Override
    public double calcularArea(){
        double area = base+altura/2;
        return area;
        
    }
    @Override
    public double calcularPerimetro(){
        double perimetro = lado1+lado2+lado3;
        return perimetro;
    }
    
}
