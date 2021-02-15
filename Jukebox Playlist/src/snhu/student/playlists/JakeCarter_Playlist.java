package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class JakeCarter_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> toolTracks = new ArrayList<Song>();
    Tool tool = new Tool();
	
    toolTracks = tool.getToolSongs();
	
	playlist.add(toolTracks.get(0));
	playlist.add(toolTracks.get(1));
	
	
    SonReal SonReal = new SonReal();
	ArrayList<Song> SonRealTracks = new ArrayList<Song>();
    SonRealTracks = SonReal.getSonrealSongs();	
	playlist.add(SonRealTracks.get(0));
	playlist.add(SonRealTracks.get(1));
	
    return playlist;
	}
}
