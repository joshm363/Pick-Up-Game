package controller;

import java.util.ArrayList;
import java.util.Date;

import model.PublicGame;

public class Action {
	
	private ArrayList<PublicGame> publicGamesList;
	
	public Action(){
		publicGamesList = new ArrayList<PublicGame>();
	}
	
	public void hostGamePublic(String name, String loc, String date){
		Date d = new Date();
		PublicGame publicG = new PublicGame(name, d, loc);
		publicGamesList.add(publicG);
	}
	
	public void hostGamePrivate(){
		
	}
	
	public void searchGame(String name){
		
	}
	
	public ArrayList<PublicGame> nearMe(){
		return publicGamesList;
	}
	
	public void myGames(){
		
	}

}
