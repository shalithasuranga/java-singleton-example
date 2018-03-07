/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2.part2;

/**
 *
 * @author cst140043
 */
public class DBConnection {
    private static DBConnection instance = new DBConnection();

    private DBConnection() {
        
    }
    
    public static DBConnection getInstance(){
        return instance;
    }
}
