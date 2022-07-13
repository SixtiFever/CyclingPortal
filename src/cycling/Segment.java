package cycling;

import java.util.Random;

// superclass for hill and sprint segments
public class Segment {

    public int stage_id;
    public int segment_id;
    public double end_location; // where the segment ends in the stage
    public double length; // length of the segment

    public int[] points_spec;

    Segment(int stage_id, double end_location, double length){
        Random r = new Random();
        this.segment_id = r.nextInt(200);  // generating a random ID
        this.end_location = end_location;
        this.length = length;
        this.stage_id = stage_id;

    }

    /** METHODS **/
}
