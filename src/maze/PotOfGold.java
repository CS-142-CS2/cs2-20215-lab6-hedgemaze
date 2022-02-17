package maze;

/**
 * Hedge Maze graph-search lab main program
 *
 * @author RIT CS
 * February 2022
 */
public class PotOfGold {

    /** If there is a problem with the format of the command line */
    public static final int CMD_LINE_ERROR = 1;
    /** If the maze file cannot be opened */
    public static final int MAZE_FILE_NOT_FOUND = 2;
    /** If the program is unable to decipher the content of the maze file */
    public static final int MAZE_FILE_CONTENT_ERROR = 3;
    /** If the program is unable to decipher the user's input (coordinates) */
    public static final int USER_INPUT_ERROR = 4;

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
     * program exits with a non-zero error code. ({@link System#exit(int)})
     *
     * @param args [0]: name of hedge maze description file
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
