package adapterDP.Client;

import adapterDP.Adaptee.WeightMachineForBabies;
import adapterDP.Adapter.WeightMachineAdapter;
import adapterDP.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
