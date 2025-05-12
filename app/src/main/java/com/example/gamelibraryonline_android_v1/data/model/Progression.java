package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(
        tableName = "progression",
        foreignKeys = {
                @ForeignKey(
                        entity = User.class,
                        parentColumns = "id",
                        childColumns = "user_id",
                        onDelete = ForeignKey.CASCADE
                ),
                @ForeignKey(
                        entity = Game.class,
                        parentColumns = "id",
                        childColumns = "game_id",
                        onDelete = ForeignKey.CASCADE
                )
        }
)
public class Progression {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private long idProgression;

    @ColumnInfo(name = "detailsProgression")
    @SerializedName("detailsProgression")
    private String detailsProgression;

    @ColumnInfo(name = "percentageCompletion")
    @SerializedName("percentageCompletion")
    private int percentageCompletion;

    @ColumnInfo(name = "user_id", index = true)
    @SerializedName("user_id")
    private long userId;

    @ColumnInfo(name = "game_id", index = true)
    @SerializedName("game_id")
    private long gameId;

    // Relation en mémoire uniquement
    @Ignore
    @SerializedName("user")
    private User user;

    @Ignore
    @SerializedName("game")
    private Game game;

    // Getters et Setters

    public long getIdProgression() {
        return idProgression;
    }

    public void setIdProgression(long idProgression) {
        this.idProgression = idProgression;
    }

    public String getDetailsProgression() {
        return detailsProgression;
    }

    public void setDetailsProgression(String detailsProgression) {
        this.detailsProgression = detailsProgression;
    }

    public int getPercentageCompletion() {
        return percentageCompletion;
    }

    public void setPercentageCompletion(int percentageCompletion) {
        this.percentageCompletion = percentageCompletion;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
