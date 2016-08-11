package demo.entities;

public class Book {
	private String title;

	public Book(String title) {
		this.title = title;
	}

	public Book() {}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
}