package com.gentech.constructoroverloading;
/*
Student_id :73
StudentName:Preeti
marks are:89.0

 */
class Students
{
	Students(int Student_id)
	{
		System.out.println("Student_id :"+Student_id);
	}
	Students(String StudentName)
	{
		System.out.println("StudentName:"+StudentName);
	}
	Students(double marks)
	{
		System.out.println("marks are:"+marks);
	}

}

public class StudentsConstructor {

	public static void main(String[] args) {
		Students o1=new Students(73);
		Students o2=new Students("Preeti");
		Students o3=new Students(89.00);	

	}

}
