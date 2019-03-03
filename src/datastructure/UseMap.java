package datastructure;

import java.util.*;


public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */

		List<String> AmirInfo = new ArrayList<String>();

		AmirInfo.add("05/09/1997");
		AmirInfo.add("(646) 666-0786");
		AmirInfo.add("NY, Astoria");

		List<String> FahimInfo = new ArrayList<String>();

		FahimInfo.add("01/26/1997");
		FahimInfo.add("(646) 911-1119");
		FahimInfo.add("NY, Harlem");

		Map<String, List<String>> map = new HashMap<String, List<String>>();
		map.put("Amir", AmirInfo);
		map.put("Fahim", FahimInfo);


		for (Map.Entry<String, List<String>> Info : map.entrySet()) {
			System.out.println(Info.getKey() + " " + Info.getValue());

		}
	}

}



