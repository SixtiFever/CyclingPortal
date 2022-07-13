package cycling;

import java.util.ArrayList;
import java.util.HashMap;

// creates a race object
public class Race {


    /** MEMBERS **/
    String race_name;
    String race_description;
    int race_id;

    public ArrayList<Stage> race_stages = new ArrayList<>();  // contains stages of the race

    // leaderboards
    HashMap<Integer, Integer> leaderboard_GC = new HashMap<Integer, Integer>(); // <Rider ID, elapsed time> --> Updated after every stage
    HashMap<Integer, Integer> leaderboard_Points = new HashMap<Integer, Integer>(); // <Rider ID, accumulated points> --> Updated after every stage
    HashMap<Integer, Integer> leaderboard_KOM = new HashMap<Integer, Integer>(); // <Rider ID, Mountain Points> --> Updated after every stage


    /** CONSTRUCTORS **/
    Race(){}  // default

    Race(String raceName, String raceDescription){
        CyclingPortal.races_all.add(this);  // add race object to the races list
        //race_id = CyclingPortal.races_all.size();  // setting race id to position in races list.
        this.race_name = raceName;
        this.race_description = raceDescription;
    }


    /** METHODS **/

    public void checkForStageID(int stageID) throws IDNotRecognisedException {
        int i;
        for( i = 0; i < race_stages.size(); i++ ){
            if(stageID == race_stages.get(i).stage_id){
                return;
            }
        }
        throw new IDNotRecognisedException();
    }
    // find stage

    // find segment

    // update leaderboards

    // display final results

}
