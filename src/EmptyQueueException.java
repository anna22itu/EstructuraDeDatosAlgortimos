public class EmptyQueueException extends Exception {
private String mensajeE;
public EmptyQueueException(){
    this.mensajeE="Error, la cola está vacía";

}
public EmptyQueueException(String mensaje){
    this.mensajeE=mensaje;
}
public String getMessage(){
    return mensajeE;
}
}

