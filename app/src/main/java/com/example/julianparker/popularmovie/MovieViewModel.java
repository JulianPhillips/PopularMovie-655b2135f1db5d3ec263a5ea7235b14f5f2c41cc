package com.example.julianparker.popularmovie;

import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.arch.persistence.room.Room;

import com.example.julianparker.popularmovie.Database.AppDatabase;

import java.util.ArrayList;

public class MovieViewModel extends ViewModel
{
    private MutableLiveData<ArrayList<Movie>> mCurrentMovies;




    public MutableLiveData<ArrayList<Movie>> getCurrentMovies() {



        if (mCurrentMovies ==null){
            mCurrentMovies = new MutableLiveData<ArrayList<Movie>>();
        }
        return mCurrentMovies;
    }
}
