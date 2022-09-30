package ICP_Project1;


/**
 * A method to create a node
 */
public class Node  {
    private String AirportCode;
    private Node Parent;
    private String AirlineCode;
    private int Stops;

    public Node(String airportCode, Node parent, String airlineCode, int stops) {
        AirportCode = airportCode;
        Parent = parent;
        AirlineCode = airlineCode;
        Stops = stops;
    }

    public String getAirportCode() {
        return AirportCode;
    }

    public Node getParent() {
        return Parent;
    }

    public String getAirlineCode() {
        return AirlineCode;
    }

    public int getStops() {
        return Stops;
    }

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


