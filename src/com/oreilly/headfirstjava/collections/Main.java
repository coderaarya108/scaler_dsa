package com.oreilly.headfirstjava.collections;

import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<SongV3> songList = MockSongs.getSongs();

        Collections.sort(songList);
        System.out.println(songList);

        songList.sort(new ArtistComparator());
        System.out.println(songList);

        songList.sort((one, two) -> one.getBpm() - two.getBpm());
        System.out.println(songList);

        songList.sort((one,two) -> two.getTitle().compareTo(one.getTitle()));
        System.out.println(songList);
    }
}
