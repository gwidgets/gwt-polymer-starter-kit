package com.gwidgets.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;


public class ContactPlace extends Place {
	
	private String name;

	public ContactPlace(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Prefix("!")
	 public static class Tokenizer implements PlaceTokenizer<ContactPlace> {
	        @Override
	        public String getToken(ContactPlace place) {
	            return place.getName();
	        }

	        @Override
	        public ContactPlace getPlace(String token) {
	            return new ContactPlace(token);
	        }
	    }
	
	

}
