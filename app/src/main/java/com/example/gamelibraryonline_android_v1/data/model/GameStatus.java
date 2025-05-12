package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.TypeConverter;

public enum GameStatus {
    NOT_STARTED,
    IN_PROGRESS,
    COMPLETED;

    public static class Converters {
        @TypeConverter
        public static GameStatus fromString(String value) {
            if (value == null) {
                return null;
            }
            return GameStatus.valueOf(value);
        }

        @TypeConverter
        public static String toString(GameStatus gameStatus) {
            return gameStatus == null ? null : gameStatus.name();
        }
    }
}
