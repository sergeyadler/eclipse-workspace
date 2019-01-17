package telran.playlist.controller;

import telran.playlist.dao.Player;
import telran.playlist.dao.Playlist;
import telran.playlist.data.*;

public class PlayApp {

	public static void main(String[] args) {
	Song s1= new Song("Halilujah", "Rufus Wainwright", "pop");
	Song s2= new Song("Viva", "Kirkorov", "pop");
	Song s3= new Song("La Culpa", "Fonsi", "Pop");
	Song s4=new Song("Moonlight sonata", "Bethoven", "classic");
	Song s5 = new Song("Havanagila", "Juden", "Folk");
	Song s6 = new Song("Girls like you", "Maroon5 Adam Levine", "alernativ");
	
	Playlist p1 = new Playlist(10);
	p1.addSong(s1);
	p1.addSong(s2);
	p1.addSong(s3);
	p1.addSong(s4);
	p1.addSong(s5);
	
	
	p1.display();
	
	p1.removeSong(s2);
	p1.display();
	p1.addSong(s6);
	
	Player pl1= new Player(10);
	pl1.addPlaylist(p1);
	System.out.println("*****************************************************");
	pl1.Play(s5);
	System.out.println("*****************************************************");
	pl1.Pause(s5);
	System.out.println("*****************************************************");
	pl1.Stop(s5);
	System.out.println("*****************************************************");
	System.out.println(p1.searchSong(s4));
	System.out.println("*****************************************************");
	
	
	}

}
