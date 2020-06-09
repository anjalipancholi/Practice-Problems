package array;

public class MaximumDistanceToClosestPerson {
    public int maxDistToClosest(int[] seats) {

        int i,c=0,max=0,start=0,end=0,temp;
        for(i=0;i<seats.length;i++)
        {
            if(seats[i]==0)
            {
                c++;
                if(c==1)
                    start=i;
                end=i;
            }
            else
            {
                if((start==0) || (end==seats.length-1))
                    temp= end-start+1;
                else
                    temp= (end-start+2)/2;
                if(temp>max)
                    max=temp;
                c=0;
            }
        }
        if((start==0) || (end==seats.length-1))
            temp= end-start+1;
        else
            temp= (end-start+2)/2;
        if(temp>max)
            max=temp;

        return max;
    }
    public static void main(String[] args) {
        new MaximumDistanceToClosestPerson().maxDistToClosest(new int[]{1,0,1,0,0,0,1});
    }
}


