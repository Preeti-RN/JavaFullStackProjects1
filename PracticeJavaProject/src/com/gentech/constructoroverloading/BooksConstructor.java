package com.gentech.constructoroverloading;
/*
Book id :4
Book title:C programming language
Book Price :700.0

 */
class Books
{
	Books(int Book_id)
	{
		System.out.println("Book id :"+Book_id);
	}
	Books(String booktitle)
	{
		System.out.println("Book title:"+booktitle);
	}
	Books(double bookprice)
	{
		System.out.println("Book Price :"+bookprice);
	}

}


public class BooksConstructor {

	public static void main(String[] args) {
		Books o1=new Books(4);
		Books o2=new Books("C programming language");
		Books o3=new Books(700.00);	

	}

}
