package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.ForeignKey;
import androidx.room.Ignore;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

@Entity(
        tableName = "commentary",
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
public class Commentary {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private long idCommentary;

    @ColumnInfo(name = "commentary")
    @SerializedName("commentary")
    private String commentary;

    @ColumnInfo(name = "creationDate")
    @SerializedName("creationDate")
    private Date creationDate;

    @ColumnInfo(name = "user_id", index = true)
    @SerializedName("user_id")
    private long userId;

    @ColumnInfo(name = "game_id", index = true)
    @SerializedName("game_id")
    private long gameId;

    // Relations non stockées directement en base, mais utilisables avec @Relation
    @Ignore
    @SerializedName("user")
    private User user;

    @Ignore
    @SerializedName("game")
    private Game game;

    // Getters et Setters

    public long getIdCommentary() {
        return idCommentary;
    }

    public void setIdCommentary(long idCommentary) {
        this.idCommentary = idCommentary;
    }

    public String getCommentary() {
        return commentary;
    }

    public void setCommentary(String commentary) {
        this.commentary = commentary;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(Date creationDate) {
        this.creationDate = creationDate;
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
