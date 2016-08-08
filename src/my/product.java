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
public class product extends CompFuntion{

    public product(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {  
        return this.f.evaluate(x) * this.g.evaluate(x);
    }

    @Override
    public Function deriv() {
        product left = new product(this.f.deriv() , this.g);
        product right = new product(this.f, this.g.deriv());
        return new sum(left, right);
        
    }
    
    public String toString(){
        return this.f.toString() + "*" + this.g.toString();
    }
    
}
