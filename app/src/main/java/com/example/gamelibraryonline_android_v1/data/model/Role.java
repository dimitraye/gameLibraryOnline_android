package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.TypeConverter;

public enum Role {
    CLIENT,
    ADMIN;

    public static class Converters {
        @TypeConverter
        public static Role fromString(String value) {
            if (value == null) {
                return null;
            }
            return Role.valueOf(value);
        }

        @TypeConverter
        public static String toString(Role role) {
            return role == null ? null : role.name();
        }
    }
}
