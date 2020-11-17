package Demo2;

abstract class BookAll {
	int overDays;
	String bookName;
	public abstract double compensation(int date);
}

class TeachingBook extends BookAll {
	final int deadLine = 30;
	TeachingBook(String bookName) {
		this.bookName = bookName;
	}
	public double compensation(int overDays) {
		if(overDays > deadLine) {
			return (overDays-deadLine)*0.1;
		} else {
			return 0;
		}
	}
}

class LiteratureBook extends BookAll {
	final int deadLine = 40;
	LiteratureBook(String bookName) {
		this.bookName = bookName;
	}
	public double compensation(int overDays) {
		if(overDays > deadLine) {
			return (overDays-deadLine)*0.2;
		} else {
			return 0;
		}
	}
}

class ScienceBook extends BookAll {
	final int deadLine = 20;
	ScienceBook(String bookName) {
		this.bookName = bookName;
	}
	public double compensation(int overDays) {
		if(overDays > deadLine) {
			return (overDays-deadLine)*0.15;
		} else {
			return 0;
		}
	}
}

class Reader {
	BookAll ba;
	String rName = null;
	int bDate = 0, rDate = 0, date=0;
	Reader(String rName, BookAll ba) {
		this.rName = rName;
		this.ba = ba;
	}
	public void borrowDate(int bDate) {
		this.bDate = bDate;
	}
	public void returnDate(int rDate) {
		this.rDate = rDate;
	}
	public int borrowTime() {
		return (rDate/10000-bDate/10000)*365+(rDate%10000/100-bDate%10000/100)*30+(rDate%10000%100-bDate%10000%100);
	}
	public double compensation2(int date) {
		return ba.compensation(date);
	}
}

public class TestDemo2 {
	public static void main(String[] args) {
		BookAll tb = new TeachingBook("1");
		BookAll lb = new LiteratureBook("2");
		BookAll sb = new ScienceBook("3");
		Reader r1 = new Reader("r1", tb);
		Reader r2 = new Reader("r2", lb);
		Reader r3 = new Reader("r3", sb);
		r1.borrowDate(20200202);
		r1.returnDate(20200506);
		r2.borrowDate(20200202);
		r2.returnDate(20200506);
		r3.borrowDate(20200202);
		r3.returnDate(20200506);
		System.out.println("r1 应该赔偿价格为："+r1.compensation2(r1.borrowTime())+"元");
		System.out.println("r2 应该赔偿价格为："+r2.compensation2(r2.borrowTime())+"元");
		System.out.println("r3 应该赔偿价格为："+r3.compensation2(r3.borrowTime())+"元");
	}
}