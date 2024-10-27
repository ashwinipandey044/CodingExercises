package StreamApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FileroutEvenUsingStreamApi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(4,6,9,7,7,3,9,2,1,5);
		List<Integer> ans=list.stream().filter(i->i%2==0).collect(Collectors.toList());
		System.out.println(ans);

	}

}
