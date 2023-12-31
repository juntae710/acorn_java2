package java2prj1.interfaceEx.myarrys;

import java.util.ArrayList;
import java.util.Comparator;

interface MyComparable<T> {
	public int compareTO(T other); // 기준이 크면 양수, 작으면 음수, 같으면 0
}

public class MyArrays {

	public static void sort(Object[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				MyComparable m = (MyComparable) arr[i];
				if (m.compareTO(arr[j]) > 0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] = tmp;
				}

			}
		}
	}
	
	//interface Comparator{
	//}
	public static void sort(Object[] arr, Comparator c) {
		for(int i=0; i<arr.length-1; i++ ) {
			for(int j=i+1; j<arr.length; j++ ) {
				if(c.compare(arr[i],arr[j] )>0) {
					Object tmp;
					tmp = arr[i];
					arr[i] = arr[j];
					arr[j] =tmp;
				}
			}
		}

	}

}