import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Command {
    protected static String[] explorationVerbs = new String[]{"go", "map", "quit", "help"};
    protected static String[] fightVerbs = new String[]{"attack", "take", "quit", "help"};

    protected String verb, argument;

    public Command(String verb, String argument) {
        this.verb = verb;
        this.argument = argument;
    }

    /**
     * @return true if the command is correct
     */
    public boolean isUnknown() {
        return verb == null || !isValidVerb(verb);
    }

    public String getVerb() { 
    	return verb; 
    }

    public String getArgument() { 
    	return argument; 
    }

    public boolean hasArgument() { 
    	return argument != null; 
    }

    public String toString() {
        return "Command(" + verb + "," + argument + ")";
    }

    /**
     * Show all the possible commands
     */
    public static void printAll() {
        for (String s : explorationVerbs) {
            System.out.print(" " + s);
        }
        System.out.println();
    }

    public static boolean isValidVerb(String verb) {
    	
        for (String str : explorationVerbs) {
            if (verb.equals(str)) {
                return true;
            }
        }
        return false;
    }

    protected static Command readCommand() {
        System.out.print("> "); // Show the shell prompt 

        String inputLine = "";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try {
            inputLine = reader.readLine();
        } catch (IOException exc) {
            System.out.println("An error has occurred reading the data :"
                    + exc.getMessage());
        }

        StringTokenizer tokenizer = new StringTokenizer(inputLine);
        String verb = null;
        String argument = null;

        if (tokenizer.hasMoreTokens()) {
            verb = tokenizer.nextToken();
        }
        if (tokenizer.hasMoreTokens()) {
            argument = tokenizer.nextToken();
        }
        // We ignore the rest of the input

        return new Command(verb, argument);
    }
}
