package hust.soict.globalict.aims.media;

public class Disc extends Media implements Playable {
	private int length;
	private String director;
	public int getLength() {
		return length;
	}
	public String getDirector() {
		return director;
	}
	public Disc(String title, String category, String director, int length, float cost) {
		super(title, category, cost);
		this.length=length;
		this.director=director;
	}
	public String toString() {
		String res = String.format("%d. DVD - %s - %s - %s - %d : %f $",this.getId(),this.getTitle(),this.getCategory(),this.getDirector(),this.getLength(),this.getCost());
		return res;
	}
	public void play() {
		
	}

}