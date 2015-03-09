package com.horia.horiafirstapp;

import java.util.Random;

/**
 * Created by Horia on 3/7/2015.
 */
public class GenerateRandom {
    // function that generates random exercise
    public static String generateRandom(int exercise_type) {

        //1=legs, 2=chest, 3=back
        Random randomGenerator = new Random();
        int randomInt = randomGenerator.nextInt(4);

        //generate legs exercise
        if (exercise_type == 1) {
            if (randomInt == 0) return "Squat";
            if (randomInt == 1) return "Leg Extension";
            if (randomInt == 2) return "Leg Press";
            if (randomInt == 3) return "Calf Raise";
        } else if (exercise_type == 2) {
            if (randomInt == 0) return "Bench Press";
            if (randomInt == 1) return "Push Up";
            if (randomInt == 2) return "Dumbbell Fly";
            if (randomInt == 3) return "Dips";
        } else if (exercise_type == 3) {
            if (randomInt == 0) return "Bent-over Row";
            if (randomInt == 1) return "Deadlift";
            if (randomInt == 2) return "Pullup";
            if (randomInt == 3) return "Lat Pulldown";
        } else {
            if (randomInt == 0) return "Preacher Curl";
            if (randomInt == 1) return "Shoulder Shrugs";
            if (randomInt == 2) return "Clean & Jerk";
            if (randomInt == 3) return "Lunges";
        }
        return "dunno how this happened";
    }
}
