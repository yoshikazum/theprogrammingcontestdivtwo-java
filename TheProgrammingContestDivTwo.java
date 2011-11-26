import java.util.Arrays;

public class TheProgrammingContestDivTwo {

	public int[] find(int T, int[] requiredTime) {
	  System.out.println("*** start program T:"+T);
	  int count = 0;
	  int penalty = 0;
	  int pastTime = 0;
	  Arrays.sort(requiredTime);
	  for (int i = 0; i < requiredTime.length; i++) {
	    int solvedTime = requiredTime[i];
      pastTime += requiredTime[i];
	    if(solvedTime <= T && pastTime <= T){
	      count++;
	      penalty += pastTime;
        System.out.println("requiredTime:"+ requiredTime[i]+ " pastTime:"+ pastTime);
	    }
    }
	  int [] result = {count, penalty};
	  return result;
	}

}
