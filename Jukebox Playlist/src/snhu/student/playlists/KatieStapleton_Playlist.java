package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class KatieStapleton_Playlist {
    
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
	
	// added tracks of 3 artists to playlist
	
    Disturbed disturbedBand = new Disturbed();
	ArrayList<Song> disturbedTracks = new ArrayList<Song>();
    disturbedTracks = disturbedBand.getDisturbedSongs();
	
	playlist.add(disturbedTracks.get(0));
	playlist.add(disturbedTracks.get(1));
	playlist.add(disturbedTracks.get(2));

	
    Shinedown shinedownBand = new Shinedown();
	ArrayList<Song> shinedownTracks = new ArrayList<Song>();
    shinedownTracks = shinedownBand.getShinedownSongs();
	
	playlist.add(shinedownTracks.get(0));
	playlist.add(shinedownTracks.get(1));
	playlist.add(shinedownTracks.get(2));
	
	
    NineInchNails nineInchNailsBand = new NineInchNails();
	ArrayList<Song> nineInchNailsTracks = new ArrayList<Song>();
    nineInchNailsTracks = nineInchNailsBand.getNINSongs();
	
	playlist.add(nineInchNailsTracks.get(0));
	playlist.add(nineInchNailsTracks.get(1));
	playlist.add(nineInchNailsTracks.get(2));
	
	
    return playlist;
	}
}
