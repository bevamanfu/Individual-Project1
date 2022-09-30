package ICP_Project1;


/**
 * A class to represent an Airport Object.
 */
public class Airport {
    private int AirportID;
    private String Name;
    private String City;
    private String Country;
    private String IATA_code; // International Air Transport Association (IATA)
    private String ICAO_code; // Internation Civil Aviation Organization (ICAO)
    private double Latitude;
    private double Longitude;
    private double Altitude;
    private double Timezone;
    private String  DST ; //  Daylight Savings Time(DST)
    private String database_time_zone;
    private String Type;
    private String Source_of_data;


    /**
     *Constructor for the Airport class
     * @param airportID
     * @param name
     * @param city
     * @param country
     * @param iata_code
     * @param icao_code
     * @param latitude
     * @param longitude
     * @param altitude
     * @param timezone
     * @param dst
     * @param database_time_zone
     * @param type
     * @param source_of_data
     */

    public Airport(int airportID  , String name, String city, String country,
                   String iata_code, String icao_code, double latitude, double longitude,
                   double altitude, double timezone, String dst, String database_time_zone,
                   String type, String source_of_data) {
        this.AirportID = airportID;
        this.Name = name;
        this.City = city;
        this.Country = country;
        this.IATA_code = iata_code;
        this.ICAO_code = icao_code;
        this.Latitude = latitude;
        this.Longitude = longitude;
        this.Altitude = altitude;
        this.Timezone = timezone;
        this.DST = dst;
        this.database_time_zone = database_time_zone;
        this.Type = type;
        this.Source_of_data = source_of_data;
    }

    /**
     * accessor method for Airport ID
     * @return AirportID
     */

    public int getAirportID() {
        return AirportID;
    }

    /**
     * accessor method for Airport name
     * @return Name
     */

    public String getName() {
        return Name;
    }

    /**
     * accessor method for the city an airport is located in
     * @return City
     */

    public String getCity() {
        return City;
    }
    /**
     * accessor method for the country the airport is located
     * @return Country
     */

    public String getCountry() {
        return Country;
    }

    /**
     * accessor method for IATA code of the airport
     * @return IATA_code
     */

    public String getIATA_code() {
        return IATA_code;
    }

    /**
     * accessor method for ICAO code of the airport
     * @return ICAO_code
     */

    public String getICAO_code() {
        return ICAO_code;
    }

    /**
     * accessor method for Latitude of the airport
     * @return Latitude
     */

    public double getLatitude() {
        return Latitude;
    }

    /**
     * accessor method for longitude of the airport
     * @return Longitude
     */
    public double getLongitude() {
        return Longitude;
    }

    /**
     * accessor method for altitude of the airport
     * @return Altitude
     */

    public double getAltitude() {
        return Altitude;
    }

    /**
     * accessor method for timezone the airport is located in
     * @return Timezone
     */

    public double getTimezone() {
        return Timezone;
    }

    /**
     * accessor method for DST
     * @return DST
     */

    public String getDST() {
        return DST;
    }

    /**
     * accessor method for database time zone
     * @return database_time_zone
     */

    public String getDatabase_time_zone() {
        return database_time_zone;
    }

    /**
     * accessor method for the airport type
     * @return Type
     */


    public String getType() {
        return Type;
    }

    /**
     * accessor method for source of data
     * @return Source_of_data
     */


    public String getSource_of_data() {
        return Source_of_data;
    }


// This method provides a string representation of the Airport object.
    @Override
    public String toString() {
        return "Airport{" +
                "AirportID=" + AirportID +
                ", Name='" + Name + '\'' +
                ", City='" + City + '\'' +
                ", Country='" + Country + '\'' +
                ", IATA_code=" + IATA_code +
                ", ICAO_code=" + ICAO_code +
                ", Latitude=" + Latitude +
                ", Longitude=" + Longitude +
                ", Altitude=" + Altitude +
                ", Timezone=" + Timezone +
                ", DST=" + DST +
                ", database_time_zone=" + database_time_zone +
                ", Type='" + Type + '\'' +
                ", Source_of_data='" + Source_of_data + '\'' +
                '}';
    }

}

