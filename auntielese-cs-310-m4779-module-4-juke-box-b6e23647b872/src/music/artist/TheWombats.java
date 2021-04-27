package music.artist;

import java.util.ArrayList;

import snhu.jukebox.playlist.Song;

public class TheWombats {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public TheWombats() {
    }
    
    public ArrayList<Song> getTheWombatsSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("Turn", "The Wombats");             //Create a song
         Song track2 = new Song("Lemon to a Knife Fight", "The Wombats");         //Create another song
         Song track3 = new Song("Give Me a Try", "The Wombats");
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Beatles
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Beatles 
         this.albumTracks.add(track3);
         return albumTracks;                                                    //Return the songs for the Beatles in the form of an ArrayList
    }

}
