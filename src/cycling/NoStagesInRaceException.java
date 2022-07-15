package cycling;

public class NoStagesInRaceException extends Exception {

    /**
     * Constructs an instance of the exception with a message
     */
    public NoStagesInRaceException() {
        // do nothing
    }

    public String toString(){
        return "NoStagesInRaceException -- The race does not have any stages or the stages are a distance of 0km.";
    }

    /**
     * Constructs an instance of the exception containing the message argument
     *
     * @param message message containing details regarding the exception cause
     */
    public NoStagesInRaceException(String message) {
        super(message);
    }

}
