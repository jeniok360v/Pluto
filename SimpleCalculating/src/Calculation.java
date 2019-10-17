import java.util.Scanner;


public class Calculation {

	public static void main(String[] args) {
		
		}
		
		for(int i=2;i<max;i++) {
			if (primeNumbers[i]) {
				for(int j=2*i;j<n;j=j+i)
					primeNumbers[j] = false;
			}
		}
		
		for(int i=2;i<n;i++)
			if (primeNumbers[i])
				System.out.println(i);

	}
	
    // Returns floor of square root of x 
    static int floorSqrt(int x) 
    { 
        if (x == 0 || x == 1) 
            return x; 
        int i = 1, result = 1; 
        while (result <= x) { 
            i++; 
            result = i * i; 
        } 
        return i - 1; 
    } 

}
