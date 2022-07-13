package cycling;

/**
 * Thrown when attempting to add segments (sprints or mountains) to a time-trial stage.
 *
 * @author Diogo Pacheco
 * @version 1.0
 *
 */

public class InvalidSegmentTypeException extends Exception {



        /**
         * Constructs an instance of the exception with no message
         */
        public InvalidSegmentTypeException() {
            // do nothing
        }

        public String toString(){
            return "InvalidSegmentTypeException - Segment type entered is not valid.";
        }

        /**
         * Constructs an instance of the exception containing the message argument
         *
         * @param message message containing details regarding the exception cause
         */
        public InvalidSegmentTypeException(String message) {
            super(message);
        }




}
