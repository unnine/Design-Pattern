package flyweight.after;

import java.awt.*;

/**
 * 플라이웨이트 패턴 대상 객체의 고유한 상태만 가진다.
 *
 * 즉, 공유 불가능한 상태와 행동을 가진다.
 */
public class Tree {
    private final int x;
    private final int y;
    private final TreeType type;

    public Tree(int x, int y, TreeType type) {
        this.x = x;
        this.y = y;
        this.type = type;
    }

    public void draw(Canvas canvas) {
        type.draw(canvas, x, y);
    }
}