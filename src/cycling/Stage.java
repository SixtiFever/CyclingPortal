package cycling;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

public class Stage {

    String stage_name;
    String stage_description;
    StageType stage_type;  // value of this dictates the points classification
    double stage_length;
    public boolean stage_complete = false;  // true when the stage configuration is complete
    int race_id;
    public int stage_id;
    LocalDateTime start_time;
    public int[] points_allocation;  // use a switch statement to assign the specific points specification based on the type e.g switch(stage_type) { case FLAT: points_allocation = new int[15]; etc...}

    public ArrayList<Segment> segments_in_stage = new ArrayList<>();

    Stage(int raceId, String stageName, String description, double length, LocalDateTime startTime,
          StageType type){
        Random r = new Random();
        stage_id = r.nextInt(200);
        this.race_id = raceId;
        this.stage_name = stageName;
        this.stage_description = description;
        this.stage_length = length;
        this.start_time = startTime;
        try {
            pointsSpecification(type);
        } catch (InvalidStageTypeException exc){
            System.out.println(exc);
        }

    }


    // add a segment to this stage
    public void addSegmentToStage(int segmentID){

    }


    // takes in the stage type, and assigns the appropriate points specification to the stage object.
    int[] pointsSpecification(StageType stage_type) throws InvalidStageTypeException{
        if(stage_type == StageType.FLAT) {
            points_allocation = new int[]{50,30,20,18,16,14,12,10,8,7,6,5,4,3,2};
            return points_allocation;
        }
        if(stage_type == StageType.MEDIUM_MOUNTAIN) {
            points_allocation = new int[]{30,25,22,19,17,15,13,11,9,7,6,5,4,3,2};
            return points_allocation;
        }
        if(stage_type == StageType.HIGH_MOUNTAIN) {
            points_allocation = new int[]{20,17,15,13,11,10,9,8,7,6,5,4,3,2,1};
            return points_allocation;
        }
        if(stage_type == StageType.TT) {
            points_allocation = new int[]{20,17,15,13,11,10,9,8,7,6,5,4,3,2,1};
            return points_allocation;
        }
        throw new InvalidStageTypeException();
    }

}
