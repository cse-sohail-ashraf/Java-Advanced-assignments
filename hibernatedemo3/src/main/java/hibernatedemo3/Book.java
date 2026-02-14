/**
 * 
 */
package hibernatedemo3;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * 
 */
@Entity
@Table(name = "library_books")
public class Book {
	@Id
	@Column(name = "book_id")
	private int bookid;
	@Column(name = "title",nullable = false)
	private String title;
	@Column(name = "author_name",nullable=false)
	private String authorName;
	@Column(name = "genre")
	private String genre;
	@Column(name = "price")
	private double price;
	@Column(name = "available_status")
	private boolean availableStatus;
	@Column(name = "published_year")
	private String publishedYear;
	
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(int bookid, String title, String authorName, String genre, double price, boolean availableStatus,
			String publishedYear) {
		super();
		this.bookid = bookid;
		this.title = title;
		this.authorName = authorName;
		this.genre = genre;
		this.price = price;
		this.availableStatus = availableStatus;
		this.publishedYear = publishedYear;
	}
	public int getBookid() {
		return bookid;
	}
	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthorName() {
		return authorName;
	}
	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isAvailableStatus() {
		return availableStatus;
	}
	public void setAvailableStatus(boolean availableStatus) {
		this.availableStatus = availableStatus;
	}
	public String getPublishedYear() {
		return publishedYear;
	}
	public void setPublishedYear(String publishedYear) {
		this.publishedYear = publishedYear;
	}
	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", title=" + title + ", authorName=" + authorName + ", genre=" + genre
				+ ", price=" + price + ", availableStatus=" + availableStatus + ", publishedYear=" + publishedYear
				+ "]";
	}
}
