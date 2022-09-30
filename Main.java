package ICP_Project1;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * @author Beverlyn Ewuradwoa Amanfu
 */


public class Main {

    public static void breadthFirstSearch() {
        Node node1 = new Node(AirportCode);
        Queue<Node> frontier = new LinkedList<Node>();
        HashSet <String> explored = new HashSet<String>();

        while (frontier.size()> 0){
            node1 = frontier.remove();
            explored.add(node1.getAirportCode());
            System.out.println("Removed from"+ node1.getAirportCode());


        }





        }
    }
