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
public interface Function {
    
    double evaluate(double x);
    
    Function deriv();
    @Override
    public String toString();
    
}
