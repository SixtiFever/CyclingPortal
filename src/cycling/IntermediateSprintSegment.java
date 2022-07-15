package cycling;

public class IntermediateSprintSegment extends Segment {

    SegmentType type = SegmentType.SPRINT;

    public IntermediateSprintSegment(int stage_id, double location, double length){
        super(stage_id, location, length);
        points_spec = new int[]{20, 17, 15, 13, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
    }



}
