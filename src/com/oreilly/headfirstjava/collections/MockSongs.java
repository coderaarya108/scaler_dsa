package com.oreilly.headfirstjava.collections;

import java.util.ArrayList;
import java.util.List;

public class MockSongs {

    public static List<SongV3> getSongs(){

        List<SongV3> songs = new ArrayList<>();
        songs.add(new SongV3("Teri Deewani" , "Kailash" , 125));
        songs.add(new SongV3("Pal Pal dil k pass" , "KishoreDa" , 140));
        songs.add(new SongV3("Jab Koi Baat bigad jaaye" , "KumarDa" , 150));
        songs.add(new SongV3("$$$Song" , "Kunal" , 125));
        songs.add(new SongV3("9Do11" , "Salman" , 110));

        return songs;
    }
}
