package flyweight.before;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 컨텍스트 클래스
 */
public class Forest {
    public List<Tree> trees = new ArrayList<>();

    public Tree plantTree(int x, int y, String name, Color color, TexturePaint texture) {
        Tree tree = new Tree(x, y, name, color, texture);
        trees.add(tree);
        return tree;
    }

    public void draw(Canvas canvas) {
        for (Tree tree : trees) {
            tree.draw(canvas);
        }
    }
}