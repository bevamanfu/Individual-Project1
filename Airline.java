package ICP_Project1;

/**
 * A class to represent an Airline object.
 */

public class Airline {
    private int AirlineID;
    private String Airline_name;
    private String Alias;
    private String IATA_code;
    private String ICAO_code;
    private String Call_sign;
    private String Country;
    private String Active;

    /**
     * Constructors for the Airline class
     * @param airlineID
     * @param airline_name
     * @param alias
     * @param iata_code
     * @param icao_code
     * @param call_sign
     * @param country
     * @param active
     */


    public Airline(int airlineID, String airline_name, String alias, String iata_code, String icao_code, String call_sign, String country, String active) {
        AirlineID = airlineID;
        Airline_name = airline_name;
        Alias = alias;
        IATA_code = iata_code;
        ICAO_code = icao_code;
        Call_sign = call_sign;
        Country = country;
        Active = active;
    }

    /**
     * accessor method for airline ID
     * @return AirlineID
     */

    public int getAirlineID() {
        return AirlineID;
    }

    /**
     *  accessor method for the airline name
     * @return Airline_name
     */

    public String getAirline_name() {
        return Airline_name;
    }

    /**
     * accessor method for the airline's alias
     * @return Alias
     */

    public String getAlias() {
        return Alias;
    }
    /**
     * accessor method for IATA code
     * @return IATA_code
     */

    public String getIATA_code() {
        return IATA_code;
    }

    /**
     * accessor method for ICAO code
     * @return ICAO_code
     */

    public String getICAO_code() {
        return ICAO_code;
    }

    /**
     * accessor method for call sign
     * @return Call_sign
     */

    public String getCall_sign() {
        return Call_sign;
    }

    /**
     * accessor to get the  country the airline is located in
     * @return Country
     */


    public String getCountry() {
        return Country;
    }

    /**
     * accessor to determine whether or not an airline is active.
     * @return Active
     */


    public String getActive() {
        return Active;
    }


    // This method generates a string representation of the Airline Class
    @Override
    public String toString() {
        return "Airline{" +
                "AirlineID=" + AirlineID +
                ", Airline_name='" + Airline_name + '\'' +
                ", Alias='" + Alias + '\'' +
                ", IATA_code=" + IATA_code +
                ", ICAO_code=" + ICAO_code +
                ", Call_sign='" + Call_sign + '\'' +
                ", Country='" + Country + '\'' +
                ", Active='" + Active + '\'' +
                '}';
    }
}