package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class Muckley_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> abrTracks = new ArrayList<Song>();
    AugustBurnsRed augustBurnsRed = new AugustBurnsRed();
	
    abrTracks = augustBurnsRed.getABRSongs();
	
	playlist.add(abrTracks.get(0));
	playlist.add(abrTracks.get(1));
	
	
    Counterparts counterpartsBand = new Counterparts();
	ArrayList<Song> counterpartsTracks = new ArrayList<Song>();
    counterpartsTracks = counterpartsBand.getCounterpartsSongs();
	
	playlist.add(counterpartsTracks.get(0));
	playlist.add(counterpartsTracks.get(1));
	playlist.add(counterpartsTracks.get(2));
	
    return playlist;
	}
}
