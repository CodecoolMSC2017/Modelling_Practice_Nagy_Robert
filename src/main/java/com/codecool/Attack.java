package com.codecool;

import java.util.Map;
import java.util.HashMap;
import java.util.List;
import java.io.Serializable;
import java.util.ArrayList;

public class Attack implements Serializable {

    public HashMap<String, HashMap<Integer, Army>> army;

    public Attack(){
        this.army = new HashMap<String, HashMap<Integer, Army>>();
    }

    public HashMap<String, HashMap<Integer, Army>> createArmy(int numOfSoldiers, int numOfRangers, int numOfHeavies){

        HashMap<String, HashMap<Integer, Army>> createdArmy = new HashMap<String, HashMap<Integer, Army>>();

        HashMap<Integer, Army> unit1 = Army.createUnit(Units.SHORT_RANGE, numOfSoldiers);
        HashMap<Integer, Army> unit2 = Army.createUnit(Units.LONG_RANGE, numOfRangers);
        HashMap<Integer, Army> unit3 = Army.createUnit(Units.HEAVY, numOfHeavies);

        createdArmy.put("Short Range", unit1);
        createdArmy.put("Long Range", unit2);
        createdArmy.put("Heavy", unit3);

        return createdArmy;
    }




}
