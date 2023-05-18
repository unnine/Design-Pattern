package flyweight.before;

import java.awt.*;

/**
 *  이 클래스는 개수 제한없이 무수히 많이 생성되고 있다.
 *  따라서 이 클래스를 생성하는 과정에 flyweight 패턴을 적용한다.
 */
public class Tree {
    private final int x;
    private final int y;
    private final String name;
    private final Color color;
    private final TexturePaint texture;

    public Tree(int x, int y, String name, Color color, TexturePaint texture) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas) {
        System.out.println("색상 및 질감 표현");
    }
}