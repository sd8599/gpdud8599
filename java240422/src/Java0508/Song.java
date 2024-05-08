package Java0508;

	public class Song{
		String title;
		String artist;		
		int year;
		String country;		
		
	public Song(int year,String country,String artist,String title) {
		this.title = title;
		this.artist = artist;
		this.year = year;
		this.country = country;
	}
	public void show() {
		System.out.println(year+"년 "+country+"의 "+artist+"가 부른 "+title);
	}
	
	public static void main(String[] args) {
		Song mySong = new Song(1978,"스웨덴국적","ABBA","Dancing Queen");
		mySong.show();
}
}