import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

/**
 * Created by Ruta on 2017-01-24.
 */
public class View extends JPanel {

    private Model model;
    private Controller controller;

    private int columnCount = 3;
    private int rowCount = 3;
    private ArrayList<Rectangle> cells;

    public View(Model m, Controller c){
        this.model = m;
        this.controller = c;
        cells = new ArrayList<>(columnCount * rowCount);
    }

    public void update(){
        repaint();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g.create();

        int width = getWidth();
        int height = getHeight();

        int cellWidth = width / columnCount;
        int cellHeight = height / rowCount;

        int xOffset = (width - (columnCount * cellWidth)) / 2;
        int yOffset = (height - (rowCount * cellHeight)) / 2;

        if (cells.isEmpty()) {
            for (int row = 0; row < rowCount; row++) {
                for (int col = 0; col < columnCount; col++) {
                    Rectangle cell = new Rectangle(
                            xOffset + (col * cellWidth),
                            yOffset + (row * cellHeight),
                            cellWidth,
                            cellHeight);
                    cells.add(cell);
                }
            }
        }

        if (selectedCell != null) {

            int index = selectedCell.x + (selectedCell.y * columnCount);
            Rectangle cell = cells.get(index);
            g2d.setColor(Color.BLUE);
            g2d.fill(cell);

        }

        g2d.setColor(Color.GRAY);
        for (Rectangle cell : cells) {
            g2d.draw(cell);
        }

        g2d.dispose();
    }
}
