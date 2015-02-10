/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.ejb.Stateless;

/**
 *
 * @author Akila
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    @Override
    public String businessMethod() {
        return "Hello, world new 1";
    }

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    
}
