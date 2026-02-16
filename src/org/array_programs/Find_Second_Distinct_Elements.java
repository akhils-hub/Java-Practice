package org.array_programs;

import java.util.LinkedHashMap;

public class Find_Second_Distinct_Elements {
	public static Integer findSecondDistinctElement(int[] a) {
		LinkedHashMap<Integer,Integer> map = new LinkedHashMap<>();
		
		for(int i=0;i<a.length;i++) {
			if(!map.containsKey(a[i])) {
				map.put(a[i], 1);
			}
			if(map.size() == 2) {
				return a[i];
			}
		}
		return null;
	}

	public static void main(String[] args) {
		int[] a = {1,2,3,2,3,4,4};
		
		Integer findSecondDistinctElement = findSecondDistinctElement(a);
		if(findSecondDistinctElement != null) {
			System.out.println("Second Distinct Element: " + findSecondDistinctElement);
		}else {
			System.out.println("There is no Second Distinct Element!");
		}
	}
}

/***
  public static void main(String[] args) {
        int[] a = {1, 2, 3, 2, 3, 4, 4};
        
        // LinkedHashSet removes duplicates and keeps order
        Set<Integer> distinctElements = new LinkedHashSet<>();
        for (int num : a) {
            distinctElements.add(num);
        }

        // Convert to list to access by index
        List<Integer> list = new ArrayList<>(distinctElements);
        
        if (list.size() >= 2) {
            System.out.println("Second distinct element: " + list.get(1));
        } else {
            System.out.println("Not enough distinct elements.");
        }
    }
 */
