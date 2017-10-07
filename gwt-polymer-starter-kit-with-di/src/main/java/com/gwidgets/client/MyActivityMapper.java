package com.gwidgets.client;

import javax.inject.Inject;
import javax.inject.Provider;
import javax.inject.Singleton;

import com.google.gwt.activity.shared.Activity;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.Place;
import com.gwidgets.activities.*;




@Singleton
public class MyActivityMapper implements ActivityMapper {
	
	 @Inject Provider<MainPageActivity> activityProvider;

	@Inject
	public MyActivityMapper(){
		GWT.log("creating activity mapper");
	}
	
	@Override
	public Activity getActivity(Place place) {
		GWT.log("changing activity");
		//No need to check if activity is null, it is injected by dagger
		MainPageActivity activity = activityProvider.get();
		activity.refreshPlace(place);
		return activity;
	}
}
