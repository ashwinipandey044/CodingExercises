package StreamApi;

import java.util.Arrays;
import java.util.List;

public class SumOfAllElementsUsingStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(4,6,9,7,7,3,9,2,1,5);
	int ans=list.stream().filter(i->i%2==1).reduce(0,(sum,i)->sum+i);
	System.out.println(ans);
	}

}
