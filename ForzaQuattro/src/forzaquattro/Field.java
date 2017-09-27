package forzaquattro;

/**
 *
 * @author zappa.stefano
 */
public class Field {
    private Casella Grid [] [];
    int dimX;
    int dimY;
    
    public Field (int dim, int dim2){
        Grid = new Casella [dim] [dim2];
        dimX=dim;
        dimY=dim2;
    }
    
    boolean Place (int x, int y, String s){
        if (Grid [x][y].isFree () == true){
            Grid[x][y].cambiaColore(s);
            return true;
        } else{
            return false;
        }
    }
    
    public void print(){
        for (int r=0; r<dimX; r++){
            for (int c=0; c<dimY; c++){
                System.out.print(Grid[r][c].toString()+"   |   ");
            }
            System.out.println();
        }
    }
}
