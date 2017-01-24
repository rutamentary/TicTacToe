/**
 * Created by Ruta on 2017-01-24.
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TicTacToe {

    public static void createAndShowGUI(){
        //Create and set up window
        JFrame frame = new JFrame("Tic-Tac-Toe");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Model model = new Model();
        Controller controller = new Controller(model);
        View view = new View(model, controller);
        model.addView(view);

        BorderLayout layout = new BorderLayout();
        JPanel contentPanel = new JPanel(layout);
        contentPanel.setBorder(BorderFactory.createLoweredBevelBorder());

        frame.getContentPane().add(contentPanel);
        contentPanel.add(view, BorderLayout.CENTER);

        frame.setPreferredSize(new Dimension(500,500));
        frame.setResizable(false);
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }

}
