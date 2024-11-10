package com.oreilly.headfirstjava.collections;

import java.util.Comparator;

public class ArtistComparator implements Comparator<SongV3> {

    @Override
    public int compare(SongV3 o1, SongV3 o2) {
        return o1.getArtist().compareTo(o2.getArtist());
    }
}
