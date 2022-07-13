package cycling.stage;
import cycling.*;
//import cycling.StageType;

public class StageFlat extends StageSuperclass {

    public StageFlat(){
        type = StageType.FLAT; // setting this stage object to Flat type
        points_classification = new int[]{50,30,20,18,16,14,12,10,8,7,6,5,4,3,2};  // top 15 riders are allocated associated points
    }
}
