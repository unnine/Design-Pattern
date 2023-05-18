package flyweight.after;

import java.awt.*;

/**
 * 플라이웨이트 패턴 대상 객체의 불변한 상태를 가진 클래스.
 * 즉, 공유 가능한 상태와 행동을 가지며 재사용된다.
 */
public class TreeType {
    private String name;
    private Color color;
    private TexturePaint texture;

    public TreeType(String name, Color color, TexturePaint texture) {
        this.name = name;
        this.color = color;
        this.texture = texture;
    }

    public void draw(Canvas canvas, int x, int y) {
        System.out.println("색상 및 질감 표현");
    }
}