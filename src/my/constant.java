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
public class constant implements Function{

    double c;
    @Override
    public double evaluate(double x) {
        return this.c;
    }

    @Override
    public Function deriv() {
        return new constant(0);
        
    }
    
    public constant(double c){
        this.c = c;
    }
    public String toString(){
        return "" + c;
    }
    
}
