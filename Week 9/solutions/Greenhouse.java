import java.util.*;

public class Greenhouse {

    public static void main(String args[]) {
        Collection<Plant> vegetables = new LinkedList<Plant>();

        Plant p1 = new Plant("Large Tomato");
        Plant p2 = new Plant("Small Tomato");
        Plant p3 = new Plant("Potato");
        Plant p4 = new Plant("Small Tomato");
        Plant p5 = new Plant("Small Potato");
        Plant p6 = new Plant("Small Potato");

        vegetables.add(p1);
        vegetables.add(p2);
        vegetables.add(p3);
        vegetables.add(p4);
        vegetables.add(p5);
        vegetables.add(p6);

        if (vegetables.isEmpty())
            System.out.println("Empty");
        else
            for (Plant p : vegetables)
                System.out.println(p);

        if (vegetables.contains(p1))
            System.out.println("p1 was found");
        else
            System.out.println("p1 was NOT found");

        if (vegetables.contains(p4))
            System.out.println("p4 was found");
        else
            System.out.println("p4 was NOT found");

        if (vegetables.contains("Large Tomato Plant"))
            System.out.println("Large Tomato Plant was found");
        else
            System.out.println("Large Tomato Plant was NOT found");

        if (vegetables.contains(p6))
            System.out.println("p6 was found");
        else
            System.out.println("p6 was NOT found");

        LinkedList<Plant> vegetablesLL = (LinkedList<Plant>) vegetables;

        System.out.println("\n4th element: " + vegetablesLL.get(3).toString());

        Plant p7 = new Plant("Lettuce");
        vegetablesLL.addLast(vegetablesLL.get(2));
        vegetablesLL.set(2, p7);

        vegetablesLL.add(new Plant("Basil"));
        vegetablesLL.add(new Plant("Rosemary"));
        vegetablesLL.add(new Plant("Chive"));

        vegetablesLL.add(vegetablesLL.size() / 2, vegetablesLL.removeFirst());

        System.out.println("\nAfter changes:");
        for (Plant p : vegetables)
            System.out.println(p);

        ArrayList<Plant> plants = new ArrayList<>();
        int count = 0;
        for (Plant p : vegetables) {
            plants.add(p);
            count++;
            if (count >= vegetables.size() / 2)
                break;
        }

        System.out.println("\nHalf list:");
        for (Plant p : plants)
            System.out.println(p);
    }

}