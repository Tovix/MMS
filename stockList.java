import java.util.ArrayList;

// description: the Stock List class is like the storage for the store that
// contains all the items the an admin can add or a user can buy.

// OOP principals applied: encapsulation appears in the objects created
// as private. polymorphism appears in methods overloading with different
// number of parameters.

public class stockList
{

    // three arraylists are created of type songs, piano and drums
    // respectively in order to store each type of item in it's specific arraylist.

    private final ArrayList<Songs> SongStockList = new ArrayList<>();
    private final ArrayList<piano> PianoStockList = new ArrayList<>();
    private final ArrayList<drums> DrumsStockList = new ArrayList<>();


    //the three following functions (addSong, addPiano, addDrums)
    // are created so that the admin can create new item and add it to it is corresponding list.
    // creates a new song/drum/piano object and fill all it's properties then add it to the stock list
    // through using the array list functionality add.

    public void addSong(int id, String trackName, String artistName, String albumName,
                        String length, String type, int soldTracks,
                        int tracksInStock, int prize)
    {
        Songs song = new Songs(id, trackName, artistName, albumName,
                length, type, soldTracks, tracksInStock, prize);
        SongStockList.add(song);
    }

    public void addPiano(String instrument_name, int instrument_id,
                         String instrument_type,int soldInstruments,
                         int instrumentsInStock, float instrument_price, int numberOfKeys,
                         String keysMaterials)
    {
        piano p = new piano(instrument_name,  instrument_id, instrument_type, soldInstruments,
                instrumentsInStock,  instrument_price,  numberOfKeys, keysMaterials);
        PianoStockList.add(p);

    }

    public void addDrums(int instrument_id, String instrument_model,
                         String instrument_type, float instrument_price, int soldInstruments,
                         int instrumentsInStock, String drumMaterial, int drumThickness)
    {
        drums drum = new drums(instrument_id, instrument_model, instrument_type,instrument_price,
                soldInstruments, instrumentsInStock, drumMaterial, drumThickness);
        DrumsStockList.add(drum);
    }

    // the following three functions (displayAllSongs, displayAllPiano, displayAllDrums)
    // are created to display all the items in a arraylist by using a for loop and retrieving
    // the items data then displaying it.
    // it for loops the stock list and extract the values for each object then display it on the console.

    public void displayAllSongs()
    {
        if(!SongStockList.isEmpty())
        {
            for (Songs songs : SongStockList)
            {
                System.out.println("------------------------------------------");
                System.out.println(
                        "ID: " + songs.getId() + "\nTrack Name: " + songs.getTrackName() + "\nArtist Name: " +
                                songs.getArtistName() + "\nAlbum Name: " +
                                songs.getAlbumName() + "\nTrack length: " + songs.getLength() + "\nTrack Type: " +
                                songs.getType() + "\nSold Tracks: " +
                                songs.getSoldTracks() + "\nAvailable Tracks: " + songs.getTracksInStock() + "\nprice: "
                                + songs.getPrize() + " EGP");
                System.out.println("------------------------------------------");
            }
        }
        else
        {
            System.out.println("Stock is empty");
        }
    }

    public void displayAllPiano()
    {
        if(!PianoStockList.isEmpty())
        {
            for (piano p : PianoStockList)
            {
                System.out.println("------------------------------------------");
                System.out.println(
                        "ID: " + p.getInstrument_id() + "\nPiano Model Name: " + p.getInstrument_model() + "\nPiano Type: " +
                                p.getInstrument_type() + "\nNumber of keys: " +
                                p.getNumberOfKeys() + "\nKeys materials: " + p.getKeysMaterials() + "\nSold pieces: " +
                                p.getSoldInstruments() + "\nAvailable pieces: " +
                                p.getInstrumentsInStock() + "\nprice: "
                                + p.getInstrument_price() + " EGP");
                System.out.println("------------------------------------------");
            }
        }
        else
            {
                System.out.println("Stock is empty");
            }
    }

