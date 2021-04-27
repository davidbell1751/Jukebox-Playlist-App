package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class ZacBrownBand {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public ZacBrownBand() {
    }
    
    public ArrayList<Song> getZacBrownBandSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Chicken Friend", "Zac Brown Band");             //Create a song
         Song track2 = new Song("Whatever It Is", "Zac Brown Band");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         return albumTracks;                                                    //Return the songs for Zac Brown Band in the form of an ArrayList
    }
}
