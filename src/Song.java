/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tdinh
 */
public class Song {

    private String title;
    private String artist;

    public Song() {
    }

    public Song(String title, String artist) {

        this.title = title;
        this.artist = artist;

    }
    
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;

    }

    @Override
    public String toString() {
        return "Song{" + "title=" + title + ", artist=" + artist + '}';
    }
    
   

}
