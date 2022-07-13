package cycling;

public class HillSegment extends Segment {

    public int[] points_specification;
    public double avg_gradient;

        public HillSegment(int stage_id, double location, double length, SegmentType hill_type, double avg_gradient){
            super(stage_id, location, length); // assigns superclass members
            this.avg_gradient = avg_gradient;
            try{
                pointsSpecification(hill_type);
            } catch (InvalidSegmentTypeException exc){
                System.out.println(exc);
            }
        }

        /**
         * checks for the type of segment, and assigns the relevant points specification.
         * Assigns to both this object and the super object
         * Needs to assign to super object (Segment) because the ArrayList<> is of type Segment. E.g. I can't use HillSegments in
         * it.
         * */
        int[] pointsSpecification(SegmentType type) throws InvalidSegmentTypeException {
            if(type == SegmentType.C1){
                points_specification = new int[]{10,8,6,4,2,1};
                super.points_spec = points_specification;
                return points_specification;
            }
            if(type == SegmentType.C2){
                points_specification = new int[]{5,3,2,1};
                super.points_spec = points_specification;
                return points_specification;
            }
            if(type == SegmentType.C3){
                points_specification = new int[]{2,1};
                super.points_spec = points_specification;
                return points_specification;
            }
            if(type == SegmentType.C4){
                points_specification = new int[]{1};
                super.points_spec = points_specification;
                return points_specification;
            }
            if(type == SegmentType.HC){
                points_specification = new int[]{20,15,12,10,8,6,4,2};
                super.points_spec = points_specification;
                return points_specification;
            }
            System.out.println("Type must be from one of the Mountain classification enum options.");
            throw new InvalidSegmentTypeException();
        }

}
