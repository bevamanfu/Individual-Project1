package ICP_Project1;

import java.io.FileNotFoundException;
import java.util.*;

import static ICP_Project1.FileReader.*;
public class flightRouting {
    public static ArrayList<String> breadthFirstSearch(String startState, String goalState) throws FileNotFoundException {
        System.out.println("Performing a Breadth First Search");

        Queue<Node> frontier = new LinkedList<>();
        HashSet<String> exploredSet = new HashSet<String>();


        HashMap<String, ArrayList<String>> flightMap = readAirlineFile();
        ArrayList<String> airportCodesList = flightMap.get(startState);
        for (String airportCodes : airportCodesList) {
            frontier.add(new Node(airportCodes, null, null, 0));

            while (frontier.size() > 0) {
                Node stateNode = frontier.remove();
                exploredSet.add(stateNode.getAirportCode());
                System.out.println("Popped node" + stateNode);

                ArrayList<Route> actions = routes.get(stateNode.getAirportCode());

                for (Route action : actions) {
                    Node childNode = new Node(stateNode, action.getDestinationAirportCode(),
                            actions.getAirlineCode(), action.getStops());

                    String returnedCity = airportMap.get(childNode.getAirportCode());
                    if (returnedCity.equals(goalState))
                        return childNode.solutionPath();
                    frontier.add(childNode);
                }
            }
        }
        return null;

    }
}


