/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import javax.ejb.Local;

/**
 *
 * @author Akila
 */
@Local
public interface NewSessionBeanLocal {

    String businessMethod();
    
}
