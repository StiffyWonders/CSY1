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
public class sum extends CompFuntion {

    public sum(Function left, Function right) {
        super(left, right);
    }

    @Override
    public double evaluate(double x) {
        return this.f.evaluate(x) + this.g.evaluate(x);
    }

    @Override
    public Function deriv() {
        return new sum(this.f.deriv(), this.g.deriv());
    }
        public String toString(){
        return this.f.toString() + "+" + this.g.toString();
    }

}
