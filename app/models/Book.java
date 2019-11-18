package models;

import java.util.HashSet;
import java.util.Set;

public class Book 
{
	public Integer id;
	public String title;
	public String author;
	public Integer price;
	
	public Book(Integer id, String title, String author, Integer price) 
	{
		this.id = id;
		this.title = title;
		this.author = author;
		this.price = price;
	}
	
	private static Set<Book> books;
	static {
		books=new HashSet<>();
		books.add(new Book(1,"book1","author1",100));
		books.add(new Book(2,"book2","author2",200));
		
	}
	public static Set<Book> allBooks()
	{
		return books;
	}
	public static Book findById(Integer id)
	{
		for(Book book:books)
		{
			if(id.equals(book.id))
			{
				return book;
			}
		}
		return null;
	}
	public static void add(Book book)
	{
		books.add(book);
	}
	public static boolean remove(Book book)
	{
		return books.remove(book); 
	}
}
