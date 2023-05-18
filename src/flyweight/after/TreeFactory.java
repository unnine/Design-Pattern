package flyweight.after;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

/**
 * 플라이웨이트 대상 객체의 불변 객체를 생성하는 클래스.
 * 객체 풀을 이용해 캐싱한다.
 */
public class TreeFactory {
    private static final Map<String, TreeType> treeTypes = new HashMap<>();

    public static TreeType getTreeType(String name, Color color, TexturePaint texture) {
        if (!treeTypes.containsKey(name)) {
            treeTypes.put(name, new TreeType(name, color, texture));
        }
        return treeTypes.get(name);
    }
}