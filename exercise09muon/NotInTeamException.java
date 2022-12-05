/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercise09muon;

/**
 *
 * @author MUON
 */
public class NotInTeamException extends Exception {

    /**
     * Creates a new instance of <code>NotInTeamException</code> without detail
     * message.
     */
    public NotInTeamException() {
    }

    /**
     * Constructs an instance of <code>NotInTeamException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public NotInTeamException(String msg) {
        super(msg);
    }
}
