import java.util.PriorityQueue;
import java.util.Queue;


/**
 * This program demonstrates a priority queue of to-do items. The
 * most important to-do items are removed first.
*/
public class PriorityQueueDemo
{
    public static void main(String[] args)
    {
        Queue<String> students = new PriorityQueue<>();
        students.add("Neel");
        students.add("Jonathan");
        students.add("Cam");
        students.add("Kaitlyn");
        students.add("Dylan");
        while (!students.isEmpty()){
            System.out.println(students.remove());
        }

        Queue<WorkOrder> toDo = new PriorityQueue<>();

        toDo.add(new WorkOrder(3, "Water Plants"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Conquer World"));
        toDo.add(new WorkOrder(9, "Play Videogames"));
        toDo.add(new WorkOrder(2, "Make Dinner"));
        toDo.add(new WorkOrder(1, "Study for the Ch. 15 Test"));

        System.out.println(toDo);
        while (!toDo.isEmpty()){
            System.out.println(toDo.remove());
        }

    }
}
