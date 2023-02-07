package array;

public class SelectionSort {

	public static void main(String[] args) {
		int[] ar = {32, 40, 25, 78, 56};
		
		// 소트 전
		for(int i=0; i<ar.length; i++) {
			System.out.print(String.format("%4d", ar[i]));	// 정수형, 네 자리 (tab 기능 대신 사용)
		}
		System.out.println();
		
		// 정렬
		// 오름차순(ascending)
		// 내림차순(descending)
		int temp;	// 빈 컵 하나 생성
		for(int i=0; i<ar.length-1; i++) {	
			for(int j=i+1; j<ar.length; j++) {
				if(ar[i] > ar[j]) {		// > 오름차순, < 내림차순 
					temp = ar[i];	
					ar[i] = ar[j];	
					ar[j] = temp;
				}
				
			}	// for j
		}	// for i
		
		// 소트 후
		for(int i=0; i<ar.length; i++) {
			System.out.println(String.format("%4d", ar[i]));
		}
		System.out.println();
	}

}
