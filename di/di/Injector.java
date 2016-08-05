package com.gwidgets.di;

import com.google.gwt.activity.shared.ActivityManager;
import com.google.gwt.core.client.GWT;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.place.shared.PlaceHistoryHandler;
import com.google.gwt.user.client.ui.SimplePanel;
import com.google.web.bindery.event.shared.EventBus;
import com.gwidgets.activities.MainPageActivity;
import com.gwidgets.client.MyActivityMapper;
import com.gwidgets.ui.MainPage;


public interface Injector  { 
    public MainPage getMainPage();
    public MainPageActivity getMainPageActivity();
    public EventBus getEventBus();
    public PlaceController getPlaceController();
    public MyActivityMapper getActivityMapper();
    public ActivityManager getActivityManager();
    public PlaceHistoryHandler getPlaceHistoryHandler();  
    public SimplePanel getAppWidget();  
}