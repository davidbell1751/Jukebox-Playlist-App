package music.artist;

import snhu.jukebox.playlist.Song;
import java.util.ArrayList;

public class Metallica {
	
	ArrayList<Song> albumTracks;
    String albumTitle;
    
    public Metallica() {
    }
    
    public ArrayList<Song> getMetallicaSongs() {
    	
    	 albumTracks = new ArrayList<Song>();                                   //Instantiate the album so we can populate it below
    	 Song track1 = new Song("For Whom the Bell Tolls", "Metallica");        //Added "For Whom the Bell Tolls" by Metallica
         Song track2 = new Song("Fade to Black", "Metallica");         			//Added "Fade to Black" by Metallica
         Song track3 = new Song("Ride the Lightning", "Metallica");         	//Added "Ride the Lightning" by Metallica
         this.albumTracks.add(track1);                                          //Add the first song to song list for the Metallica
         this.albumTracks.add(track2);                                          //Add the second song to song list for the Metallica 
         this.albumTracks.add(track3);                                          //Add the third song to song list for the Metallica 
         return albumTracks;                                                    //Return the songs for the Metallica in the form of an ArrayList
    }
}
