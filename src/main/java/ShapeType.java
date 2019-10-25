import java.awt.*;

public enum ShapeType implements Shape{
    OVAL_FILL() {
        public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
            circle.setColor(color);
            circle.drawOval(x, y, width, height);
            circle.fillOval(x, y, width, height);
        }
    },
    OVAL_NOFILL() {
        public void draw(Graphics circle, int x, int y, int width, int height, Color color) {
            circle.setColor(color);
            circle.drawOval(x, y, width, height);
        }
    },
    LINE() {
        public void draw(Graphics line, int x1, int y1, int x2, int y2, Color color) {
            line.setColor(color);
            line.drawLine(x1, y1, x2, y2);
        }
    };
}