package snhu.jukebox.playlist.tests;

import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.Test;
import music.artist.*;
import snhu.jukebox.playlist.Song;

public class JukeboxTest {

	@Test
	public void testGetBeatlesAlbumSize() throws NoSuchFieldException, SecurityException {
		 TheBeatles theBeatlesBand = new TheBeatles();
		 ArrayList<Song> beatlesTracks = new ArrayList<Song>();
		 beatlesTracks = theBeatlesBand.getBeatlesSongs();
		 assertEquals(2, beatlesTracks.size());
	}
	
	@Test
	public void testGetImagineDragonsAlbumSize() throws NoSuchFieldException, SecurityException {
		 ImagineDragons imagineDragons = new ImagineDragons();
		 ArrayList<Song> imagineDragonsTracks = new ArrayList<Song>();
		 imagineDragonsTracks = imagineDragons.getImagineDragonsSongs();
		 assertEquals(3, imagineDragonsTracks.size());
	}
	
	@Test
	public void testGetAdelesAlbumSize() throws NoSuchFieldException, SecurityException {
		 Adele adele = new Adele();
		 ArrayList<Song> adelesTracks = new ArrayList<Song>();
		 adelesTracks = adele.getAdelesSongs();
		 assertEquals(3, adelesTracks.size());
	}
	
	@Test
	public void testGetAbrAlbumSize() throws NoSuchFieldException, SecurityException {
		 AugustBurnsRed abr = new AugustBurnsRed();
		 ArrayList<Song> abrTracks = new ArrayList<Song>();
		 abrTracks = abr.getABRSongs();
		 assertEquals(3, abrTracks.size());
	}
	
	@Test
	public void testGetCounterpartsAlbumSize() throws NoSuchFieldException, SecurityException {
		 Counterparts counterparts = new Counterparts();
		 ArrayList<Song> counterpartsTracks = new ArrayList<Song>();
		 counterpartsTracks = counterparts.getCounterpartsSongs();
		 assertEquals(3, counterpartsTracks.size());
	}
}
