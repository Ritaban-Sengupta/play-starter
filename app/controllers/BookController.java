package controllers;


import views.html.*;
import java.util.Set;

import models.Book;
import play.mvc.Controller;
import play.mvc.Result;

public class BookController extends Controller 
{
	//to view all books
	public Result index()
	{
		Set<Book> books=Book.allBooks();
		return ok(bookview.render(books));
	}
//to create a book
	public Result create()
	{
		return null;
	}
	
//to save a book
	public Result save()
	{
		return null;
	}
	//edit a book
	public Result edit(Integer id)
	{
		return null;
	}
	//update edited book
	public Result update()
	{
		return null;
	}
	//deleting book
	public Result delete(Integer id)
	{
		return null;
	}
	//fo book details
	public Result show(Integer id)
	{
		return null; 	 
	}
}

