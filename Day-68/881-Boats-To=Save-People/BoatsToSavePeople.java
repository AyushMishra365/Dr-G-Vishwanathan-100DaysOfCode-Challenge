import java.util.Arrays;
public class BoatsToSavePeople {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int count=0;
        int left=0;
        //we cannot take right=1. and then move adn chec kadjacent pairs because the problme never mentions this that only adjacent pairs can be 
        //paired up together in one boat; for eg: it can be the heaviest and th elightest weighted peoples also.
        int right=people.length-1;
        while(left<right){ 
            if(people[left]+people[right]<=limit){
                count++;
                left++;
                right--;
            }
            else{
                count++;
                right--;
            }
        }
        if (left == right) {
            count++;
        }
        return count;
    }
}


