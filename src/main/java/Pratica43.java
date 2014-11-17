/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
public class Pratica43 {
    
    public static void main(String[] args){
        
        Retangulo retangulo = new Retangulo(3, 2);
        Quadrado quadrado = new Quadrado(2);
        TrianguloEquilatero t = new TrianguloEquilatero(3);
        
        System.out.println(retangulo.getArea());
        System.out.println(retangulo.getPerimetro());
        System.out.println(quadrado.getArea());
        System.out.println(quadrado.getPerimetro());
        System.out.println(t.getArea());
        System.out.println(t.getPerimetro());
    }
}
