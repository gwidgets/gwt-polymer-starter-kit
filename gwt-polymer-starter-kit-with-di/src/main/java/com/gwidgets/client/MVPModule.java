package com.gwidgets.client;

import javax.inject.Singleton;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.gwidgets.activities.MainPageActivity;
import com.gwidgets.places.HomePlace;
import com.gwidgets.ui.MainPage;

import dagger.Module;
import dagger.Provides;

@Module
public class MVPModule {

	@Provides @Singleton
	public
	MainPage getMainPage(){
		return new MainPage();
	}
	
	  @Provides @Singleton
	  public EventBus getEventBus() {
	    return new SimpleEventBus();
	  }
	
	  @Provides @Singleton
	  public MyHistoryMapper getHistoryMapper() {
	    return GWT.create(MyHistoryMapper.class);
	  }
	  
	
	  @Provides @Singleton
	  public PlaceController getPlaceController(EventBus eventBus) {
	    return new PlaceController(eventBus);
	  }
	  
	  @Provides @Singleton
	  public PlaceHistoryHandler getHistoryHandler(PlaceController placeController,
			                                       MyHistoryMapper historyMapper, 
	                                               EventBus eventBus) {
	    PlaceHistoryHandler historyHandler =  new PlaceHistoryHandler(historyMapper);
	    historyHandler.register(placeController, eventBus, new HomePlace("home"));
	    return historyHandler;
	  }
	  
	  @Provides @Singleton 
	  public ActivityManager getActivityManager(MyActivityMapper mapper,
	                                               EventBus eventBus, SimplePanel appwidget) {
		  ActivityManager activityManager = new ActivityManager(mapper, eventBus);
	        activityManager.setDisplay(appwidget);
	    return activityManager;
	  }

}
