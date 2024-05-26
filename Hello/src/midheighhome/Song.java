package midheighhome;

public class Song {
	String title;
	String artist;
	String year;
	String country;
	
	public Song(String title, String artist, String year, String country) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년 "+country+"의 "+artist+"가 부른 "+title);
	}

	public static void main(String[] args) {
		Song song = new Song("Dancing Queen","ABBA","1978","스웨덴국적");
		song.show();
	}
}
