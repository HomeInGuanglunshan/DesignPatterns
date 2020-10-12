package design.patterns.p08.flyweight.p01;

import java.util.HashMap;
import java.util.Map;

public class Library {

	// 图书馆维护一个图书列表
	private Map<String, Book> bookPool = new HashMap<>();

	private static Library factory = new Library();

	public static Library getInstance() {
		return factory;
	}

	public Book lend(String bookName) {
		Book book = null;
		// 如果书架有，直接借出
		if (bookPool.containsKey(bookName)) {
			book = bookPool.get(bookName);
		}
		// 如果书架没有，那就调进来一本新书
		else {
			book = new ConcreteBook(bookName);
			bookPool.put(bookName, book);
		}
		return book;
	}

	public int getTotalBooks() {
		return bookPool.size();
	}

}