    public void displayAllDrums()
    {
        if(!DrumsStockList.isEmpty())
        {
            for (drums d : DrumsStockList) {
                System.out.println("------------------------------------------");
                System.out.println(
                        "ID: " + d.getInstrument_id() + "\nDrums Model Name: " + d.getInstrument_model() + "\nDrums Type: " +
                                d.getInstrument_type() + "\nDrums material: " +
                                d.getDrumMaterial() + "\nDrums Thickness: " + d.getDrumThickness() + " mm" + "\nSold pieces: " +
                                d.getSoldInstruments() + "\nAvailable pieces: " +
                                d.getInstrumentsInStock() + "\nprice: "
                                + d.getInstrument_price() + " EGP");
                System.out.println("------------------------------------------");
            }
        }
        else
            {
                System.out.println("Stock is empty");
            }
    }

    // the following three functions (findSong, findPiano, findDrums) are created to search for an item
    // by entering the track name, piano model or the drums model and if it is found it is name is printed.
    // notice that: this functions will return position (number) that will be used in other functions
    // to retrieve the position of the object and apply the function on it.

    public int findSong(String trackName)
    {
        for(int i = 0; i < SongStockList.size(); i++)
        {
            if(SongStockList.get(i).getTrackName().equals(trackName))

            {
                return i;
            }
        }
        return -1;
    }

    public int findPiano(String pianoName)
    {
        for(int i = 0; i < PianoStockList.size(); i++)
        {
            if(PianoStockList.get(i).getInstrument_model().equals(pianoName))
            {
                return i;
            }
        }
        return -1;
    }

    public int findDrums(String DrumsName)
    {
        for(int i = 0; i < DrumsStockList.size(); i++)
        {
            if(DrumsStockList.get(i).getInstrument_model().equals(DrumsName))
            {
                return i;
            }
        }
        return -1;
    }

    // the following three functions (searchSongByArtist, searchSongByCategory, searchSongByName)
    // are created to search for a song using various ways such as artist , category or name.
    // it checks for the song's artist/category/name and if it's equal to the input then it
    // returns the song's name and it's price.

