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
public class AlreadyCapturedException extends Exception {

    /**
     * Creates a new instance of <code>AlreadyCapturedException</code> without
     * detail message.
     */
    public AlreadyCapturedException() {
    }

    /**
     * Constructs an instance of <code>AlreadyCapturedException</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public AlreadyCapturedException(String msg) {
        super(msg);
    }
}
