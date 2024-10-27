package StreamApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class SecondHighestUsingStrem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list=Arrays.asList(4,6,9,7,7,3,9,2,1,5);
		Optional<Integer> ns=  list.stream().sorted(Collections.reverseOrder()).
								distinct().limit(2).skip(1).findFirst();
		System.out.println(ns.get());
	}

}
