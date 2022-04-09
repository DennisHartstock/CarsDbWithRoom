package com.example.carsdbwithroom.Data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.carsdbwithroom.Model.Car;

@Database(entities = {Car.class}, version = 1)
public abstract class CarsAppDatabase extends RoomDatabase {
    public abstract CarsDAO getCarDAO();
}
