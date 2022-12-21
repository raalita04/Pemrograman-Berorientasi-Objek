import java.util.ArrayDeque;

public class ArrayDeq {
    public static void main(String[] args) {
         ArrayDeque<String> deque = new ArrayDeque<>();
         deque.add("Lelita");
         deque.addFirst("Tiara");
         deque.addLast ("momotaro");
         for (String i:deque){
             System.out.println(i);
         }
        
    }
    
}
