/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figurasgeometricas;

/**
 *
 * @author 66047656
 */
public class Rectangulo extends Figura{
    
    private double ancho = 0;
    private double largo = 0;
    private double lado1 = 0;
    private double lado2 = 0;
    private double lado3 = 0;
    private double lado4 = 0;
    
    
    
    
    public Rectangulo (double ancho, double largo, double lado1, double lado2, double lado3){
        this.ancho=ancho;
        this.largo=largo;
        this.lado1=lado1;
        this.lado2=lado2;
        this.lado3=lado3;
        this.lado4=lado4;
        
    }

    
    Rectangulo(double aux1, double aux2, double lado1, double lado2, double lado3, double lado4) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
    @Override
    public double calcularArea(){
        double area = ancho*largo;
        return area;
    }
    @Override
    public double calcularPerimetro(){
        double perimetro= lado1+lado2+lado3+lado4;
        return perimetro;
    }
}
