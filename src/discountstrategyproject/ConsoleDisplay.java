/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package discountstrategyproject;

/**
 *
 * @author Sanuth
 */
public class ConsoleDisplay implements DisplayStrategy {

    @Override
    public void print(String receipt) {
        System.out.println(receipt);
    }
    
}
