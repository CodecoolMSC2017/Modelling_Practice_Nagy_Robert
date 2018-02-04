package com.codecool;

import java.util.Map;
import java.util.HashMap;
import java.util.List;

public class Army {

    protected Units unit;
    protected int damage;
    protected int hp;
    protected int reach;

    public Army(Units unit, int damage, int hp, int reach){
        this.unit = unit;
        this.damage = damage;
        this.hp = hp;
        this.reach = reach;
    }

    public static Map<Integer, Army> createUnit(Units unit, int numOfSoldiers){

        Map<Integer, Army> soldiers = new HashMap<Integer, Army>();
        switch (unit) {
            case SHORT_RANGE:
                for(int i = 0; i < numOfSoldiers; i++){

                    soldiers.put(i, new Soldier());
                }
                break;
            case LONG_RANGE:
                for(int j = 0; j < numOfSoldiers; j++){
                    soldiers.put(j, new Ranger());
                }
                break;
            case HEAVY:
                for(int k = 0; k < numOfSoldiers; k++){
                    soldiers.put(k, new Heavy());
                }
                break;
            default:
                throw new IllegalArgumentException();
        }
        return soldiers;
    }

    public Units getUnit() {
        return unit;
    }

    public int getDamage() {
        return damage;
    }

    public int getHp() {
        return hp;
    }

    public int getReach() {
        return reach;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }
}
