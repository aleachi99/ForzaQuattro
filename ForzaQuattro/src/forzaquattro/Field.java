package forzaquattro;

/**
 *
 * @author zappa.stefano
 */
public class Field {
    private Casella Grid [] [];
    
    public Field (int dim, int dim2){
        Grid = new Casella [dim] [dim2];
    }
    
    boolean Place (int x, int y, String s){
        if (Grid [x][y].isFree () == true){
            Grid[x][y].cambiaColore(s);
            return true;
        } else{
            return false;
        }
    }
}
