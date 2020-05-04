package JavaCollectionMainTask;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Airline implements iAirlines {

    private String airlineName;
    private Aircraft countOfAircraft;

    ArrayList<Aircraft> aircrafts = new ArrayList<Aircraft>();

    public Airline(String airlineName){
        this.airlineName = airlineName;
    }

    public String getAircraft(){
        return airlineName;
    }

    @Override
    public void addAircraft(Aircraft aircraft) {
        aircrafts.add(aircraft);
    }

    @Override
    public int getPeopleCapacity() {
        int totalPeopleCapacity = 0;
                for (int i = 0; i < aircrafts.size(); ++i){
            totalPeopleCapacity += aircrafts.get(i).getPeopleCapacity();
        }
        return totalPeopleCapacity ;
    }

    @Override
    public int getCarryingCapacity(){
        int totalCarryingCapacity = 0;
        for (int i = 0; i < aircrafts.size(); ++i){
            totalCarryingCapacity += aircrafts.get(i).getCarryingCapacity();
        }
        return totalCarryingCapacity ;
    }

    @Override
    public String getAircraftModel(){
        String aircraftModel = null;
        for (int i = 0; i < aircrafts.size(); ++i){
            aircraftModel = aircrafts.get(i).getAircraftModel();
        }
        return aircraftModel;
    }

    @Override
    public int getFlightRange() {
        int flightRange = 0;
        for (int i = 0; i < aircrafts.size(); ++i){
            flightRange += aircrafts.get(0).getCarryingCapacity();
        }
        return flightRange;
    }

    @Override
    public int getFuelConsumption() {
        int fuelConsumption = 0;
        for (int i = 0; i < aircrafts.size(); ++i){
            fuelConsumption += aircrafts.get(i).getFuelConsumption();
        }
        return fuelConsumption;
    }

    public void sortPlanesByFlightRange() {
        Collections.sort(this.aircrafts, new AircraftCompare());
    }

    public void showAirlineAircrafts() {
        showAircraftList(this.aircrafts);
    }

    private void showAircraftList(ArrayList<Aircraft> al) {
        System.out.println(this.getAircraft());
        for (int i = 0; i < al.size(); ++i) {
            System.out.println(al.get(i));
        }
    }

    public ArrayList<Aircraft> filterByFuelConsumption(int min, int max ){
        ArrayList<Aircraft> resultList = new ArrayList<>();
            for (int i=0; i<aircrafts.size(); i++){
                int planeConsumption = aircrafts.get(i).getFuelConsumption();
                if (planeConsumption >= min && planeConsumption <= max){
                    resultList.add(aircrafts.get(i));
                    System.out.println(resultList);
                }
                else
                    System.out.println("No aircraft");

            }
        return resultList;
    }

}
