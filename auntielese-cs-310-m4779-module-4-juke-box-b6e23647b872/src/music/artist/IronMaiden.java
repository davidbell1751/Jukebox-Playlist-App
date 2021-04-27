package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class IronMaiden {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public IronMaiden() {
    }
    
    public ArrayList<Song> getBeatlesSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Fear of the Dark", "Iron Maiden");        		//Added "Fear of the Dark" by Iron Maiden
         Song track2 = new Song("Trooper", "Iron Maiden");         				//Added "Trooper" by Iron Maiden
         this.albumTracks.add(track1);                                          //Add the first song to song list for the IronMaiden
         this.albumTracks.add(track2);                                          //Add the second song to song list for the IronMaiden 
         return albumTracks;                                                    //Return the songs for the IronMaiden in the form of an ArrayList
    }
}
