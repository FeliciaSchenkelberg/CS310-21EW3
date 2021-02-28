package snhu.student.playlists;

import snhu.jukebox.playlist.PlayableSong;
import snhu.jukebox.playlist.Song;
import music.artist.*;
import java.util.ArrayList;
import java.util.LinkedList;

public class BenjaminDarwin_Playlist {
    
	public LinkedList<PlayableSong> StudentPlaylist(){
	
	LinkedList<PlayableSong> playlist = new LinkedList<PlayableSong>();
	
	
    Adele adeleBand = new Adele();
	ArrayList<Song> adeleTracks = new ArrayList<Song>();
    adeleTracks = adeleBand.getAdelesSongs();
	
	playlist.add(adeleTracks.get(0));
	playlist.add(adeleTracks.get(1));
	playlist.add(adeleTracks.get(2));	
	
	
    Kansas kansasBand = new Kansas();
	ArrayList<Song> kansasTracks = new ArrayList<Song>();
    kansasTracks = kansasBand.getKansasSongs();
	
	playlist.add(kansasTracks.get(0));
	playlist.add(kansasTracks.get(1));
	playlist.add(kansasTracks.get(2));	
	
	
    KatyPerry katyPerryBand = new KatyPerry();
	ArrayList<Song> katyPerryTracks = new ArrayList<Song>();
    katyPerryTracks = katyPerryBand.getKatyPerrySongs();
	
	playlist.add(katyPerryTracks.get(0));
	playlist.add(katyPerryTracks.get(1));
	
	
    return playlist;
	}
}
