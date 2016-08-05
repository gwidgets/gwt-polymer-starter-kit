package com.gwidgets.di;

import com.google.gwt.inject.client.AbstractGinModule;
import com.google.gwt.place.shared.PlaceController;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import com.google.web.bindery.event.shared.EventBus;
import com.google.web.bindery.event.shared.SimpleEventBus;
import com.gwidgets.client.MyActivityMapper;
import com.gwidgets.ui.MainPage;

public class InjectorModule extends AbstractGinModule {

	@Override
	protected void configure() {
		// TODO Auto-generated method stub
		 bind(MainPage.class).in(Singleton.class);
		 bind(EventBus.class).to(SimpleEventBus.class).in(Singleton.class);
		 bind(MyActivityMapper.class).in(Singleton.class);
	}
	
	  @Provides
	  @Singleton
	  public PlaceController getPlaceController(EventBus eventBus) {
	    return new PlaceController(eventBus);
	  }

}
