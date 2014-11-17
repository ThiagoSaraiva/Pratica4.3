/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
public class Quadrado implements FiguraComLados{
    
    double lado;
    
    public Quadrado(double lado){
        this.lado = lado;
    }

    @Override
    public double getLadoMenor() {
        return lado;
    }

    @Override
    public double getLadoMaior() {
        return lado;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName() + " [" + lado + " x " + lado + "]";
    }

    @Override
    public double getPerimetro() {
        return lado * 4;
    }

    @Override
    public double getArea() {
        return lado * lado;
    }
    
}
