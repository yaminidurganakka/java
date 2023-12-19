public class EvenOddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		       int[] arr={2,3,4,5,6};
		       System.out.println("even numbers are:");
		       for(int i=0;i<=arr.length-1;i++)
		      
		       
		       {
		       if(arr[i]%2==0)
		      
		       
		       System.out.println(arr[i]);
		       
		           
		       }
		       {
		           System.out.println("odd numbers are:");
		       
		       }
		       for(int i=0;i<=arr.length-1;i++)
		       {
		       if(arr[i]%2==1)
		       
		       System.out.println(arr[i]);
		      }
		}
}