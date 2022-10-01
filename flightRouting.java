package ICP_Project1;

import java.io.FileNotFoundException;
import java.util.*;

import static ICP_Project1.FileReader.*;
public class flightRouting {
    public static ArrayList<String> breadthFirstSearch(String startState, String goalState) throws FileNotFoundException {
        System.out.println("Performing a Breadth First Search");

        Queue<Node> frontier = new LinkedList<>();
        Set<String> exploredSet = new HashSet<String>();
        HashMap<String,String> airportMap = readAirportFile1();
        HashMap<String,ArrayList<String>> newAirportMap = readAirportFile();
//        HashMap<String,List<String>> routes = readRouteFile();

        HashMap<String, ArrayList<String>> flightMap = readAirportFile();
        ArrayList<String> airportCodesList = newAirportMap.get(startState);



        for (String airportCodes : airportCodesList) {
            frontier.add(new Node(airportCodes, null, null, 0));


            while (frontier.size() > 0) {
                Node stateNode = frontier.remove();
                exploredSet.add(stateNode.getAirportCode());


                ArrayList<Route> actions = routes.get(stateNode.getAirportCode());
                System.out.println(actions);


                if (actions!= null){
                    for (Route action : actions) {
                        Node childNode = new Node(stateNode, action.getDestinationAirportCode(),
                                action.getAirline_code(), action.getStops());
                        String returnedCity = airportMap.get(childNode.getAirportCode());
                        if (! frontier.contains(childNode)&& !exploredSet.contains(childNode.getAirportCode())){
                            if(returnedCity!= null){
                                if (returnedCity.equals(goalState))
                                    return childNode.solutionPath();
                                frontier.add(childNode);
                            }
                        }


                }


                }
            }
        }
        return null;

    }

    public static void main(String[] args) throws FileNotFoundException {
        ArrayList<String> flightPath = breadthFirstSearch("Accra, Ghana", "Wajir, soKenya");
        System.out.println(flightPath);

    }
}


