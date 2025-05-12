package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

import java.util.Date;
import java.util.List;

@Entity(
        tableName = "game",
        foreignKeys = @ForeignKey(
                entity = User.class,
                parentColumns = "id",
                childColumns = "user_id",
                onDelete = ForeignKey.CASCADE
        )
)
public class Game {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private long idGame;

    @ColumnInfo(name = "title")
    @SerializedName("title")
    private String title;

    @ColumnInfo(name = "platform")
    @SerializedName("platform")
    private String platform; // Enum Platform -> String

    @ColumnInfo(name = "gameGenre")
    @SerializedName("gameGenre")
    private String videoGameGenre; // Enum VideoGameGenre -> String

    @ColumnInfo(name = "datePurchase")
    @SerializedName("datePurchase")
    private Date datePurchase;

    @ColumnInfo(name = "playHours")
    @SerializedName("playHours")
    private int playHours;

    @ColumnInfo(name = "state")
    @SerializedName("state")
    private String state; // Enum GameStatus -> String

    @ColumnInfo(name = "picture")
    @SerializedName("picture")
    private String picture;

    @ColumnInfo(name = "user_id", index = true)
    @SerializedName("user_id")
    private long userId;

    // Relations non stockées directement en base, mais utilisables avec @Relation
    @Ignore
    @SerializedName("successes")
    private List<Success> successes;

    @Ignore
    @SerializedName("progressions")
    private List<Progression> progressions;

    @Ignore
    @SerializedName("commentaries")
    private List<Commentary> commentaries;

    // Getters et Setters

    public long getIdGame() {
        return idGame;
    }

    public void setIdGame(long idGame) {
        this.idGame = idGame;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getVideoGameGenre() {
        return videoGameGenre;
    }

    public void setVideoGameGenre(String videoGameGenre) {
        this.videoGameGenre = videoGameGenre;
    }

    public Date getDatePurchase() {
        return datePurchase;
    }

    public void setDatePurchase(Date datePurchase) {
        this.datePurchase = datePurchase;
    }

    public int getPlayHours() {
        return playHours;
    }

    public void setPlayHours(int playHours) {
        this.playHours = playHours;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public List<Success> getSuccesses() {
        return successes;
    }

    public void setSuccesses(List<Success> successes) {
        this.successes = successes;
    }

    public List<Progression> getProgressions() {
        return progressions;
    }

    public void setProgressions(List<Progression> progressions) {
        this.progressions = progressions;
    }

    public List<Commentary> getCommentaries() {
        return commentaries;
    }

    public void setCommentaries(List<Commentary> commentaries) {
        this.commentaries = commentaries;
    }
}
