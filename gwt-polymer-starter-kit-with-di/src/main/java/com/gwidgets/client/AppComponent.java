package com.gwidgets.client;

import javax.inject.Singleton;

import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.web.bindery.event.shared.EventBus;



import com.gwidgets.ui.MainPage;

import dagger.Component;


@Singleton
@Component(modules=MVPModule.class)
public interface AppComponent {
	
	EventBus eventBus();
	
	MainPage getMainPage();
	
	PlaceController getPlaceController();
	
	PlaceHistoryHandler getHistoryHandler();
	
	MyActivityMapper mainActivityMapper();
	
	
}
