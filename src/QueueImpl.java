
public class QueueImpl<E> implements Queue<E> {

    E[] queue; // Definimos el nombre de la cola
    int i; // Indice que recorrerá la cola

    /**
     * Definimos un constructor para inicializar los valores previos
     */

    public Queue(int length){
        this.queue = new E[length];
        this.i = 0;

    }

    /**
     * Push:
     * @param e l'element a "encuar"
     * @throws FullQueueException (envia una excepció quan el vector estigui ple (ya no caben más elementos)
     */

    public void push(E e) throws FullQueueException{
        if ( this.queue.size() ==  )
            throw new FullQueueException ("La cola está llena");

        queue[i] = e;
        i++;

    }

    /**
     * Pop:
     * @return devuelve la cola modificada (con el elemento eliminado y los otros desplazados)
     * @throws EmptyQueueException (envia una excepció quan no hi ha més elements per treure, cua buida)
     */
    public E pop() throws EmptyQueueException{

    }


    public int size(){

    }


}
