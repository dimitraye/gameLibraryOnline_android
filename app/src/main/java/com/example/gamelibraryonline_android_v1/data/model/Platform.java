package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.TypeConverter;

public enum Platform {
    // Consoles de salon
    ATARI_2600,
    ATARI_5200,
    NINTENDO_NES,
    NINTENDO_SNES,
    NINTENDO_64,
    NINTENDO_GAMECUBE,
    NINTENDO_WII,
    NINTENDO_WII_U,
    NINTENDO_SWITCH,
    SONY_PLAYSTATION_1,
    SONY_PLAYSTATION_2,
    SONY_PLAYSTATION_3,
    SONY_PLAYSTATION_4,
    SONY_PLAYSTATION_5,
    MICROSOFT_XBOX,
    MICROSOFT_XBOX_360,
    MICROSOFT_XBOX_ONE,
    MICROSOFT_XBOX_SERIES_X,
    MICROSOFT_XBOX_SERIES_S,
    SEGA_MASTER_SYSTEM,
    SEGA_MEGA_DRIVE,
    SEGA_SATURN,
    SEGA_DREAMCAST,

    // Consoles portables
    NINTENDO_GAME_BOY,
    NINTENDO_GAME_BOY_COLOR,
    NINTENDO_GAME_BOY_ADVANCE,
    NINTENDO_DS,
    NINTENDO_3DS,
    NINTENDO_GAME_AND_WATCH,
    NINTENDO_SWITCH_LITE,
    SONY_PSP,
    SONY_PS_VITA,
    SEGA_GAME_GEAR,
    NEO_GEO_POCKET,
    NEO_GEO_POCKET_COLOR,
    ATARI_LYNX,

    // PC et ordinateurs
    WINDOWS,
    MACOS,
    LINUX,
    AMIGA,
    COMMODORE_64,
    MSX,
    ZX_SPECTRUM,
    DOS,

    // Smartphones et tablettes
    IOS,
    ANDROID,
    WINDOWS_PHONE,

    // Plates-formes VR (Réalité virtuelle)
    OCULUS_RIFT,
    META_QUEST,
    HTC_VIVE,
    PLAYSTATION_VR,
    VALVE_INDEX,
    GOOGLE_DAYDREAM,
    SAMSUNG_GEAR_VR,

    // Consoles hybrides ou alternatives
    STEAM_DECK,
    PICO_8,
    ANALOGUE_POCKET,
    EVERCADE,

    // Machines d'arcade
    ARCADE_CLASSIC,
    NEO_GEO_MVS;



    public static class Converters {
        @TypeConverter
        public static Platform fromString(String value) {
            if (value == null) {
                return null;
            }
            return Platform.valueOf(value);
        }

        @TypeConverter
        public static String toString(Platform platform) {
            return platform == null ? null : platform.name();
        }
    }
}
