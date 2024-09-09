
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author tdinh
 */
public class MusicLibrary {

    private ArrayList<Song> danhSach;

    public MusicLibrary() {
        this.danhSach = new ArrayList<>();
    }

    public MusicLibrary(ArrayList<Song> danhSach) {
        this.danhSach = danhSach;
    }

    public void addSong(Song song) {
        this.danhSach.add(song);

        System.out.println(song + " Added Success ");

    }

    public boolean deletedByName(Song name) {


        return this.danhSach.remove(name);

    }
    
    public void deltedSong(String songName){
        
        if(danhSach.isEmpty()){
            System.out.println("List Song is empty");
            return;
        }
        
        for (Song song: danhSach) {
            if(song.getTitle().equalsIgnoreCase(songName)){
                this.danhSach.remove(song);
                System.out.println("Removed Success: "+song);
                break;
            }else{
                 System.out.println("Can't find song you want to deleted");
            }
            
        }
       
    }

    public void displayList() {

        if (danhSach.isEmpty()) {
            System.out.println("Null, please add new songs");
        } else {
            for (Song musicc : danhSach) {
                System.out.println(musicc);
            }
        }
    }

  


}
