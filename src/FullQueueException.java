public class FullQueueException extends Exception {
    private String mensajeE;

    public FullQueueException() {
        this.mensajeE = "Error, la cola está llena";

    }

    public String getMessage() {
        return mensajeE;
    }
}
