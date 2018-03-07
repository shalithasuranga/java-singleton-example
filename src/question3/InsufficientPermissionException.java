/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package question3;

/**
 *
 * @author cst140043
 */
public class InsufficientPermissionException extends Exception {

    @Override
    public String getMessage() {
        return "No Permission!";
    }
    
}
