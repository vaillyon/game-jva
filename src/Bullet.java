import java.awt.*;

public class Bullet extends GameObject {
    private int speed = 8;

    public Bullet(int x, int y) {
        this.x = x;
        this.y = y;
        this.width = 10;
        this.height = 20;
    }

    @Override
    public void update() {
        y -= speed;
        if (y < 0) alive = false;
    }

    @Override
    public void draw(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillRect(x, y, width, height);
    }
}

