import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

public class HashSetTest {
	public static void main(String[] args) {
	
		
		//data point of view they are duplicate
		//but the hashCode point of view they are unique, due to unique memory address
		
		//110
		Book b1 = new Book(101,"Java 1.5","James Gosling",850.0f,1,1000); //hashcode is unique
		
		Book b6 = b1; // is the hashcode same of b1??
		
		//150
		Book b2 = new Book(101,"Java 1.8","James Gosling",850.0f,1,1000); //hashcode is unique
		
		//200
		Book b3 = new Book(101,"Java 11","James Gosling",950.0f,3,1500); //hashcode is unique
		
		//250
		Book b4 = new Book(101,"Java 14","K & B",750.0f,1,1250); //hashcode is unique
		
		//300
		Book b5 = new Book(101,"Java 19","Patrick N",650.0f,1,1230); //hashcode is unique
		
		HashSet<Book> bookShelf = new HashSet<Book>();//the books added/retrieved
		//in/from the shelf are not in a particular order | INORDER / OUTORDER are different
		
		System.out.println("Adding 1st book : "+b1.hashCode());
		bookShelf.add(b1);
		
		System.out.println("Adding 2nd book : "+b2.hashCode());
		bookShelf.add(b2);
		
		System.out.println("Adding 3rd book : "+b3.hashCode());	
		bookShelf.add(b3);
		
		System.out.println("Adding 4th book : "+b4.hashCode());		
		bookShelf.add(b4);
		
		System.out.println("Adding 5th book : "+b5.hashCode());
		bookShelf.add(b5);
		
		System.out.println("Adding b6 book : "+b6.hashCode());
		bookShelf.add(b6);
		
		Book b7 = null;
		
		System.out.println("Adding b7 book");
		
		bookShelf.add(b7);
		
		
		Book b8 = null;
		
		System.out.println("Adding b8 book");
		
		bookShelf.add(b8);
		
		System.out.println("Books are added....");
		
		Iterator<Book> bookIterator = bookShelf.iterator();
		
		while(bookIterator.hasNext()) {
			Book theBook = bookIterator.next();
			System.out.println("Book : "+theBook);
			
		}
		
		
	}
}

class Book
{
	int bookNumber;
	String bookTitle;
	String bookAuthor;
	float bookPrice;
	int edition;
	int numberOfPages;
	
	
	public Book(int bookNumber, String bookTitle, String bookAuthor, float bookPrice, int edition, int numberOfPages) {
		super();
		this.bookNumber = bookNumber;
		this.bookTitle = bookTitle;
		this.bookAuthor = bookAuthor;
		this.bookPrice = bookPrice;
		this.edition = edition;
		this.numberOfPages = numberOfPages;
	}
	@Override
	public String toString() {
		return "Book [bookNumber=" + bookNumber + ", bookTitle=" + bookTitle + ", bookAuthor=" + bookAuthor
				+ ", bookPrice=" + bookPrice + ", edition=" + edition + ", numberOfPages=" + numberOfPages + "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + bookNumber;
		result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Book other = (Book) obj;
		if (bookNumber != other.bookNumber)
			return false;
		
		if (bookTitle == null) {
			if (other.bookTitle != null)
				return false;
		} else if (!bookTitle.equals(other.bookTitle))
			return false;
		
		return true;
	}
	
	//it was taking method from java.lang.Object class
	
	
	
	
	

}




/*


*/