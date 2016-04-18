package com.gwidgets.client;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.Place;
import com.google.inject.Inject;
import com.google.inject.Provider;
import com.gwidgets.activities.*;
import com.gwidgets.places.*;


public class MyActivityMapper implements ActivityMapper {
	
	ClientFactory factory;
	
	MainPageActivity activity;


	
	public MyActivityMapper(ClientFactory factory ){
		this.factory = factory;
		
	}
	
	@Override
	public Activity getActivity(Place place) {
		
		
		if(activity == null){
			
			activity = new MainPageActivity(factory, place);
		}else{
			
			activity.refreshPlace(place);
		}
		
		return activity;
	}
}
