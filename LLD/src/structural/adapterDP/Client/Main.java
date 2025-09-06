package structural.adapterDP.Client;

import structural.adapterDP.Adaptee.WeightMachineForBabies;
import structural.adapterDP.Adapter.WeightMachineAdapter;
import structural.adapterDP.Adapter.WeightMachineAdapterImpl;

public class Main {

    public static void main(String[] args){

        WeightMachineAdapter weightMachineAdapter = new WeightMachineAdapterImpl(new WeightMachineForBabies());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
