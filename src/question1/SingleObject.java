/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question1;

/**
 *
 * @author cst140043
 */
public class SingleObject {
    private static SingleObject instance = null;

    private SingleObject() {
        
    }
    
    public static SingleObject getInstance(){
        if(instance == null) {
            instance = new SingleObject();
            System.out.println("Create object first time");
        }
        return instance;
    }
    
    
}
