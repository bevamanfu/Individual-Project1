package ICP_Project1;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;



public class reader {
    /**
     * @return airportMap
     * @throws FileNotFoundException
     */

    static String[] airportArray = new String[14];

    public static HashMap<String, Airport> readAirportFile() throws FileNotFoundException {

        Scanner airportData;
        airportData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airports.csv"));

        HashMap<String, Airport> airportMap = new HashMap<>();
//        String[] airportValue = new String[4];


        while (airportData.hasNext()) {
            String[] airportArray = airportData.nextLine().split(",");

            try {
                if (airportArray.length == 14) {
                    Airport airportObj = new Airport((Integer.parseInt(airportArray[0])), airportArray[1], airportArray[2],
                            airportArray[3], airportArray[4], airportArray[5], Double.parseDouble(airportArray[6]),
                            Double.valueOf(airportArray[7]), Double.valueOf(airportArray[8]), Double.valueOf(airportArray[9]),
                            airportArray[10], airportArray[11], airportArray[12], airportArray[13]);

                    airportMap.put(airportArray[0], airportObj);
                } else {
                    Airport airportObj = new Airport((Integer.parseInt(airportArray[0])), (airportArray[1] + airportArray[2]), airportArray[3],
                            airportArray[4], airportArray[5], airportArray[6], Double.parseDouble(airportArray[7]),
                            Double.valueOf(airportArray[8]), Double.valueOf(airportArray[9]), Double.valueOf(airportArray[10]),
                            airportArray[11], airportArray[12], airportArray[13], airportArray[14]);

                    airportMap.put(airportArray[2]+","+airportArray[3], airportObj);

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
     * readAirlineFile method reads the routes datafile  and creates a hashmap of
     * @return airlineMap
     * @throws FileNotFoundException
     */
    public static HashMap<String, Airline> readAirlineFile() throws FileNotFoundException {

        Scanner airlineData;
        airlineData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\airlines.csv"));

        HashMap<String, Airline> airlineMap = new HashMap<>();


        while (airlineData.hasNext()) {
            String[] airlineArray = airlineData.nextLine().split(",");
            Airline airlineObj = new Airline(Integer.parseInt(airlineArray[0]), airlineArray[1],
                    airlineArray[2], airlineArray[3], airlineArray[4],
                    airlineArray[5], airlineArray[6], airlineArray[7]);
            airlineMap.put(airlineArray[0], airlineObj);


        }
        airlineData.close();
        System.out.println(airlineMap);

        return airlineMap;

    }

    /**
     *  readRouteFile method reads the routes datafile and  creates a hash map
     *  of source airport IDs and destination airport IDs
     * @return routeMap
     * @throws FileNotFoundException
     */

    public static HashMap<String, ArrayList<String>> readRouteFile() throws FileNotFoundException {
        Scanner routeData;
        routeData = new Scanner(new File("C:\\Users\\HP\\IdeaProjects\\Individual Project\\routes.csv"));

        HashMap<String, ArrayList<String>> routeMap = new HashMap<String, ArrayList<String>>();

        while (routeData.hasNext()) {
            String[] routeArray = routeData.nextLine().split(",");
            ArrayList<String> destList = new ArrayList<>();
            routeMap.put(airportArray[0], destList);
            if (routeMap.containsKey(routeArray[3])) {
                routeMap.get(routeArray[3]).add(routeArray[5]);
            } else {
                destList = new ArrayList<String>();
                destList.add(routeArray[5]);
                routeMap.put(routeArray[3], destList);
            }


        }
        routeData.close();
        System.out.println(routeMap);

        return routeMap;
    }
        public static void main (String[]args) throws FileNotFoundException {
           readAirportFile();

//            readRouteFile();
//        try{
//            readAirlineFile();
//        }catch(ArrayIndexOutOfBoundsException ae){
//            System.out.println("Encountered Error at" + ae.getMessage());
//        }

        }
    }


            
        








