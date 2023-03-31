import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
public class Logging {
    /**
     * @name -- Logging
     * @description -- Contains methods to build log entries from user input and calculation results
     * @params -- ArrayList log - contains all the lines of the log
     */
    ArrayList<String> log = new ArrayList<String>();

    /**
     * method addEquation creates a string from user input, result of the calculation,
     * and the number held in memory. This is part of the log entry.
     * @param a - Double - first user-provided number
     * @param b - String - user-provided operator
     * @param c - Double - second user-provided number
     * @param d - Double - result of the calculation
     * @param e - Double - a result held in memory for later calculation using the 'MEM' command
     * @return - a String for part of the log entry
     */
    public static String addEquation (Double a, String b, Double c, Double d, Double e) {
        return  (Double.toString(a )+ " " + b + " " + Double.toString(c) + " = " + Double.toString(d) +
                "     " + "MEM = " + Double.toString(e));
   }

    /**
     * method addEquation creates a string from user input and the result of the calculation,
     * This is part of the log entry.
     * @param a - Double - first user-provided number
     * @param b - String - user-provided operator
     * @param c - Double - second user-provided number
     * @param d - Double - result of the calculation
     */
    public static String addEquation (Double a, String b, Double c, Double d) {
        return  (Double.toString(a )+ " " + b + " " + Double.toString(c) + " = " + Double.toString(d));
    }

    /**
     * method getTimeStamp gets a timestamp for the log entry
     * @return - String timestamp - the date and time of the calculation in
     * yyyy-MM-dd HH:mm:ss format. This is part of the log entry.
     */
   public static String getTimestamp() {
       SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
       String timestamp = dateFormat.format(new Date());
       return timestamp;
   }

    /**
     * method setLog is the setter for log
     * @param log - the ArrayList holding the log entries for the current user session
     */
    public void setLog(ArrayList<String> log) {

        this.log = log;
    }

    /** method getLog is the getter for log.
     * @return - the ArrayList holding the log entries for the current user session
     */
    public ArrayList<String> getLog() {

        return log;
    }

    /**
     * method printLog outputs the session log line by line when the user enters "PRINT'
     * @param x - the ArrayList of the log entries
     */
    public static void printLog(ArrayList x) {

        for (int i = 0; i < x.size(); i++) {
            System.out.println(x.get(i));
        }
    }

    /**
     * method printLog - When there is no log yet, this method provides output saying
     * there is no log.
     */
    public static void printLog() {
       GetInput.displayLine("There is nothing in the log.");
        }
    }

