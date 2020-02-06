
TC:O(n)
SC:O(1)

Approach : Instead of doing backtracking and finding all combinations and then taking products and its sum, we use the mathematical 
formulat to find the answer in O(n) time and O(1) space.


public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		int [] arr = new int[]{1,2,3};
		
		int setval = 1;
		
		for(int i=0; i< arr.length;i++){
		    setval *= (1+arr[i]);
		}
		System.out.println(setval-1);
	}
	
}
