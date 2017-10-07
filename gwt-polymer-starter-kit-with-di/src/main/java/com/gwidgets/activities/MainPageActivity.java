package com.gwidgets.activities;

import javax.inject.Inject;
import javax.inject.Singleton;

import com.google.gwt.activity.shared.AbstractActivity;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.event.shared.EventBus;
import com.google.gwt.place.shared.Place;
import com.google.gwt.user.client.ui.AcceptsOneWidget;
import com.gwidgets.places.ContactPlace;
import com.gwidgets.places.HomePlace;
import com.gwidgets.places.UsersPlace;
import com.gwidgets.ui.MainPage;

@Singleton
public class MainPageActivity extends AbstractActivity implements MainPage.Presenter {
	
	MainPage mainPage;

	
	@Inject
	public MainPageActivity(MainPage mainPage) {
		GWT.log("creating main activity");
		this.mainPage = mainPage;
		
	}

	@Override
	public void start(AcceptsOneWidget panel, EventBus bus) {
		GWT.log("starting main activity");
		panel.setWidget(mainPage);
		
	}
	
	public void refreshPlace(Place place){
		GWT.log("refreshing place");
		if(place instanceof HomePlace){
			placeChangeWithoutClickEvent("home");
		}else if(place instanceof ContactPlace){
			placeChangeWithoutClickEvent("contact");
		}else if(place instanceof UsersPlace){
			placeChangeWithoutClickEvent("users");
		}
	}

	@Override
	public void placeChangeWithoutClickEvent(String placeName) {
		// TODO Auto-generated method stub
		mainPage.getIronPagesElement().select(placeName);
      	 mainPage.getPaperMenu().select(placeName);
		
	}



}
