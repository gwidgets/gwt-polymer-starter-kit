package com.gwidgets.places;

import com.google.gwt.place.shared.Place;
import com.google.gwt.place.shared.PlaceTokenizer;
import com.google.gwt.place.shared.Prefix;

public class UsersPlace extends Place{
	

	private String name;

	public UsersPlace(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	@Prefix("§")
	 public static class Tokenizer implements PlaceTokenizer<UsersPlace> {
	        @Override
	        public String getToken(UsersPlace place) {
	            return place.getName();
	        }

	        @Override
	        public UsersPlace getPlace(String token) {
	            return new UsersPlace(token);
	        }
	    }

}
