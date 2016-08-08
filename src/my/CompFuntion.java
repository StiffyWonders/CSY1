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
public abstract class CompFuntion implements Function{
    
    Function f;
    Function g;
    
    @Override
    public abstract double evaluate(double x);

    @Override
    public abstract Function deriv();
    
    public CompFuntion(Function left, Function right){
        this.f = left;
        this.g = right;
    }
    
    
    
}
