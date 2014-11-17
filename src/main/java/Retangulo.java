/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Thiago
 */
public class Retangulo implements FiguraComLados {
    
    double ladoMaior, ladoMenor;
    
    public Retangulo(double ladoMaior, double ladoMenor){
        this.ladoMaior = ladoMaior;
        this.ladoMenor = ladoMenor;
    }

    @Override
    public double getLadoMenor() {
        return ladoMenor;
    }

    @Override
    public double getLadoMaior() {
        return ladoMaior;
    }

    @Override
    public String getNome() {
        return this.getClass().getSimpleName() + " [" + ladoMaior + " x " + ladoMenor + "]";
    }

    @Override
    public double getPerimetro() {
        return 2 * ladoMaior + 2 * ladoMenor;
    }

    @Override
    public double getArea() {
        return ladoMaior * ladoMenor;
    }
    


    
}
