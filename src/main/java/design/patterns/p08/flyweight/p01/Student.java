package design.patterns.p08.flyweight.p01;

import java.util.ArrayList;
import java.util.List;

public class Student {

	private static List<Book> books = new ArrayList<Book>();

	private static Library library;

	private static void borrow(String bookName) {
		books.add(library.lend(bookName));
	}

	public static void main(String[] args) {
		library = Library.getInstance();
		borrow("钢铁是怎样炼成的");
		borrow("傲慢与偏见");
		borrow("红楼梦");
		System.out.println("重读后两本");
		borrow("傲慢与偏见");
		borrow("红楼梦");
		for (Book book : books) {
			book.borrow();
		}
		// 输出学生一共借了多少本书
		System.out.println("学生一共借了" + books.size() + "本书");
		// 输出图书馆一共借出多少本书
		System.out.println("图书馆实际借出" + library.getTotalBooks() + "本书");
	}

}
