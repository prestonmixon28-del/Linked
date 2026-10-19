public class main {
    public static void main(String[] args) {
        SinglyLinkedList playlist = new SinglyLinkedList();

        Song song1 = new Song("monster", "Skillet", 258);
        Song song2 = new Song("Give'em Hell", "SlackJaw", 340);
        Song song3 = new Song("Killpop", "Slipknot", 345);

        playlist.addLast(song1);
        playlist.addLast(song2);
        playlist.addLast(song3);

        System.out.println("Playlist:");
        playlist.display();
    }
}
