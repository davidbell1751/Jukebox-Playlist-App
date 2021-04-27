package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class DarylMiller_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> metallicaTracks = new ArrayList<Song>();
    Metallica metallica = new Metallica();
	
    metallicaTracks = metallica.getMetallicaSongs();
	
	playlist.add(metallicaTracks.get(0));
	playlist.add(metallicaTracks.get(1));
	playlist.add(metallicaTracks.get(2));
	
	
    return playlist;
	}
}