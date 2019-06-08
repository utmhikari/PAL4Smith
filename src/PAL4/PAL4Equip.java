package PAL4;

import java.util.HashMap;

public class PAL4Equip {
    private static PAL4Equip ourInstance = new PAL4Equip();

    public static PAL4Equip getInstance() {
        return ourInstance;
    }

    private HashMap<String, HashMap<String, Integer>> equipMap;

    public HashMap<String, HashMap<String, Integer>> getEquipMap() {
        return equipMap;
    }

    private PAL4Equip() {
        equipMap = new HashMap<>();

        equipMap.put("玄瞑剑", new HashMap<String, Integer>() {{
            put("尖晶石", 4);
            put("昆吾砂", 1);
            put("木炭", 3);
        }});

        equipMap.put("蛇影", new HashMap<String, Integer>() {{
            put("尖晶石", 4);
            put("青琅玕", 2);
            put("木炭", 5);
        }});

        equipMap.put("银角梳", new HashMap<String, Integer>() {{
            put("耀晶石", 1);
            put("玄武铁岩", 2);
        }});

        equipMap.put("紫阳冠", new HashMap<String, Integer>() {{
            put("耀晶石", 1);
            put("丝线", 4);
        }});

        equipMap.put("沁雪白绫衫", new HashMap<String, Integer>() {{
            put("丝线", 6);
            put("蚕丝", 2);
            put("白领石榴裙", 1);
            put("寒月冰魄", 1);
        }});

        equipMap.put("太极软甲", new HashMap<String, Integer>() {{
            put("斑铜矿", 10);
            put("昆吾砂", 8);
            put("木炭", 20);
        }});

        equipMap.put("鳞纹靴", new HashMap<String, Integer>() {{
            put("斑铜矿", 1);
            put("兽皮", 4);
            put("蚕丝", 2);
        }});

        equipMap.put("御风履", new HashMap<String, Integer>() {{
            put("琅环碧玉", 1);
            put("丝线", 3);
            put("蚕丝", 3);
        }});

        equipMap.put("定魂剑", new HashMap<String, Integer>() {{
            put("昆仑紫鸦乌", 2);
            put("自然金", 3);
            put("木炭", 5);
        }});

        equipMap.put("蟠龙爪", new HashMap<String, Integer>() {{
            put("尖晶石", 2);
            put("金红石", 2);
            put("木炭", 5);
        }});

        equipMap.put("霓裳羽衣", new HashMap<String, Integer>() {{
            put("丝线", 2);
            put("蚕丝", 30);
            put("蟠龙玛瑙", 1);
            put("绯云火石", 1);
        }});

        equipMap.put("赤金攒珠冠", new HashMap<String, Integer>() {{
            put("昆仑紫鸦乌", 2);
            put("自然金", 3);
            put("浩英石", 1);
        }});

        equipMap.put("鲛绡", new HashMap<String, Integer>() {{
            put("丝线", 15);
            put("蚕丝", 15);
            put("琅环碧玉", 2);
            put("黝碧石", 2);
        }});

        equipMap.put("飐风发带", new HashMap<String, Integer>() {{
            put("蚕丝", 3);
            put("丝线", 2);
            put("日辉晶魄", 1);
        }});

        equipMap.put("碎痕", new HashMap<String, Integer>() {{
            put("玄武铁岩", 3);
            put("昆吾砂", 2);
            put("木炭", 3);
        }});

        equipMap.put("紫宵银月", new HashMap<String, Integer>() {{
            put("紫晶", 3);
            put("寒月冰魄", 2);
            put("木炭", 5);
        }});

        equipMap.put("流霜月魄刃", new HashMap<String, Integer>() {{
            put("斑铜矿", 3);
            put("金红石", 2);
            put("霜露晶", 2);
            put("木炭", 5);
        }});

        equipMap.put("菱叶萦波梳", new HashMap<String, Integer>() {{
            put("羊脂白玉", 3);
            put("辉铜矿", 1);
            put("尖晶石", 2);
        }});

        equipMap.put("望仙鞋", new HashMap<String, Integer>() {{
            put("蚕丝", 6);
            put("兽皮", 3);
            put("绯云火石", 2);
        }});

        equipMap.put("凌波拾翠履", new HashMap<String, Integer>() {{
            put("蚕丝", 4);
            put("丝线", 4);
            put("金红石", 1);
            put("日辉晶魄", 1);
        }});

        equipMap.put("通天冠", new HashMap<String, Integer>() {{
            put("耀晶石", 4);
            put("琅环碧玉", 1);
            put("日辉晶魄", 1);
        }});

        equipMap.put("羿日焓灵刃", new HashMap<String, Integer>() {{
            put("青灵苍角刃", 1);
            put("金红石", 2);
            put("浩英石", 2);
            put("木炭", 5);
        }});

        equipMap.put("慑天", new HashMap<String, Integer>() {{
            put("火炼精", 1);
            put("金红石", 4);
            put("尖晶石", 2);
            put("木炭", 5);
        }});

        equipMap.put("飞雯焕日", new HashMap<String, Integer>() {{
            put("黯辰剑", 1);
            put("奇异石", 3);
            put("金红石", 3);
            put("木炭", 5);
        }});

        equipMap.put("司幽", new HashMap<String, Integer>() {{
            put("凤首木", 14);
            put("斑铜矿", 1);
            put("金红石", 2);
        }});

        equipMap.put("广袖流仙裙", new HashMap<String, Integer>() {{
            put("丝线", 36);
            put("蚕丝", 4);
            put("尖晶石", 1);
            put("黝碧石", 1);
        }});

        equipMap.put("玄武战袍", new HashMap<String, Integer>() {{
            put("兽皮", 30);
            put("蚕丝", 4);
            put("尖晶石", 2);
            put("金红石", 2);
        }});
    }
}
