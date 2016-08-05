package com.gwidgets.di;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.activity.shared.ActivityMapper;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.gwidgets.activities.MainPageActivity;
import com.gwidgets.client.MyActivityMapper;
import com.gwidgets.client.MyHistoryMapper;
import com.gwidgets.places.HomePlace;
import com.gwidgets.ui.MainPage;

public class InjectorModule extends AbstractModule {
	
	

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		bind(MainPage.class).asEagerSingleton();
	     bind(MainPageActivity.class).asEagerSingleton();
		bind(MyActivityMapper.class).asEagerSingleton();
		bind(EventBus.class).to(SimpleEventBus.class).asEagerSingleton();
		bind(MyHistoryMapper.class).asEagerSingleton();
		 bind(PlaceController.class).asEagerSingleton();
		 bind(PlaceHistoryHandler.class).asEagerSingleton();
		 bind(ActivityManager.class).asEagerSingleton();
		 
		 bind(SimplePanel.class).asEagerSingleton();;
		
		 
	}
	
	  @Provides
	  public MainPageActivity getMainPageActivity(MainPage mainPage) {
		  GWT.log("creating activity inside provides");
	    return new MainPageActivity(mainPage);
	  }
	  
	  @Provides
	  public MyHistoryMapper getHistoryMapper() {
	    return GWT.create(MyHistoryMapper.class);
	  }
	  
	  @Provides
	  public  MyActivityMapper getActivityMapper(MainPageActivity mainPageActivity) {
		  GWT.log("creating activity mapper provides");
	    return new MyActivityMapper(mainPageActivity);
	  }
	
	  @Provides
	  public PlaceController getPlaceController(EventBus eventBus) {
	    return new PlaceController(eventBus);
	  }
	  
	  @Provides 
	  public PlaceHistoryHandler getHistoryHandler(PlaceController placeController,
			                                       MyHistoryMapper historyMapper, 
	                                               EventBus eventBus) {
	    PlaceHistoryHandler historyHandler =  new PlaceHistoryHandler(historyMapper);
	    historyHandler.register(placeController, eventBus, new HomePlace("home"));
	    return historyHandler;
	  }
	  
	  @Provides 
	  public ActivityManager getActivityManager(MyActivityMapper mapper,
	                                               EventBus eventBus, SimplePanel appwidget) {
		  ActivityManager activityManager = new ActivityManager(mapper, eventBus);
	        activityManager.setDisplay(appwidget);
	    return activityManager;
	  }


}
