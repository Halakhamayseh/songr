package com.example.songr;

import javax.persistence.*;
import java.util.List;

@Entity
public class Song {
    public Song( ) {
       //default cons
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String title;
    private float length;
    private int trackNumber;
    private String albumSongTitle;

    public String getAlbumSongTitle() {
        return albumSongTitle;
    }

    public void setAlbumSongTitle(String albumSongTitle) {
        this.albumSongTitle = albumSongTitle;
    }

    public Album getAlbumSong() {
        return albumSong;
    }

    public void setAlbumSong(Album albumSong) {
        this.albumSong = albumSong;
    }

    @ManyToOne
   private Album albumSong;
    //List<Song> songs;
    public Song(String title, float length, int trackNumber,String albumSongTitle) {
//        this.id = id;
        this.title = title;
        this.length = length;
        this.trackNumber = trackNumber;
        this.albumSongTitle=albumSongTitle;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public float getLength() {
        return length;
    }

    public void setLength(float length) {
        this.length = length;
    }

    public int getTrackNumber() {
        return trackNumber;
    }

    public void setTrackNumber(int trackNumber) {
        this.trackNumber = trackNumber;
    }
}
