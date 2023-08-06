package Array;

public class RainWater {
    public static void main(String[] args) {
        int pillars[] = {0,1,0,2,1,3,0,2};
        if(pillars.length == 0){
            System.out.println("No pillar to store the water");
        }

        // find the left max pillar
        int leftPillarMax [] = new int[pillars.length];
        leftPillarMax[0] = pillars[0];
        for(int i=1; i<pillars.length; i++){
            leftPillarMax[i] = Math.max(leftPillarMax[i-1],pillars[i]);
        }
        // fing the right max pillar
        int rightPillarMax [] = new int[pillars.length];
        rightPillarMax[rightPillarMax.length -1] = pillars[pillars.length - 1];

        for(int  i=rightPillarMax.length - 2; i>=0 ; i--){
            rightPillarMax[i] = Math.max(rightPillarMax[i+1],pillars[i]);
        }

        int amountWater = 0;
        for(int i=0; i<pillars.length; i++){
            int currentPillar = pillars[i];
            int decidingPillar = Math.min(leftPillarMax[i],rightPillarMax[i]);
            amountWater += amountWater + (decidingPillar - currentPillar);
        }
    }   
}
