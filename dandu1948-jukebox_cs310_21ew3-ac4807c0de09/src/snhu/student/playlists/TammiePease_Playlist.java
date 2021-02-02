package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

//added my own playlist into the mix -Tammie Pease

//Followed TestStudent Templates within snhu.student.playlists

public class TammiePease_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	ArrayList<Song> setItOffTracks = new ArrayList<Song>();
    SetItOff setItOff = new SetItOff();
	
    setItOffTracks = setItOff.getSetItOffsSongs();
	
	playlist.add(setItOffTracks.get(0));
	playlist.add(setItOffTracks.get(1));
	playlist.add(setItOffTracks.get(2));
	playlist.add(setItOffTracks.get(3));
	
	ArrayList<Song> skilletTracks = new ArrayList<Song>();
    Skillet skillet = new Skillet();
	
    skilletTracks = skillet.getSkilletsSongs();
	
	playlist.add(skilletTracks.get(0));
	playlist.add(skilletTracks.get(1));
	playlist.add(skilletTracks.get(2));
	
    return playlist;
	}
}