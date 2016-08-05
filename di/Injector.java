package com.gwidgets.di;

import com.google.gwt.core.client.GWT;
import com.google.gwt.inject.client.GinModules;
import com.google.gwt.inject.client.Ginjector;
import com.google.gwt.place.shared.PlaceController;
import com.google.web.bindery.event.shared.EventBus;
import com.gwidgets.client.MyActivityMapper;
import com.gwidgets.ui.MainPage;


@GinModules(InjectorModule.class)
public interface Injector extends Ginjector {
    public static final Injector INSTANCE = GWT.create(Injector.class);
    public MainPage getMainPage();
    public EventBus getEventBus();
    public PlaceController getPlaceController();
    public MyActivityMapper getActivityMapper();
}