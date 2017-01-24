import java.awt.*;

/**
 * Created by Ruta on 2017-01-24.
 */
public class Model {

    //<editor-fold desc="Variables">
    private View view;
    private State turn;

    enum State{Blank, X, O}
    private int numRows = 3;
    private int numCols = 3;
    private int moveCount;
    private State[][] grid = new State[numRows][numCols];
    //</editor-fold>

    public Model(){
        initializeGrid();
        moveCount = 0;
    }

    public void addView(View v){
        this.view = v;
    }

    public void updateView(){
        view.update();
    }

    private void initializeGrid(){
        turn = State.X;
        for(int i = 0; i < numRows; i++){
            for(int j = 0; j < numCols; j++){
                grid[i][j] = State.Blank;
            }
        }
    }

    public void makeMove(int row, int col, State move){
        if(grid[row][col] == State.Blank){
            grid[row][col] = move;

            if(gameOver()){

            }else{
                if(move == State.X) turn = State.O;
                else turn = State.X;
            }

            updateView();
        }
    }

    public void newGame(){
        initializeGrid();
        updateView();
    }

    private boolean checkGridForX(){

    }

    public boolean gameOver(){
        return checkGridForX();
    }
}
