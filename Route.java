package ICP_Project1;

public class Route {
    private String Airline_code;
    private int AirlineID;
    private String SourceAirportCode;
    private int SourceAirportID;
    private String DestinationAirportCode;
    private int DestinationAirportID;
    private String CodeShare;
    private int Stops;
    private String Equipment;

    /**
     * Constructors for the Route Class
     * @param airline_code
     * @param airlineID
     * @param sourceAirportCode
     * @param sourceAirportID
     * @param destinationAirportCode
     * @param destinationAirportID
     * @param codeShare
     * @param stops
     * @param equipment
     */


    public Route(String airline_code, int airlineID, String sourceAirportCode,
                 int sourceAirportID, String destinationAirportCode, int destinationAirportID,
                 String codeShare, int stops, String equipment) {
        Airline_code = airline_code;
        AirlineID = airlineID;
        SourceAirportCode = sourceAirportCode;
        SourceAirportID = sourceAirportID;
        DestinationAirportCode = destinationAirportCode;
        DestinationAirportID = destinationAirportID;
        CodeShare = codeShare;
        Stops = stops;
        Equipment = equipment;
    }

    /**
     * accessor method for airline code
     * @return Airline_code
     */

    public String getAirline_code() {
        return Airline_code;
    }
    /**
     * accessor method for airline ID
     * @return AirlineID
     */

    public int getAirlineID() {
        return AirlineID;
    }


    /**
     * accessor method for source airport code
     * @return SourceAirportCode
     */
    public String getSourceAirportCode() {
        return SourceAirportCode;
    }
    /**
     * accessor method for  Source Airport ID
     * @return SourceAirportID
     */

    public int getSourceAirportID() {
        return SourceAirportID;
    }

    /**
     * accessor method for destination airport code
     * @return DestinationAirportCode
     */

    public String getDestinationAirportCode() {
        return DestinationAirportCode;
    }
    /**
     * accessor method for  Destination Airport ID
     * @return DestinationAirportID
     */

    public int getDestinationAirportID() {
        return DestinationAirportID;
    }
    /**
     * accessor method for  code share
     * @return COdeShare
     */

    public String getCodeShare() {
        return CodeShare;
    }

    /**
     * accessor method for number of stops
     * @return Stops
     */

    public int getStops() {
        return Stops;
    }
    /**
     * accessor method for equipment
     * @return Equipment
     */

    public String getEquipment() {
        return Equipment;
    }

// This method provides a string representation of the Route class
    @Override
    public String toString() {
        return "Route{" +
                "Airline_code='" + Airline_code + '\'' +
                ", AirlineID=" + AirlineID +
                ", SourceAirportCode='" + SourceAirportCode + '\'' +
                ", SourceAirportID=" + SourceAirportID +
                ", DestinationAirportCode='" + DestinationAirportCode + '\'' +
                ", DestinationAirportID=" + DestinationAirportID +
                ", CodeShare='" + CodeShare + '\'' +
                ", Stops=" + Stops +
                ", Equipment='" + Equipment + '\'' +
                '}';
    }
}


