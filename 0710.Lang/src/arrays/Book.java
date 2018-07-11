package arrays;

//public class Book implements Comparable {
public class Book {

	// 저장하고자 하는 항목
	private String title;
	private String author;
	private String pubulisher;
	private String pubdate;
	private int price;
	private float score;

	// 접근자 메소드
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPubdate() {
		return pubdate;
	}

	public void setPubdate(String pubdate) {
		this.pubdate = pubdate;
	}

	public String getPubulisher() {
		return pubulisher;
	}

	public void setPubulisher(String pubulisher) {
		this.pubulisher = pubulisher;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public float getScore() {
		return score;
	}

	public void setScore(float Score) {
		this.score = Score;
	}

	// 확인용 출력문
	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", pubdate=" + pubdate + ", pubulisher=" + pubulisher
				+ ", price=" + price + ", score=" + score + "]";
	}

	// 크기비교를 하는 메소드 - 오름차순
//	@Override
//	public int compareTo(Object o) {
//		Book other = (Book) o;
//		return this.author.compareTo(other.author);
//		//return this.price - other.price; //간단하게 하는 방법. 같으면 0이고 양수 음수 나오는 것은 같음
//		//return (this.price - other.price) * -1; 내림차순
//		//return (other.price - this.price); //내림차순
////		if (this.price > other.price) {
////			return 1;
////		} else if (this.price == other.price) {
////			return 0;
////		} else {
////			return -1;
////		}}
	}

