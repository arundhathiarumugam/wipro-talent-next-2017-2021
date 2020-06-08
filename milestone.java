//Generate series and find Nth element:
import java.io.*;
import  java.util.*;


class GenerateSeriesAndFindNthElement {

	public int seriesN(int input1,int input2,int input3,int input4){
		
		int gap1 = (input2 - input1);
		int gap2 = (input3 - input2);
		int output = input1;
			
		for (int i = 1; i < input4; i++) {
			if (i % 2 == 1)
				output += gap1;
			else
				output += gap2;
			
			System.out.print(output + ", ");
		}
		
		return output;
	}
}

//Find result after alternate add_sub on N:
import java.io.*;
import java.util.*;

class FindResultAfterAlternateAdd_subOnN {
	public int AddSub(int input1,int input2){
	
		int N = input1;
		int result = N;
		int var = 0;
		
		if (input2 == 1) var = 1;
		else var = 0;
		
		for (int i = N - 1, j = 0; i >= 1; i--, j++) {
			if (j % 2 == var) result += i;
			else result -= i;
			System.out.println(result + " ");
		}
		
		return result;
	}
}

//Find password(sttable unstable):
import java.io.*;
import  java.util.*;


class FindPasswordStableUnstable {

	public int findPassword(int input1,int input2,int input3,int input4,int input5){
	
		int sumOfStable = 0;
		int sumOfUnstable = 0;
		
		if (isStable(input1)) sumOfStable += input1;
		else sumOfUnstable += input1;
		
		if (isStable(input2)) sumOfStable += input2;
		else sumOfUnstable += input2;
		
		if (isStable(input3)) sumOfStable += input3;
		else sumOfUnstable += input3;
		
		if (isStable(input4)) sumOfStable += input4;
		else sumOfUnstable += input4;
		
		if (isStable(input5)) sumOfStable += input5;
		else sumOfUnstable += input5;
		
		System.out.println(sumOfStable + " :: " + sumOfUnstable);
		System.out.println("isStable: " + isStable(input1) + isStable(input2) + isStable(input3) + isStable(input4) + isStable(input5));
		
		return sumOfStable - sumOfUnstable;
	}
	
	public static boolean isStable(int num) {
		boolean isStable = true;
		int[] freq = new int[10];
		String numStr = String.valueOf(num);
		
		for (int i = 0; i < numStr.length(); i++) {
			freq[Integer.parseInt(String.valueOf(numStr.charAt(i)))]++;
		}
		
		System.out.println(Arrays.toString(freq));
		
		int firstFreq = 0;
		for (int i = 0; i < 10; i++) {
			if (freq[i] > 0) {
				firstFreq = freq[i];
				break;
			}
		}
		System.out.println("firstFreq: " + firstFreq);
		
		for (int i = 0; i < 10; i++) {
			if (freq[i] != 0 && freq[i] != firstFreq) {
				isStable = false;
				break;
			}
		}
		System.out.println("isStable: " + isStable);
		
		return isStable;
	}
}