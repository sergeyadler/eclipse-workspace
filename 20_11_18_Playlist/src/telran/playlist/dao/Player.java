package telran.playlist.dao;

import telran.playlist.data.Song;

public class Player {
	
	private Playlist[] playlists;
	
	int size ;
	


	public Player(int capasity) {
		playlists= new Playlist[capasity];
		size=0;
	}
	public int getSize() {
		return size;
	}
	
	public boolean addPlaylist(Playlist playlist) {
		if(size<playlists.length) {
			playlists[size]=playlist;
			size++;
			return true;
		}
		return false;
	}
	
	public boolean removePlaylist(Playlist playlist) {
		System.out.println("Currensy size is " + size);
		for (int i = 0; i < size; i++) {
			if(playlists[i].equals(playlist)) {
				playlists[i]=playlists[size-1];
				size--;
				System.out.println("Currensy size after is "+ size);				
				return true;
			}
			
		}
		return false;
	}
	
	
	public void Play(Song song) {
		System.out.println("Song is playng " + song);
	}
	public void Stop(Song song) {
		System.out.println("Song is Stop "+ song);
		
	}
	public void Pause(Song song) {
		System.out.println("Pause "+ song);
	}
}
