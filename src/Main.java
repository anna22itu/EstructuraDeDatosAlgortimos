import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Queue<Integer> q = new QueueImpl<Integer>(5);
        try {

        q.push(1);
            System.out.println(q.size());
        q.push(2);
            System.out.println(q.size());
        q.push(3);
            System.out.println(q.size());
        q.push(4);
            System.out.println(q.size());
        q.push(5);
            System.out.println(q.size());
        q.pop();
            System.out.println(q.size());
        q.push(5);
            System.out.println(q.size());



        }
        catch (FullQueueException fullExp) {
            //
            System.out.println("EXCEPCIÓ!!");
            fullExp.printStackTrace();
        }
        catch (EmptyQueueException empty) {
            System.out.println("EXCEPCIÓ!!");
            empty.printStackTrace();
        }

    }
}
