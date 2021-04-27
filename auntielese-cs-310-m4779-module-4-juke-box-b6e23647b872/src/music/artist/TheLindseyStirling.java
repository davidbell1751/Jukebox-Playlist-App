package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class TheLindseyStirling {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheLindseyStirling() {
    }
    
    public ArrayList<Song> getLindseyStirlingSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Crystallize", "Lindsey Stirling");             //Create a song
         Song track2 = new Song("LOTR Ballad", "Lindsey Stirling");         //Create another song
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Lindsey Stirling
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Lindsey Stirling 
         return albumTracks;                                                    //Return the songs for the Lindsey Stirling in the form of an ArrayList
    }
}
