// MA314 LT2015 Homework 5 
/*
 * Ilham MA314 Class 2 Exercise 5
 * Used the code from the notes
 */
public class Quicksort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        int[] a = new int[]{13, 19, 9, 5, 12, 8, 7, 4, 11, 2, 6, 10};
        outArray(a, "\nBefore Quicksort:");
        quickSort(a, 0, a.length - 1);
        outArray(a, "\nAfter Quicksort");

	}

    public static void outArray(int[] a, String info)
    {
        System.out.println(info);
        for (int i=0; i < a.length; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }
    
    public static int[] quickSort(int[] a, int p, int r)
    {
    	if (p < r)
    	{
    		int q = partition(a, p, r);
    		quickSort(a, p, q -1);
    		quickSort(a, q+1, r);
    	}
    	return a;
    }
    
    public static int partition(int[] a, int p, int r)
    {	
    	int temp;
    	int pivot = a[r]; 
    	int i = p - 1;
    	for (int j = p; j < r; j++)
    	{
    		if (a[j] <= pivot)
    		{
    			i++;
    			// exchange a[i] and a[j]
    			temp = a[i]; 
    			a[i] = a[j];
    			a[j] = temp;
    		}
    	}
    	i++;
    	// exchange a[i] and a[r]
    	temp = a[i]; 
    	a[i] = a[r];
    	a[r] = temp;
    	return i;
    }
}
