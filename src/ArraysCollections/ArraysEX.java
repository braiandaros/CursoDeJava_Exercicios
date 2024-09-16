package ArraysCollections;

import java.util.Arrays;
import java.util.Iterator;

public class ArraysEX {
	public static void main(String[] args) {
		double notasAlunoA[] = new double [4];
		notasAlunoA[0] = 7.9;
		notasAlunoA[1] = 8;
		notasAlunoA[2] = 6.7;
		
		
		System.out.println(Arrays.toString(notasAlunoA));
		
		double totalalunoA = 0;
		for(int i = 0; i < notasAlunoA.length; i++) {
			totalalunoA += notasAlunoA[i];
			//System.out.println(total);
		}
		System.out.println(totalalunoA / notasAlunoA.length);
		
		
		double notasAlunoB[] = {6.9, 8.9, 5.5, 10};
		double totalalunoB = 0;
		for (int i = 0; i < notasAlunoB.length; i++) {
			totalalunoB += notasAlunoB[i];
		}
		System.out.println(totalalunoB / notasAlunoB.length);
	}
}
