package ICP_Project1;


import java.util.ArrayList;
import java.util.Collections;

/**
 * A class to create a Node object
 */
public class Node  {
    private String AirportCode;
    private Node Parent;
    private String AirlineCode;
    private int Stops;

    /**
     * Constructor for the Node class
     * @param airportCode
     * @param parent
     * @param airlineCode
     * @param stops
     */

    public Node(String airportCode, Node parent, String airlineCode, int stops) {
        this.AirportCode = airportCode;
        this.Parent = parent;
        this.AirlineCode = airlineCode;
        this.Stops = stops;
    }

    public Node(Node stateNode, String destinationAirportCode, String airline_code, int stops) {
    }

    /**
     * accesor method for airport code
     * The airport code represents the state of the node
     * @return AirportCode
     */

    public String getAirportCode() {
        return AirportCode;
    }

    /**
     * accesor method for parent
     * Parent represents the parent of the node
     * @return Parent
     */
    public Node getParent() {
        return Parent;
    }

    /**
     * accesor method for airline code
     * The airline code represents the actions of a node
     * @return AirlineCode
     */
    public String getAirlineCode() {
        return AirlineCode;
    }

    /**
     * accesor method for stops
     * Stops represents the path cost of the node
     * @return Stops
     */

    public int getStops() {
        return Stops;
    }

    /**
     * The solution path method keeps track of the airport code,
     * airline code and stops of each node so that the path from the start
     * to the destination can be shown when the goal is reached.
     *
     * @return flightList
     */
    public ArrayList<String> solutionPath(){

        // Initializing ArrayLists AirportCodeList,AirlineCodeList,flightList stops

        ArrayList<String> AirportCodeList= new ArrayList<String>();
        ArrayList<String> AirlineCodeList= new ArrayList<String>();
        ArrayList<String> flightList= new ArrayList<String>();
        ArrayList<Integer> StopsList= new ArrayList<Integer>();

        Node nextNode = this;


        while(nextNode != null){
            AirportCodeList.add(nextNode.getAirportCode());
            AirlineCodeList.add(nextNode.getAirlineCode());
            StopsList.add(nextNode.getStops());

            nextNode = nextNode.Parent;
        }

        Collections.reverse(AirportCodeList);
        Collections.reverse(AirlineCodeList);
        Collections.reverse(StopsList);


        // traversing through the AirlineCodeList and appending the solution sentence to the flightList
        for( int i= 0; i < AirlineCodeList.size();i++){
            String solutionSentence = i+1+ ","+ AirlineCodeList.get(i+1)+" from "+
                    AirportCodeList.get(i)+" to " + AirportCodeList.get(i +1)+ " " +StopsList+
                    "stops.";
            flightList.add(solutionSentence);

        }
        return flightList;
    }
    // This method generates a string presentation of the node class
    @Override
    public String toString() {
        return "Node{" +
                "AirportCode='" + AirportCode + '\'' +
                ", Parent=" + Parent +
                ", AirlineCode='" + AirlineCode + '\'' +
                ", Stops=" + Stops +
                '}';
    }
}


