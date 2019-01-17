package telran.playlist.dao;


import telran.playlist.data.Song;

public class Playlist {
	private Song[]songs;
	
	private int size;
	
	public Playlist (int capasity) {
		songs = new Song[capasity];
		size=0;
		
	}
	 
	public int getSize() {
		 return size;
	 }

	public boolean addSong (Song song) {
		if(size<songs.length) {
			songs[size]=song;
			size ++;
			return true;
		}
		return false;
	}
	
	public boolean removeSong(Song song) {
		System.out.println("Current size is "+ size);
		for (int i = 0; i < size; i++) {
			if(songs[i].equals(song)) {
				songs[i]=songs[size-1];
				size--;
				System.out.println("Size after "+size);
				System.out.println("The Song <<"+ song +">>was deleted" );
				return true;
			}
		}
		return false;
	}
	
	public int searchSong(Song song) {
		for (int i = 0; i < size; i++) {
			if(songs[i].equals(song)) {
				System.out.println(song);
				return i;
			}
			
		}
		return -1;
	}
	
	
	
	public void display() {
		System.out.println("Playlist # ");
		for (int i = 0; i < size; i++) {
			System.out.println(songs[i]);
			
		}
	}
	
	
}