import acm.graphics.GCanvas;
import acm.graphics.GRect;

import java.awt.event.ComponentEvent;
import java.awt.event.ComponentListener;

public class MyCanvas extends GCanvas implements ComponentListener {
    public MyCanvas() {
        addComponentListener(this);
        rect = new GRect(BOX_W, BOX_H);
        rect.setFilled(true);
    }
    public void update () {
        removeAll();
        add(rect, (getWidth() - BOX_W) / 2, (getHeight() - BOX_H) / 2);
    }
    public void componentResized(ComponentEvent e) {update();}
    public void componentHidden(ComponentEvent e) {}
    public void componentMoved(ComponentEvent e) {}
    public void componentShown(ComponentEvent e) {}

    private static final double BOX_W = 50;
    private static final double BOX_H = 50;
    private GRect rect;
}
