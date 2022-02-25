package maze;

import java.io.IOException;

/**
 * Hedge Maze graph-search lab main program
 *
 * @author RIT CS
 * February 2022
 */
public class PotOfGold {

    /** If there is a problem with the format of the command line */
    public static final int CMD_LINE_ERROR = 1;
    /** If the maze file cannot be read */
    public static final int MAZE_FILE_ERROR = 2;
    /** If console input causes an {@link IOException} */
    public static final int USER_INPUT_ERROR = 3;

    /** What the user types to end the program, instead of new coordinates */
    public static final String USER_DONE = "quit";

    /** The definition of whitespace for the String.split(regex) method */
    public static final String WHITESPACE = "\\s+";

    /**
     * Main driver opens a maze file and builds a GridGraph.
     * It then repeatedly prompts for start and finish locations, and prints
     * resulting paths using a breadth-first search.
     * New start and finished locations are repeatedly requested until
     * the user enters the {@link #USER_DONE} value for the starting row.
     *
     * If anything goes wrong with the file input, or if the program
     * is unable to read data from standard input (the console), the
     * program exits with a non-zero error code.
     * Error codes are given as static constants in this class.
     *
     * @param args [0]: name of hedge maze description file
     * @see System#exit(int)
     */
    public static void main( String[] args ) {
        if ( args.length != 1 ) {
            System.out.println( "Usage: java PotOfGold maze-file" );
            System.exit( CMD_LINE_ERROR );
        }
        // TODO Implement the main algorithm here.
    }

    // Add more methods and fields as needed.
}
