public class FullQueueException extends Exception{
    private String mensajeE;
    public FullQueueException(){
        this.mensajeE="Error, la cola está llena";

    }
    public FullQueueException(String mensaje){
        this.mensajeE=mensaje;
    }
    public String getMessage(){
        return mensajeE;
    }
}
