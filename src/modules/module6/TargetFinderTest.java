package modules.module6;

import java.util.Arrays;

class TargetFinderTest {
    public static void main(String[] args) {
        int[] aiCoords = {10, 10};
        int[][] targets = {
                {20, 20},
                {15, 14},
                {30, 5}
        };

        TargetFinder targetFinder = new TargetFinder();
        int[] nearestTarget = targetFinder.findTarget(aiCoords, targets);

        //Expect [15, 14]
        System.out.println(Arrays.toString(nearestTarget));
    }
}
class TargetFinder{



    public int[] findTarget(int[] aiCoords, int[][] targets){
        double smallestDistance = Integer.MAX_VALUE;

        int[] closestPoint={};

        for (int[] target: targets){
            double currentDistance = Math.sqrt(  (target[0]-aiCoords[0])*(target[0]-aiCoords[0]) + (target[1]-aiCoords[1])*(target[1]-aiCoords[1])  );
            if (  currentDistance <   smallestDistance){
                smallestDistance=currentDistance;
                closestPoint=target;
            }
        }

        return closestPoint;
    }

}