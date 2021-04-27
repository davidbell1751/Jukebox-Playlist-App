package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class EdwardMenser_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> zacBrownBandTracks = new ArrayList<Song>();
    ZacBrownBand zacBrownBand = new ZacBrownBand();
	
    zacBrownBandTracks = zacBrownBand.getZacBrownBandSongs();
	
	playlist.add(zacBrownBandTracks.get(0));
	playlist.add(zacBrownBandTracks.get(1));
	
	
    return playlist;
	}
}







