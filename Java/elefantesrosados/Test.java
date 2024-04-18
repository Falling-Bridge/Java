package Java.elefantesrosados;

public class Test {
    
	public static void main(String args[])  
	{  
		int[] arr=getArray();           
		for (int i = 0; i < arr.length; i++) 
			System.out.print( arr[i]+ " ");     
	}  
	public static int[] getArray()  
	{  
		int[] arr={17,18,19,20,21};   
		return arr;  
	}  
}  