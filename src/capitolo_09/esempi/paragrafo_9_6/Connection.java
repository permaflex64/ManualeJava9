package capitolo_09.esempi.paragrafo_9_6;
public class Connection {
    private boolean isOpen = false;
    public void open() {
        // . . . 
        isOpen = true;
        // . . . 
        assert isOpen;
    }
    public void close() throws ConnectionException {//ConnectionException dovrebbe esistere per far compilare questo file (guarda sotto)
        if (!isOpen) {
            throw new ConnectionException(
                "Impossibile chiudere connessioni non aperte!" );
        }
        // . . . 
        isOpen = false;
        // . . . 
        assert !isOpen;
    }
}

class ConnectionException extends RuntimeException {
    public ConnectionException(String msg){
        super(msg);
    }
}
