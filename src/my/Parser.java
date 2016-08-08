/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package my;

import static java.lang.System.console;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;

/**
 *
 * @author gal
 */
public class Parser {
    
    Queue<String> exp;
    
    public Parser(Queue exp){
        this.exp = exp;
    }
    
    public Function parse(){
        String  token = exp.poll();
        switch(token){
            case "+":
                return new sum(parse() , parse());
            case "*":
                return new product(parse(), parse());
            case "^":
                token = exp.poll();
                String token2 = exp.poll();
                return new monomial(Double.parseDouble(token));
            case "x":
                return new monomial(1);
            default:
                return new constant(Double.parseDouble(token));
                
        }
    }
}
