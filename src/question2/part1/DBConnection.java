/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2.part1;

/**
 *
 * @author cst140043
 */
public class DBConnection {
    private static DBConnection instance = null;

    private DBConnection() {
        
    }
    
    public static DBConnection getInstance(){
        if(instance == null) {
            instance = new DBConnection();
            System.out.println("Create object first time");
        }
        return instance;
    }
    
    
}
