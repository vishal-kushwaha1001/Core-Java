package trappedRainWater;

public class volumeOfWater {
    public static void trappedWater(int[] height){
        int n = height.length;
        //creating left max boundary - Array
        int[] leftMaxB = new int[n];
        leftMaxB[0]=height[0];
        for(int i =1 ; i<n; i++){
            leftMaxB[i]=Math.max(leftMaxB[i-1],height[i]);
        }
        // creating right max boundary - array
        int[] rightMaxB = new int[n];
        rightMaxB[n-1]=height[n-1];
        for(int i = n-2; i>=0;i--){
            rightMaxB[i]= Math.max(height[i],rightMaxB[i+1] );
        }
        // calculation for volume of trapped water
        int waterVolume = 0;
        int width =1;
        for(int i=0 ; i<n; i++){
            // finding water level
            int waterlev =Math.min(leftMaxB[i],rightMaxB[i]);
            //finding trapped water
            int trappedWater=(waterlev-height[i])*width;
            //adding total trapped water
            waterVolume +=trappedWater;
        }
        System.out.println(waterVolume);

    }

    public static void main(String[] args) {
        int[] height ={4,2,0,6,3,2,5};
        trappedWater(height);
    }
}


