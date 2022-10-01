package ICP_Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    /**
     * readAirportFile method reads the  airports datafile a hashmap with
     * containing the city, country and an arraylist of IATA code airports
     *
     * @return newAirportMap
     * @throws FileNotFoundException
     */
    static String[] airportArray = new String[14];
    static HashMap<String, String> airportMap = new HashMap<>();
    static HashMap<String,ArrayList<String>> newAirportMap = new HashMap<>();

    public static HashMap<String, ArrayList<String>> readAirportFile() throws FileNotFoundException {

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));


        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");
            ArrayList<String> airportsList = new ArrayList<>();

            // creating a hashmap with the city and country of an airport  as the key and an arraylist of IATA code as the value.
            String location = airportArray[2] + ", " + airportArray[3];
            if (newAirportMap.containsKey(location)) {
                airportsList.add(airportArray[4]);
                newAirportMap.put(location, airportsList);

            } else {
                airportsList = new ArrayList<String>();
                airportsList.add(airportArray[4]);
                newAirportMap.put(location, airportsList);
            }

        }

        airportData.close();
        return newAirportMap;
    }

    /**
     * readAirportFile1 method reads the  airports datafile a hashmap with
     * containing the IATA code of an airport and the city, country the airport
     * is located in
     *
     * @return airportMap
     * @throws FileNotFoundException
     */
    public static HashMap<String, String> readAirportFile1() throws FileNotFoundException {

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));

        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");

            // creating a hashmap with the city and country of an airport  as the key and the IATA code as the value
            if (airportArray.length == 14) {

                String location = airportArray[2] + "," + airportArray[3];
                airportMap.put( airportArray[4], location);
            } else {

                // creating a hashmap with the city and country of an airport  as the key and the IATA code as the value
                String adj_location = airportArray[2] + "," + airportArray[3] + "," + airportArray[4];
                airportMap.put(airportArray[5],adj_location);
            }


        }

        airportData.close();

        return airportMap;
    }

    /**
     * readAirlineFile method reads the  airlines datafile  and creates a hashmap of airline objects and
     * a hashmap with containing airline details.
     *
     * @return airlineMap
     * @throws FileNotFoundException
     */
    public static HashMap<String, ArrayList<String>> readAirlineFile() throws FileNotFoundException {

        Scanner airlineData;
        airlineData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airlines.csv"));

        HashMap<String, ArrayList<String>> airlineMap = new HashMap<>();
        HashMap<String, Airline> airlines = new HashMap<>();


        while (airlineData.hasNext()) {
            String[] airlineArray = airlineData.nextLine().split(",");

            // creating a collection of Airline objects
            Airline airlineObj = new Airline(Integer.parseInt(airlineArray[0]), airlineArray[1],
                    airlineArray[2], airlineArray[3], airlineArray[4],
                    airlineArray[5], airlineArray[6], airlineArray[7]);
            airlines.put(airlineArray[0], airlineObj);

            // creating a collection of Airport objects
            String ID = airlineArray[0];
            ArrayList<String> airlineDetails = new ArrayList<String>();
            airlineDetails.add(airlineArray[1]);
            airlineDetails.add(airlineArray[2]);
            airlineDetails.add(airlineArray[3]);
            airlineDetails.add(airlineArray[4]);
            airlineDetails.add(airlineArray[5]);
            airlineDetails.add(airlineArray[6]);
            airlineDetails.add(airlineArray[7]);

            airlineMap.put(ID, airlineDetails);


        }
        airlineData.close();

        return airlineMap;

    }

    /**
     * readRouteFile method reads the routes datafile and  creates a hash map
     * of source airport IDs and destination airport IDs
     *
     * @return routeMap
     * @throws FileNotFoundException
     */
     static HashMap<String, ArrayList<Route>> routes = new HashMap<>();

    public static HashMap<String, List<String>> readRouteFile() throws FileNotFoundException {
        Scanner routeData;
        routeData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\routes.csv"));

        HashMap<String, List<String>> routeMap = new HashMap<>();
        ArrayList<Route> routeList;
        ArrayList<String> destList = new ArrayList<String>();

        while (routeData.hasNext()) {
            String[] routeArray = routeData.nextLine().split(",");

            Route routeObj = new Route(routeArray[0], routeArray[1], routeArray[4], Integer.parseInt(routeArray[7]));

            //checking if the key is already in the hashmap
            routeList = routes.get(routeArray);
            if (routeList == null) {
                ArrayList<Route> pathList = new ArrayList<>();
                pathList.add(routeObj);
                routes.put(routeArray[2], pathList);
            } else {
                routeList.add(routeObj);
                routes.put(routeArray[2], routeList); // the key for this hashMap is the source airport code
            }

            // putting source and destination  airport IDs into the map
                routeMap.put(airportArray[0], destList);
            if (routeMap.containsKey(routeArray[3])) {
                routeMap.get(routeArray[3]).add(routeArray[5]);
            } else {
                destList.add(routeArray[5]);
                routeMap.put(routeArray[3], destList);

            }

        }
        routeData.close();

        return routeMap;
    }


    public static void main(String[] args) throws FileNotFoundException {
//        readAirportFile();
        readAirportFile1();
    }
}












