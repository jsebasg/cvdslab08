package edu.eci.cvds.sampleprj.dao;

public class PersistenceException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    public PersistenceException() {

    }
    public PersistenceException(String msg) {
        super(msg);
    }
    public PersistenceException(String msg, Exception e) {
        super(msg);
    }
}