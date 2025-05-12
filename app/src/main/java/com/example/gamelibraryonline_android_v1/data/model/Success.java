package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Ignore;
import androidx.room.PrimaryKey;

import com.google.gson.annotations.SerializedName;

@Entity(
    tableName = "success",
    foreignKeys = @ForeignKey(
        entity = Game.class,
        parentColumns = "id",
        childColumns = "game_id",
        onDelete = ForeignKey.CASCADE
    )
)
public class Success {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    private long idSuccess;

    @ColumnInfo(name = "description")
    @SerializedName("description")
    private String description;

    @ColumnInfo(name = "owned")
    @SerializedName("owned")
    private Boolean owned;

    @ColumnInfo(name = "game_id", index = true)
    @SerializedName("game_id")
    private long gameId;

    // Relation en mémoire uniquement
    @Ignore
    @SerializedName("game")
    private Game game;

    // Getters et Setters

    public long getIdSuccess() {
        return idSuccess;
    }

    public void setIdSuccess(long idSuccess) {
        this.idSuccess = idSuccess;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getOwned() {
        return owned;
    }

    public void setOwned(Boolean owned) {
        this.owned = owned;
    }

    public long getGameId() {
        return gameId;
    }

    public void setGameId(long gameId) {
        this.gameId = gameId;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
