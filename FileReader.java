package ICP_Project1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileReader {
    /**
     * readAirportFile method reads the  airports datafile  and creates a hashmap of airport objects and
     * a hashmap with containing the city, country and IATA code of an airport
     *
     * @return airlineMap
     * @throws FileNotFoundException
     */
    static String[] airportArray = new String[14];
    static HashMap<String, String> airportMap = new HashMap<>();
    public static HashMap<String, String> readAirportFile() throws FileNotFoundException {

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));

        HashMap<String, String> airportMap = new HashMap<>();
         HashMap<String, Airport> airports = new HashMap<>();


        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");
            try {

                if (airportArray.length == 14) {
                    // creating a collection of Airport objects
                    Airport airportObj = new Airport((Integer.parseInt(airportArray[0])), airportArray[1], airportArray[2],
                            airportArray[3], airportArray[4], airportArray[5], Double.parseDouble(airportArray[6]),
                            Double.valueOf(airportArray[7]), Double.valueOf(airportArray[8]), Double.valueOf(airportArray[9]),
                            airportArray[10], airportArray[11], airportArray[12], airportArray[13]);
                    airports.put(airportArray[0], airportObj);

                    // creating a hashmap with the city and country of an airport  as the key and the IATA code as the value.
                    String location = airportArray[2] + "," + airportArray[3];
                    airportMap.put(location, airportArray[4]);
                } else {
                    // creating a collection of Airport objects
                    Airport airportObj = new Airport((Integer.parseInt(airportArray[0])), (airportArray[1] + airportArray[2]), airportArray[3],
                            airportArray[4], airportArray[5], airportArray[6], Double.parseDouble(airportArray[7]),
                            Double.valueOf(airportArray[8]), Double.valueOf(airportArray[9]), Double.valueOf(airportArray[10]),
                            airportArray[11], airportArray[12], airportArray[13], airportArray[14]);
                    airports.put(airportArray[2] + "," + airportArray[3], airportObj);

                    // creating a hashmap with the city and country of an airport  as the key and the IATA code as the value
                    String adj_location = airportArray[2] + "," + airportArray[3] + "," + airportArray[4];
                    airportMap.put(adj_location, airportArray[5]);
                }
            } catch (NumberFormatException ne) {
                System.out.println("Encountered Error:" + ne.getMessage());
            }

        }
        airportData.close();
        System.out.println(airportMap);
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
        System.out.println(airlineMap);

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
}












