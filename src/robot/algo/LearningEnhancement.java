package robot.algo;

import robot.enums.Mode;

import java.util.Random;

public class LearningEnhancement
{
    private static final double MOVE_EPSILON = 0.1;

    private double epsilon;

    /**
     * @author Enzo DECHAENE.
     */
    public LearningEnhancement()
    {
        epsilon = 1.0; /* Exploration Mode */
    }

    /**
     *
     * @return
     * @author Enzo DECHAENE.
     */
    public Mode getTypeMove()
    {
        if (LearningEnhancement.random() < epsilon) {
            //epsilon -= MOVE_EPSILON;
            return Mode.EXPLORATION;
        }
        else {
            epsilon += MOVE_EPSILON;
            return Mode.OPERATION;
        }
    }

    /**
     * This function is use to have a random between two integer.
     * @return
     * @author Enzo DECHAENE.
     */
    public static double random()
    {
        return Math.random();
    }
}
