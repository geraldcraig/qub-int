//package uk.ac.qub.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "ALBUMS")
//public class AlbumAllFields {
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "NUMBER")
//    private Integer number;
//
//    @Column(name = "TITLE")
//    private String title;
//
//    @Column(name = "ARTIST")
//    private String artist;
//
//    @Column(name = "GENRE")
//    private String genre;
//
//    @Column(name = "SUB_GENRE")
//    private String subGenre;
//
//    @Column(name = "ALBUM_YEAR")
//    private Integer albumYear;
//
//    @Column(name = "IMAGE_LINK")
//    private String imageLink;
//
////    @ManyToOne
////    @JoinColumn(name = "artist_id", nullable = false)
////    private Artist artist;
////
////    @ManyToOne
////    @JoinColumn(name = "genre_id", nullable = false)
////    private Genre genre;
////
////    @ManyToOne
////    @JoinColumn(name = "sub_genre_id")
////    private SubGenre subGenre;
//
//
//    public AlbumAllFields() {
//    }
//
//    public AlbumAllFields(Long id, Integer number, String title, String artist, String genre, String subGenre, Integer albumYear, String imageLink) {
//        this.id = id;
//        this.number = number;
//        this.title = title;
//        this.artist = artist;
//        this.genre = genre;
//        this.subGenre = subGenre;
//        this.albumYear = albumYear;
//        this.imageLink = imageLink;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Integer getNumber() {
//        return number;
//    }
//
//    public void setNumber(Integer number) {
//        this.number = number;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public String getArtist() {
//        return artist;
//    }
//
//    public void setArtist(String artist) {
//        this.artist = artist;
//    }
//
//    public String getGenre() {
//        return genre;
//    }
//
//    public void setGenre(String genre) {
//        this.genre = genre;
//    }
//
//    public String getSubGenre() {
//        return subGenre;
//    }
//
//    public void setSubGenre(String subGenre) {
//        this.subGenre = subGenre;
//    }
//
//    public Integer getAlbumYear() {
//        return albumYear;
//    }
//
//    public void setAlbumYear(Integer albumYear) {
//        this.albumYear = albumYear;
//    }
//
//    public String getImageLink() {
//        return imageLink;
//    }
//
//    public void setImageLink(String imageLink) {
//        this.imageLink = imageLink;
//    }
//}
//
