package com.edu.vt.boardgames;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.actionbarsherlock.app.SherlockFragment;
import test.team9.boardgame.R;

public class MainView extends SherlockFragment{
	
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
		return inflater.inflate(R.layout.activity_main, container, false);
	}

}