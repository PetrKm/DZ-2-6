import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> attractionQueue = generateClients();

        while (true) {
            Person p = attractionQueue.poll();
            if (p == null) break;                           // Проверка на наличие следующего элемента в очереди
            if (p.ticketsAmount == 0) continue;             // Есть ли ещё билеты у посетителя
                p.ticketsAmount--;
                System.out.println("Прокатился на аттракционе " + p);
                attractionQueue.offer(p);                   // Добавление в очередь, если остались билеты
            }
        }

    public static LinkedList<Person> generateClients() {

        LinkedList<Person> attrQueue = new LinkedList<>();

        attrQueue.offer(new Person("Stive", "Smith", 4));
        attrQueue.offer(new Person("Toto", "Tilt", 3));
        attrQueue.offer(new Person("Omar", "Ruby", 6));
        attrQueue.offer(new Person("Ingrid", "Smidt", 7));
        attrQueue.offer(new Person("Ivan", "Kalita", 9));

        return attrQueue;
    }
}