// description: class representing song and all it's properties.

// OOP principals applied: encapsulation appears in the objects created with private modifiers.

public class Songs
{

    private String trackName;
    private String artistName;
    private String albumName;
    private String length;
    private String type;
    private int soldTracks;
    private int tracksInStock;
    private int id;
    private int prize;

    public Songs()
    {

    }

    public Songs(int id, String trackName, String artistName, String albumName,
                 String length, String type, int soldTracks,
                 int tracksInStock, int prize)
    {
        this.id = id;
        this.trackName = trackName;
        this.artistName = artistName;
        this.albumName = albumName;
        this.length = length;
        this.type = type;
        this.soldTracks = soldTracks;
        this.tracksInStock = tracksInStock;
        this.prize = prize;
    }


    public String getTrackName()
    {
        return trackName;
    }

    public void setTrackName(String trackName)
    {
        this.trackName = trackName;
    }

    public String getArtistName()
    {
        return artistName;
    }

    public void setArtistName(String artistName)
    {
        this.artistName = artistName;
    }

    public String getAlbumName()
    {
        return albumName;
    }

    public void setAlbumName(String albumName)
    {
        this.albumName = albumName;
    }

    public String getLength()
    {
        return length;
    }

    public void setLength(String length)
    {
        this.length = length;
    }

    public String getType()
    {
        return type;
    }

    public void setType(String type)
    {
        this.type = type;
    }

    public int getSoldTracks()
    {
        return soldTracks;
    }

    public void setSoldTracks(int soldTracks)
    {
        this.soldTracks = soldTracks;
    }

    public int getTracksInStock()
    {
        return tracksInStock;
    }

    public void setTracksInStock(int tracksInStock)
    {
        this.tracksInStock = tracksInStock;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getPrize()
    {
        return prize;
    }

    public void setPrize(int prize)
    {
        this.prize = prize;
    }

}
