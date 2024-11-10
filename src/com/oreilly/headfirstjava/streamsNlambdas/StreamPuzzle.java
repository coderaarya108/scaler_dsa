package com.oreilly.headfirstjava.streamsNlambdas;

public class StreamPuzzle {
//    public static void main(String[] args) {
//        SongSearch songSearch = __new SongSearch()___________;
//        songSearch._printTopFiveSongs()__________;
//        ___songSearch_______.search("The Beatles");
//        ____songSearch.search("The Beach Boys");____________________________;
//    }
}
//class __SongSearch___________ {
//    private final List<Song> songs =
//            new JukeboxData.Songs().getSongs();
//
//    void printTopFiveSongs() {
//        List<String> topFive = songs.stream()
//                .__sorted(Comparator.comparingInt(Song::getTimesPLayed))____________
//                .___limit(5)___________
//                .___map(song -> song.getTitle()___________
//                .collect(__Collectors.toList()_______);
//        System.out.println(topFive);
//    }
//    void search(String artist) {
//        _Optional<Song> result_______ = songs.stream()
//                .__filter(song -> song.getArtist().equals(artist)_____________
//                .__findFirst()_____________;
//        if (__result.isPresent()_____________) {
//            System.out.println(___result.get().getTitle()___________);
//        } else {
//            System.out.println(_"No song found by : "  + artist_____________);
//        }
//    }
//}
