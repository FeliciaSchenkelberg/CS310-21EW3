package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class AndrewSwarr_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	ArrayList<Song> ninTracks = new ArrayList<Song>();
    NineInchNails nin = new NineInchNails();
	
    ninTracks = nin.getNINSongs();
	
	playlist.add(ninTracks.get(0));
	playlist.add(ninTracks.get(1));
	playlist.add(ninTracks.get(2));
	
    KillswitchEngage killswitchEngageBand = new KillswitchEngage();
	ArrayList<Song> killswitchEngageTracks = new ArrayList<Song>();
    killswitchEngageTracks = killswitchEngageBand.getKSESongs();
	
	playlist.add(killswitchEngageTracks.get(0));
	playlist.add(killswitchEngageTracks.get(1));
	playlist.add(killswitchEngageTracks.get(2));
	
    return playlist;
	}
}