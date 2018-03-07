/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author cst140043
 */
public class Test {
    public static void main(String[] args) throws IOException {
        TextFile t = TextFile.getInstance("F:\\db");
        System.out.println("instance hash " + t.hashCode());
        //t.setUser(new Student());
        t.setUser(new Teacher());
        try {
            t.readFile();
        } catch (InsufficientPermissionException ex) {
            System.out.println(ex.getMessage());
        }
        TextFile t2 = TextFile.getInstance("F:\\db");
        System.out.println("instance2 hash " + t2.hashCode());
        t2.setUser(new Student());
        try {
            t2.writeFile("\nnew content");
        } catch (InsufficientPermissionException ex) {
            System.out.println(ex.getMessage());
        }
        
    }
}