    public void searchSongByArtist(String Artist)
    {
        int flag = 0;
        for (Songs songs : SongStockList) {
            if (songs.getArtistName().equals(Artist)) {
                System.out.println("Song has been found!");
                System.out.println(songs.getTrackName() + " - " +
                        songs.getArtistName() + " - " + songs.getPrize() + " EGP");
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Song was not found please try again.");
        }
    }
    public void searchSongByCategory(String category)
    {
        int flag = 0;
        for (Songs songs : SongStockList) {
            if (songs.getType().equals(category)) {
                System.out.println("Song has been found!");
                System.out.println(songs.getTrackName() + " - " +
                        songs.getType() + " - " + songs.getPrize() + " EGP");
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Song was not found please try again.");
        }
    }

    public void searchSongByName(String TrackName)
    {
        int flag = 0;
        for (Songs songs : SongStockList) {
            if (songs.getTrackName().equals(TrackName)) {
                System.out.println("Song has been found!");
                System.out.println(songs.getTrackName() + " - " + songs.getPrize() + " EGP");
                flag = 1;
            }
        }
        if(flag == 0)
        {
            System.out.println("Song was not found please try again.");
        }
    }

    // the following three functions (modifySong, modifyPiano, modifyDrums)
    // are created to be used within another methods their main purpose is
    // assign the data of an item according to it's position in the array list.
    // it takes the position parameter of the object
    // and manipulates (changes) it's properties.

    private void modifySong(int position,int id, String trackName,
                            String artistName, String albumName,
                            String length, String type, int soldTracks,
                            int tracksInStock, int prize)
    {
        SongStockList.get(position).setId(id);
        SongStockList.get(position).setTrackName(trackName);
        SongStockList.get(position).setArtistName(artistName);
        SongStockList.get(position).setAlbumName(albumName);
        SongStockList.get(position).setLength(length);
        SongStockList.get(position).setType(type);
        SongStockList.get(position).setSoldTracks(soldTracks);
        SongStockList.get(position).setTracksInStock(tracksInStock);
        SongStockList.get(position).setPrize(prize);
    }

    private void modifyPiano(int position, String instrument_name, int instrument_id,
                            String instrument_type,int soldInstruments,
                            int instrumentsInStock, float instrument_price, int numberOfKeys,
                            String keysMaterials)
    {
        PianoStockList.get(position).setInstrument_model(instrument_name);
        PianoStockList.get(position).setInstrument_id(instrument_id);
        PianoStockList.get(position).setInstrument_type(instrument_type);
        PianoStockList.get(position).setSoldInstruments(soldInstruments);
        PianoStockList.get(position).setInstrumentsInStock(instrumentsInStock);
        PianoStockList.get(position).setInstrument_price(instrument_price);
        PianoStockList.get(position).setNumberOfKeys(numberOfKeys);
        PianoStockList.get(position).setKeysMaterials(keysMaterials);

    }

    private void modifyDrums(int position, int instrument_id, String instrument_model,
                             String instrument_type, float instrument_price, int soldInstruments,
                             int instrumentsInStock, String drumMaterial, int drumThickness)
    {
        DrumsStockList.get(position).setInstrument_model(instrument_model);
        DrumsStockList.get(position).setInstrument_id(instrument_id);
        DrumsStockList.get(position).setInstrument_type(instrument_type);
        DrumsStockList.get(position).setSoldInstruments(soldInstruments);
        DrumsStockList.get(position).setInstrumentsInStock(instrumentsInStock);
        DrumsStockList.get(position).setInstrument_price(instrument_price);
        DrumsStockList.get(position).setDrumMaterial(drumMaterial);
        DrumsStockList.get(position).setDrumThickness(drumThickness);

    }

    // the following three functions (modifySong, modifyPiano, modifyDrums)
    // are created to modify an item by searching for the
    // position of an item and if found, it will be used in the corresponding function
    // above to modify the data.
    // it uses the findSong/piano/drums function and to retrieve the position then
    // the position is used in the private modifySong/Piano/Drums to modify the object.

    public void modifySong(String currentTrackName,int id, String trackName,
                              String artistName, String albumName,
                              String length, String type, int soldTracks,
                              int tracksInStock, int prize)
    {
        int position = findSong(currentTrackName);
        if(position >= 0)
        {
            modifySong(position,id, trackName, artistName, albumName
                    ,length, type, soldTracks, tracksInStock, prize);
        }
        else
            {
                System.out.println("item not found");
            }
    }

    public void modifyPiano(String currentPianoName, String instrument_name, int instrument_id,
                            String instrument_type,int soldInstruments,
                            int instrumentsInStock, float instrument_price, int numberOfKeys,
                            String keysMaterials)
    {
        int position = findPiano(currentPianoName);
        if(position >= 0)
        {
            modifyPiano(position, instrument_name, instrument_id, instrument_type,soldInstruments,
                    instrumentsInStock, instrument_price, numberOfKeys, keysMaterials);
        }
        else
        {
            System.out.println("item not found");
        }
    }

    public void modifyDrums(String currentDrumsName, int instrument_id, String instrument_model,
                            String instrument_type, float instrument_price, int soldInstruments,
                            int instrumentsInStock, String drumMaterial, int drumThickness)
    {
        int position = findDrums(currentDrumsName);
        if(position >= 0)
        {
            modifyDrums(position, instrument_id, instrument_model,
                    instrument_type,  instrument_price,  soldInstruments,
                    instrumentsInStock,  drumMaterial,  drumThickness);
        }
        else
        {
            System.out.println("item not found");
        }
    }

    // the following three functions (removeSong, removePiano, removeDrums)
    // are created simply to be used in another functions
    // for removing an item from an arraylist of an item
    // using arraylist method (remove) through providing the position as a parameter.


    private void removeSong(int position)
    {
        SongStockList.remove(position);
    }

    private void removePiano(int position)
    {
        PianoStockList.remove(position);
    }

    private void removeDrums(int position)
    {
        DrumsStockList.remove(position);
    }

    // the following three functions (removeSong, removePiano, removeDrums)
    // are created to search for the an item and if the item is found
    // it's position is used in the above corresponding functions (private removeSongs/Piano/Drums)
    // to remove this item from the arraylist.

    public void removeSong(String currentSong)
    {
        int position = findSong(currentSong);
        if(position >= 0)
        {
            removeSong(position);
        }
    }

    public void removePiano(String currentPiano)
    {
        int position = findPiano(currentPiano);
        if(position >= 0)
        {
            removePiano(position);
        }
    }

    public void removeDrums(String currentDrums)
    {
        int position = findDrums(currentDrums);
        if(position >= 0)
        {
            removeDrums(position);
        }
    }

    // the following three functions (onFileSong, onFilePiano, onFileDrums)
    // are created to check if an item is in the arraylist and if found
    // it returns it's position if it's greater than or equal zero (valid item)
    // used in the admin class to check if an item does exist in the stock list.

    public boolean onFileSong(String searchItem)
    {
        int position = findSong(searchItem);
        return position >= 0;
    }

    public boolean onFilePiano(String searchItem)
    {
        int position = findPiano(searchItem);
        return position >= 0;
    }

    public boolean onFileDrums(String searchItem)
    {
        int position = findDrums(searchItem);
        return position >= 0;
    }

    // the following three functions (returnSong, returnPiano, returnDrums)
    // are used to search for an item by it's name and return it's object
    // (the item with all it's data) to be used in other functions.
    // used in the order class where it returns the object from the stock list
    // to be used in the functions of the order class.

    public Songs returnSong(String trackName)
    {
        int position = findSong(trackName);
        Songs s = new Songs();
        if(position >= 0)
        {
            return SongStockList.get(position);
        }
        return s;
    }

    public piano returnPiano(String PianoName)
    {
        int position = findPiano(PianoName);
        piano p = new piano();
        if(position >= 0)
        {
            return PianoStockList.get(position);
        }
        return p;
    }

    public drums returnDrums(String DrumsName)
    {
        int position = findDrums(DrumsName);
        drums d = new drums();
        if(position >= 0)
        {
            return DrumsStockList.get(position);
        }
        return d;
    }

    // the following three functions (trackSold, pianoSold, DrumsSold)
    // those functions are created to get the sold items and add one to it
    // and minus one from the number of items in the stock to ensure that an item
    // is sold.
    // it gets the position of the object and increases 1 to it's original sold items number
    // and decreases 1 from it's original number of items in stock.

    private void trackSold(int position)
    {
        SongStockList.get(position).setSoldTracks(SongStockList.get(position).getSoldTracks() + 1);
        SongStockList.get(position).setTracksInStock(SongStockList.get(position).getTracksInStock() - 1);
    }

    private void pianoSold(int position)
    {
        PianoStockList.get(position).setSoldInstruments(PianoStockList.get(position).getSoldInstruments() + 1);
        PianoStockList.get(position).setInstrumentsInStock(PianoStockList.get(position).getInstrumentsInStock() - 1);
    }

    private void drumsSold(int position)
    {
        DrumsStockList.get(position).setSoldInstruments(DrumsStockList.get(position).getSoldInstruments() + 1);
        DrumsStockList.get(position).setInstrumentsInStock(DrumsStockList.get(position).getInstrumentsInStock() - 1);
    }

    // the following three functions (trackSold, pianoSold, DrumsSold)
    // are used to search for an item by it's name and if found it applies
    // one of the corresponding above functions.

    public void trackSold(String TrackName)
    {
        int position = findSong(TrackName);
        if(position >= 0)
        {
            trackSold(position);
        }
    }

    public void pianoSold(String PianoName)
    {
        int position = findPiano(PianoName);
        if(position >= 0)
        {
            pianoSold(position);
        }
    }

    public void DrumsSold(String DrumsName)
    {
        int position = findDrums(DrumsName);
        if(position >= 0)
        {
            drumsSold(position);
        }
    }


}
