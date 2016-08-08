/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

/**
 *
 * @author gal
 */
public class monomial implements Function{
    public double degree;
    
    @Override
    public double evaluate(double x) {
        return Math.pow(x, this.degree);
    }

    @Override
    public Function deriv() {
        return new product(new constant(degree), new monomial(degree - 1));
    }
    
    public monomial(double degree){
        this.degree = degree;
    }
    public String toString(){
        return "x^" + degree;
    }
    
}
