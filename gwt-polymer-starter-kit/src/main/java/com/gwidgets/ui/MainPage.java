package com.gwidgets.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Document;
import com.google.gwt.dom.client.Element;
import com.google.gwt.place.shared.PlaceController;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.IsWidget;
import com.google.gwt.user.client.ui.UIObject;
import com.google.gwt.user.client.ui.Widget;
import com.gwidgets.places.ContactPlace;
import com.gwidgets.places.HomePlace;
import com.gwidgets.places.UsersPlace;
import com.vaadin.polymer.Polymer;
import com.vaadin.polymer.iron.IronPagesElement;
import com.vaadin.polymer.paper.PaperDrawerPanelElement;
import com.vaadin.polymer.paper.PaperMenuElement;
import com.vaadin.polymer.paper.widget.PaperDrawerPanel;

public class MainPage extends Composite {	
	
	@UiField
    PaperMenuElement  paperMenu;
	@UiField
    AnchorElement homeLink;
	@UiField
    AnchorElement usersLink;
	@UiField
    AnchorElement contactLink;
	@UiField
	IronPagesElement ironPages;

	



	private static MainPageUiBinder uiBinder = GWT
			.create(MainPageUiBinder.class);

	interface MainPageUiBinder extends UiBinder<Widget, MainPage> {
	}

	public MainPage() {
		initWidget(uiBinder.createAndBindUi(this));

		Polymer.endLoading(this.getElement(), (Element) paperMenu);
	}
	
	
	public void initializeEvents(PlaceController controller){
		Event.sinkEvents(usersLink, Event.ONCLICK);
		 Event.sinkEvents(homeLink, Event.ONCLICK);
		 Event.sinkEvents(contactLink, Event.ONCLICK);
		 
		 Event.setEventListener(contactLink, e -> {
	            if(Event.ONCLICK == e.getTypeInt()) {
	           	 ironPages.select("contact");
	           	 paperMenu.select("contact");
		           	controller.goTo(new ContactPlace("contact"));
		           	slideDrawerIfMobile();

	            }  
	        });
		 
		 Event.setEventListener(homeLink, e -> {
	            if(Event.ONCLICK == e.getTypeInt()) {
	            	ironPages.select("home");
	            	paperMenu.select("home");
	           	controller.goTo(new HomePlace("home"));
	           	slideDrawerIfMobile();
	            }  
	        });
		 
		 Event.setEventListener(usersLink, e -> {
            if(Event.ONCLICK == e.getTypeInt()) {
           	 ironPages.select("users");
           	 paperMenu.select("users");
           	       controller.goTo(new UsersPlace("users"));
           	    slideDrawerIfMobile();
           	    
            }  
   });
		
		
	}
	
	
	public AnchorElement getContactLink(){
		return contactLink;
		
	}
	
	public AnchorElement getHomeLink(){
		return homeLink;
		
	}
	
	public AnchorElement getUsersLink(){
		return usersLink;
		
	}
	
	public PaperMenuElement getPaperMenu(){
		return paperMenu;
	}
	
	public IronPagesElement getIronPagesElement(){
		return ironPages;
		
	}
	
	public interface Presenter {
		//handles clicking on back and forward buttons of the browser
		public void placeChangeWithoutClickEvent(String placeName);
	}
	
	private void slideDrawerIfMobile(){
		if( Window.getClientWidth() < 600 ){
			PaperDrawerPanelElement drawer = (PaperDrawerPanelElement) Polymer.getDocument().getElementById("paperDrawerPanel");
			drawer.closeDrawer();
		}
		
	}

}
