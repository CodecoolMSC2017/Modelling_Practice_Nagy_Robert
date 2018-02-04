package com.codecool;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Attack {

    public List<HashMap<Integer, Army>> army;

    public Attack(){
        this.army = new List<HashMap<Integer, Army>>();
    }

    public List<HashMap<Integer, Army>> createArmy(int numOfSoldiers, int numOfRangers, int numOfHeavies){

        List<HashMap<Integer, Army>> createdArmy = new List<HashMap<Integer, Army>>();

        Map<Integer, Army> unit1 = Army.createUnit(Units.SHORT_RANGE, numOfSoldiers);
        Map<Integer, Army> unit2 = Army.createUnit(Units.LONG_RANGE, numOfRangers);
        Map<Integer, Army> unit3 = Army.createUnit(Units.HEAVY, numOfHeavies);

        createdArmy.add(unit1);
        createdArmy.add(unit2);
        createdArmy.add(unit3);

        return createdArmy;
    }




}
