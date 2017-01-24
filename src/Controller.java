import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * Created by Ruta on 2017-01-24.
 */
public class Controller implements MouseListener {

    private Model model;

    public Controller(Model m){
        this.model = model;

    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    //<editor-fold desc="Unused Mosue Events">
    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
    //</editor-fold>
}
