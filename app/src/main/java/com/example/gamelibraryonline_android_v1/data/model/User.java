package com.example.gamelibraryonline_android_v1.data.model;

import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.ColumnInfo;
import androidx.room.Ignore;

import com.google.gson.annotations.SerializedName;

import java.util.List;

@Entity(tableName = "user")
public class User {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    @SerializedName("id")
    public long idUser;

    @ColumnInfo(name = "username")
    @SerializedName("username")
    public String username;

    @ColumnInfo(name = "password")
    @SerializedName("password")
    public String password;

    @ColumnInfo(name = "firstname")
    @SerializedName("firstname")
    public String firstname;

    @ColumnInfo(name = "lastname")
    @SerializedName("lastname")
    public String lastname;

    @ColumnInfo(name = "birthDate")
    @SerializedName("birthDate")
    public String birthDate;

    @ColumnInfo(name = "gender")
    @SerializedName("gender")
    public Boolean gender;

    @ColumnInfo(name = "address")
    @SerializedName("address") // Correction de l'orthographe "adress" en "address"
    public String address;

    @ColumnInfo(name = "postCode")
    @SerializedName("postCode")
    public String postCode;

    @ColumnInfo(name = "city")
    @SerializedName("city")
    public String city;

    @ColumnInfo(name = "country")
    @SerializedName("country")
    public String country;

    @ColumnInfo(name = "phoneNumber")
    @SerializedName("phoneNumber")
    public String phoneNumber;

    @ColumnInfo(name = "email")
    @SerializedName("email")
    public String email;

    @ColumnInfo(name = "registrationDate")
    @SerializedName("registrationDate")
    public String registrationDate;

    @ColumnInfo(name = "role")
    @SerializedName("role")
    public String role; // Enum sous forme de String (car le backend gère un Enum)

    // Relations (OneToMany, OneToOne) ne sont pas gérées directement par Room ici
    // Elles doivent être gérées via Retrofit pour récupérer les données associées

    @Ignore
    @SerializedName("games") // Liste des jeux (OneToMany)
    public List<Game> games;

    @Ignore
    @SerializedName("progressions") // Liste des progressions (OneToMany)
    public List<Progression> progressions;

    @Ignore
    @SerializedName("commentaries") // Liste des commentaires (OneToMany)
    public List<Commentary> commentaries;

    @Ignore
    @SerializedName("statistic") // Statistiques de l'utilisateur (OneToOne)
    public Statistic statistic;

    // Vous pouvez ajouter des méthodes ou des appels Retrofit pour récupérer ces données depuis votre serveur distant

}
