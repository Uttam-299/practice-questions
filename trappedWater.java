public class trappedWater {
    public static int trappedwater(int height[]){
        int n = height.length-1;
        //left max boundary - left
        int leftmax []= new int[height.length];
             leftmax[0] = height[0];
            for( int i=1 ;i<leftmax.length ;i++){
             leftmax[i] =Math.min(height[i] ,leftmax[i-1]);
            }
        // Right max boundary - Right
        int rightmax[] = new int[height.length];
        rightmax[height.length-1] = height[height.length-1];
        for(int i =n-2; i>=0 ;i--){
            rightmax[i] = Math.min(height[i], rightmax[i+1]);
        }
        int  totaltrappedwater = 0;
        // loop 
        for(int i=0 ;i<height.length ;i++){
        // water level
            int waterlevel = Math.min(leftmax[i] , rightmax[i]);
            totaltrappedwater += height[i] - waterlevel ;  

        }
        return totaltrappedwater;
        
    }
    public static void main (String args[]){
        int height[] = {4,5,9,5,2,0,8,4,2,3,0,6};

        System.out.println("Total trapped water is "+trappedwater(height));
    }
    
}
