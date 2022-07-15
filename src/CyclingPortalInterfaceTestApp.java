import cycling.IllegalNameException;
import cycling.InvalidNameException;
import cycling.*;

import java.time.LocalDateTime;

/**
 * A short program to illustrate an app testing some minimal functionality of a
 * concrete implementation of the CyclingPortalInterface interface -- note you
 * will want to increase these checks, and run it on your CyclingPortal class
 * (not the BadCyclingPortal class).
 *
 * 
 * @author Diogo Pacheco
 * @version 1.1
 */
public class CyclingPortalInterfaceTestApp {

	/**
	 * Test method.
	 * 
	 * @param args not used
	 */
	public static void main(String[] args) throws InvalidNameException, IllegalNameException {
		System.out.println("The system compiled and started the execution...");

		CyclingPortal portal1 = new CyclingPortal();

		try {
			portal1.createRace("Tour1", "The first race"); // create race
			portal1.createRace("Tour2", "The second race");
			portal1.createRace("Tour3", "The third race");
			portal1.createRace("Tour4", "The fourth race");

			int race1_id = portal1.getRaceIds()[0];  // id of the first race
			Race currentRace = portal1.findRaceID(race1_id);

			portal1.addStageToRace(race1_id, "StageA", "This is stage A", 10.0, LocalDateTime.now(), StageType.FLAT);
			portal1.addStageToRace(race1_id, "StageB", "This is stage B", 10.0, LocalDateTime.now(), StageType.FLAT);



			// get stage object
			Stage stage1 = currentRace.race_stages.get(0);
			Stage stage2 = currentRace.race_stages.get(1);

			int stage_1_id = stage1.stage_id;
			int stage_2_id = stage2.stage_id;

			System.out.println(stage_1_id);
			System.out.println(stage_2_id);

			System.out.println(stage1.stage_complete);
			System.out.println(stage2.stage_complete);



			portal1.addCategorizedClimbToStage(stage_1_id, 2.0, SegmentType.C1, 2.5, 1.0);
			portal1.addCategorizedClimbToStage(stage_1_id, 4.0, SegmentType.C1, 2.5, 1.0);
			portal1.addIntermediateSprintToStage(stage_1_id, 5.0);


			portal1.concludeStagePreparation(stage_1_id);
			portal1.concludeStagePreparation(stage_2_id);

			System.out.println(stage1.stage_complete);
			System.out.println(stage2.stage_complete);

			System.out.println(portal1.viewRaceDetails(race1_id));





//			int[] ids = portal1.getRaceIds();  // get race IDs
//			System.out.println(Arrays.toString(ids));
//
//			int race1ID = ids[0];  // remove race by ID
//			int race2ID = ids[1];
//			System.out.println(race1ID);
//			portal1.removeRaceById(race1ID);

		} catch (IDNotRecognisedException | InvalidLocationException | InvalidStageStateException | InvalidStageTypeException | InvalidLengthException exc){
			System.out.println(exc);
			exc.printStackTrace();
		}


//		// TODO replace BadMiniCyclingPortal by CyclingPortal
//		MiniCyclingPortalInterface portal1 = new BadMiniCyclingPortal();
//		MiniCyclingPortalInterface portal2 = new BadMiniCyclingPortal();
//
//		assert (portal1.getRaceIds().length == 0)
//				: "Innitial Portal not empty as required or not returning an empty array.";
//		assert (portal1.getTeams().length == 0)
//				: "Innitial Portal not empty as required or not returning an empty array.";
//
//		try {
//			portal1.createTeam("TeamOne", "My favorite");
//			portal2.createTeam("TeamOne", "My favorite");
//		} catch (IllegalNameException e) {
//			e.printStackTrace();
//		} catch (InvalidNameException e) {
//			e.printStackTrace();
//		}
//
//		assert (portal1.getTeams().length == 1)
//				: "Portal1 should have one team.";
//
//		assert (portal2.getTeams().length == 1)
//				: "Portal2 should have one team.";

	}

}
