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
public class SingleObjectTest {
    public static void main(String[] args) {
        SingleObject s1 = SingleObject.getInstance();
        SingleObject s2 = SingleObject.getInstance();
        System.out.println(s1.getClass() + "s1 " + s1.hashCode());
        System.out.println(s2.getClass() + "s2 " + s2.hashCode());
    }
}
