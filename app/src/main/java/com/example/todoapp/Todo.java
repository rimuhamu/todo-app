package com.example.todoapp;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Todo {
    @PrimaryKey
    public int id;

    @ColumnInfo(name = "task")
    public String task;

    @ColumnInfo(name = "description")
    public String description;

    @ColumnInfo(name = "finished")
    public int isFinished;

    @ColumnInfo(name = "favorite")
    public int isFavorite;

    @ColumnInfo(name = "due_date")
    public long dueDate;
}
