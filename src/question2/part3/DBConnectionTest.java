/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question2.part3;

/**
 *
 * @author cst140043
 */
public class DBConnectionTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection s1 = DBConnection.getInstance();
                System.out.println(s1.getClass() + " s1 " + s1.hashCode());
            }
        });
        
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                DBConnection s2 = DBConnection.getInstance();
                System.out.println(s2.getClass() + " s2 " + s2.hashCode());
            }
        });
        
        t1.start();
        t2.start();
        
    }
}
