package snhu.student.playlists;

import java.util.ArrayList;
import java.util.LinkedList;

import music.artist.*;
import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;

public class JeremyMiller_Playlist {
	
	public LinkedList<PlayableSong> StudentPlaylist(){
		
		LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
		ArrayList<Song> beatlesTracks = new ArrayList<Song>();
	    TheBeatles theBeatlesBand = new TheBeatles();
		
	    beatlesTracks = theBeatlesBand.getBeatlesSongs();
		
		playlist.add(beatlesTracks.get(0));
		playlist.add(beatlesTracks.get(1));
		
		
	    ImagineDragons imagineDragonsBand = new ImagineDragons();
		ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
	    imagineDragonsTracks = imagineDragonsBand.getImagineDragonsSongs();
		
		playlist.add(imagineDragonsTracks.get(0));
		playlist.add(imagineDragonsTracks.get(1));
		playlist.add(imagineDragonsTracks.get(2));
		
		TwentyOnePilots twentyOnePilotsBand = new TwentyOnePilots();
		ArrayList<Song> twentyOnePilotsTracks = new ArrayList<Song>();
		twentyOnePilotsTracks = twentyOnePilotsBand.getTwentyOnePilotsSongs();
		
		playlist.add(twentyOnePilotsTracks.get(0));
		playlist.add(twentyOnePilotsTracks.get(1));
		playlist.add(twentyOnePilotsTracks.get(2));
		
		TheWombats theWombatsBand = new TheWombats();
		ArrayList<Song> theWombatsTracks = new ArrayList<Song>();
		theWombatsTracks = theWombatsBand.getTheWombatsSongs();
		
		playlist.add(theWombatsTracks.get(0));
		playlist.add(theWombatsTracks.get(1));
		playlist.add(theWombatsTracks.get(2));
		
		ZacBrownBand zacBrownBand = new ZacBrownBand();
		ArrayList<Song> zacBrownBandTracks = new ArrayList<Song>();
		zacBrownBandTracks = zacBrownBand.getZacBrownBandSongs();
		
		playlist.add(zacBrownBandTracks.get(0));
		playlist.add(zacBrownBandTracks.get(1));
		
		TheLindseyStirling theLindseyStirling = new TheLindseyStirling();
		ArrayList<Song> theLindseyStirlingTracks = new ArrayList<Song>();
		theLindseyStirlingTracks = theLindseyStirling.getLindseyStirlingSongs();
		
		playlist.add(theLindseyStirlingTracks.get(0));
		playlist.add(theLindseyStirlingTracks.get(1));
		
	    return playlist;
		}

}
