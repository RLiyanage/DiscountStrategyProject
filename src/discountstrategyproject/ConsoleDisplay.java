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
    public final void print(String receipt)throws IllegalArgumentException {
        if(receipt == null || receipt.isEmpty()){
            throw new IllegalArgumentException("Report can not be print without data.");
        }else{
            System.out.println(receipt);
        }
    }
    
}
