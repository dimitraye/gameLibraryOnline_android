package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(
        tableName = "statistic",
        foreignKeys = @ForeignKey(
                entity = User.class,
                parentColumns = "id",
                childColumns = "user_id",
                onDelete = ForeignKey.CASCADE
        )
)
public class Statistic {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private Long id;

    @ColumnInfo(name = "nbTotalGames")
    @SerializedName("nbTotalGames")
    private int nbTotalGames;

    @ColumnInfo(name = "nbGamesNotStarted")
    @SerializedName("nbGamesNotStarted")
    private int nbGamesNotStarted;

    @ColumnInfo(name = "nbGamesStarted")
    @SerializedName("nbGamesStarted")
    private int nbGamesStarted;

    @ColumnInfo(name = "nbGamesFinished")
    @SerializedName("nbGamesFinished")
    private int nbGamesFinished;

    @ColumnInfo(name = "nbGamesByPlateform")
    @SerializedName("nbGamesByPlateform")
    private int nbGamesByPlateform;

    @ColumnInfo(name = "nbGamesByGenre")
    @SerializedName("nbGamesByGenre")
    private int nbGamesByGenre;

    @ColumnInfo(name = "user_id", index = true)
    @SerializedName("user_id")
    private long userId;

    // Relation en mémoire uniquement
    @Ignore
    @SerializedName("user")
    private User user;

    // Getters et Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getNbTotalGames() {
        return nbTotalGames;
    }

    public void setNbTotalGames(int nbTotalGames) {
        this.nbTotalGames = nbTotalGames;
    }

    public int getNbGamesNotStarted() {
        return nbGamesNotStarted;
    }

    public void setNbGamesNotStarted(int nbGamesNotStarted) {
        this.nbGamesNotStarted = nbGamesNotStarted;
    }

    public int getNbGamesStarted() {
        return nbGamesStarted;
    }

    public void setNbGamesStarted(int nbGamesStarted) {
        this.nbGamesStarted = nbGamesStarted;
    }

    public int getNbGamesFinished() {
        return nbGamesFinished;
    }

    public void setNbGamesFinished(int nbGamesFinished) {
        this.nbGamesFinished = nbGamesFinished;
    }

    public int getNbGamesByPlateform() {
        return nbGamesByPlateform;
    }

    public void setNbGamesByPlateform(int nbGamesByPlateform) {
        this.nbGamesByPlateform = nbGamesByPlateform;
    }

    public int getNbGamesByGenre() {
        return nbGamesByGenre;
    }

    public void setNbGamesByGenre(int nbGamesByGenre) {
        this.nbGamesByGenre = nbGamesByGenre;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
