Flight Routing Program
      Given a start city and a destination city, this program computes the path from the start to the destination.It outputs 
a series of flights that take a passenger from the start city to the destination city. The program takes a file containing 
the start and destination cities, reads it and finds the flight to take from one place to another.This flight routing program
was written in java. Data (csv) files containing flight details are attached in this project folder. These data files were 
airports.csv, airlines.csv and routes.csv. 
    Airport.csv is a database of airports spanning the globe. Each entry contains the following information: 
Airport ID, Name, City, Country, IATA code, ICAO code, Latitude, Longitude, Altitude, Time zone, DST (Daylight savings time), 
Tz database time zone, Type, Source of this data.
   Airlines.csv is a database of airlines. Each entry contains the following information: Airline ID, Name, Alias, IATA code,
ICAO code, Callsign, Country, Active.
   Routes.csv is a database of routes/flights between airports on various airlines spanning the globe. Each entry contains the 
following information: Airline code, Airline ID, Source airport code, Source airport ID, Destination airport code, Destination
airport ID, Codeshare, Stops, Equipment.
     This routing program contains airport, airline and route classes with variables to represent the various columns of the
databases. A file reader class with methods to read the databases and call the constructors of the airport, airline and route
classes to create objects of the respective types. A flight routing class to find the flight path from the start city to the 
destination class and a node class to help in the flight routing process. There is also a main class where all the other 
classes can be called and instantiated.   
