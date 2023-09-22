package com.gentech.constuctorchaining;
import java.util.HashSet;
import java.util.Set;
/*
 Missing number: 2
Missing number: 4
 */
class missnum
{
	missnum(int a[])
	{
		int startrange=1;
		int endrange=10;
		Set<Integer> x = new HashSet<>();
		for (int num:a) 
		{
            x.add(num);
        }
		for(int i=startrange;i<endrange;i++)
		{
			if (!x.contains(i)) {
                System.out.println("Missing number: "+i);
            }
		}
			
	}
}
public class MissingNumber {

	public static void main(String[] args) {
		
    int y[]= {1,3,6,7,8,9,};
    missnum obj=new missnum(y);
	}

}
