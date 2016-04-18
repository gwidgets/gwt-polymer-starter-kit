package com.gwidgets.client;



import com.google.gwt.place.shared.PlaceHistoryMapper;
import com.google.gwt.place.shared.WithTokenizers;
import com.gwidgets.places.*;


@WithTokenizers({ContactPlace.Tokenizer.class, HomePlace.Tokenizer.class, UsersPlace.Tokenizer.class})
public interface MyHistoryMapper extends PlaceHistoryMapper  {

}

