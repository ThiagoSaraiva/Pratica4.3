/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
public class TrianguloEquilatero implements FiguraComLados{
    
    double lado;
    
    public TrianguloEquilatero(double lado){
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
        return this.getClass().getSimpleName() + " [" + lado + " x " + lado + " x " + lado + "]";
    }

    @Override
    public double getPerimetro() {
        return 3 * lado;
    }

    @Override
    public double getArea() {
        return (lado * lado * 1.732) / 4;
    }
    
}
