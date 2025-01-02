package org.DSA.LinkedList.DoublyLinkedList;

class SongNode {
    int id; // Song ID
    String name; //Song name
    SongNode next; // Pointer to the next song
    SongNode prev; // Pointer to the previous song

    SongNode(int id, String name) {
        this.id = id;
        this.name = name;
        this.next = null;
        this.prev = null;
    }
}

public class MusicPlayList {
    private SongNode head; // Head of the playlist
    private SongNode tail; // Tail of the playlist
    private SongNode current; // Current song being played

    // Add a new song to the playlist
    public void addSong(int id, String name) {
        SongNode newNode = new SongNode(id, name);
        if (head == null) { // If the playlist is empty
            head = newNode;
            tail = newNode;
            current = newNode;
        } else {// Add the song to the end of the playlist
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    public void playNextSong() {
        if (current == null) {
            System.out.println("Playlist is empty.!");
            return;
        }
        if (current.next != null) {
            current = current.next;
            System.out.println("Playing Next Song -> ID: " + current.id + ", Name: " + current.name);
        } else {
            System.out.println("This is the last song. Cannot move to the next song.");
        }
    }

    public void playPreviousSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Playing Previous Song -> ID: " + current.id + ", Name: " + current.name);
        } else {
            System.out.println("This is the first song. Cannot move to the previous song.");
        }
    }

    public void displayCurrentSong() {
        if (current == null) {
            System.out.println("Playlist is empty.");
            return;
        }
        System.out.println("Current Song -> ID: " + current.id + ", Name: " + current.name);
    }

    public static void main(String[] args) {
        MusicPlayList playlist = new MusicPlayList();

        // Add songs to the playlist
        playlist.addSong(1, "Yesterday Blues");
        playlist.addSong(2, "Imagine Dragons");
        playlist.addSong(3, "Hotel California");

        // Display the current song
        playlist.displayCurrentSong();

        // Play next song
        playlist.playNextSong();

        // Display the current song
        playlist.displayCurrentSong();

        // Play next song
        playlist.playNextSong();

        // Display the current song
        playlist.displayCurrentSong();

        // Play previous song
        playlist.playPreviousSong();

        // Display the current song
        playlist.displayCurrentSong();

        // Play previous song
        playlist.playPreviousSong();

        // Display the current song
        playlist.displayCurrentSong();
    }
}
