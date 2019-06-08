package PAL4;

import java.util.HashMap;

public class PAL4Smith {

    private HashMap<String, Integer> smithMap;

    public PAL4Smith() {
        smithMap = new HashMap<>();
    }

    public void setMap(String ingredient, int num) {
        if(!smithMap.containsKey(ingredient)) {
            smithMap.put(ingredient, num);
        } else {
            smithMap.put(ingredient, smithMap.get(ingredient) + num);
        }
    }

    public void addEquip(String equipName, int num) {
        if(PAL4Equip.getInstance().getEquipMap().containsKey(equipName)) {
            for(int i = 0; i < num; i++) {
                for(String ing : PAL4Equip.getInstance().getEquipMap().get(equipName).keySet()) {
                    setMap(ing, PAL4Equip.getInstance().getEquipMap().get(equipName).get(ing));
                }
            }
        }
    }

    public void output() {
        for(String ing : smithMap.keySet()) {
            System.out.println(ing + ": " + smithMap.get(ing));
        }
    }

    public static void main(String args[]) {
        PAL4Smith smith = new PAL4Smith();

        smith.addEquip("玄武战袍", 2);
        smith.addEquip("广袖流仙裙", 2);
        smith.addEquip("慑天", 2);
        smith.addEquip("司幽", 1);
        smith.addEquip("凌波拾翠履", 1);
        smith.addEquip("羿日焓灵刃", 1);
        smith.output();
    }

}
