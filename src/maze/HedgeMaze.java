package maze;

import java.util.Collection;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * A coordinate-based graph of nodes to represent a maze laid on a 2-D
 * grid of cells
 * @author YOUR NAME HERE
 *
 * February 2022
 */
public class HedgeMaze extends GridGraph {

    /** Input file symbol for a barrier between adjacent horizontal cells */
    public final static String VWALL = "|";

    /** Input file symbol for a barrier between adjacent vertical cells */
    public final static String HWALL = "-";

    /** Input file symbol for no barrier between adjacent horizontal cells */
    public final static String NO_WALL = ".";

    /** Input file symbol a cell */
    public final static String CELL = "O";

    // Add more methods and fields as needed.

    /**
     * Create a graph by reading a file. Details can be found in the lab
     * writeup.
     * @param fileName location of maze specification
     * @throws FileNotFoundException if file named does not exist
     * @throws IOException if there is something else wrong with the file
     * @rit.post Graph and Nodes are fully formed with all connections as
     *           specified in the file.
     */
    public HedgeMaze( String fileName )
            throws FileNotFoundException, IOException {
        // TODO Additional code here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numRows() {
        return -1; // TODO
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public int numCols() {
        return -1; // TODO
    }

    /**
     * {@inheritDoc}
     * @rit.pre this.contains( r1, c1 ) && this.contains( r2, c2 )
     */
    @Override
    public boolean connected( int r1, int c1, int r2, int c2 ) {
        return false; // TODO
    }


    /**
     * Print out detail about this graph.
     * This is done with a heading of<br>
     * &quot;Graph Details:&quot;
     * followed by a blank line, and then
     * printing the details of each of the graph's Nodes, in the Nodes'
     * natural order.
     */
    public void printAdjacencyList() {
        System.out.println( "Graph Details:" + System.lineSeparator() );
        // TODO Additional code here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public boolean contains( int r, int c ) {
        return false; // TODO additional code here
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Collection< Coordinates > findPath(
            Coordinates start, Coordinates end ) {
        return null; // TODO additional code here
    }

    // Additional fields and methods as needed
}
