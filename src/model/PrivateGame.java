package model;

import java.util.ArrayList;
import java.util.Date;

public class PrivateGame extends TypeGame{
	
	private ArrayList<Users> attendingList;
	private ArrayList<Users> declinedList;
	private ArrayList<Users> maybeList;
	private ArrayList<Users> inviteesList;
	
	public PrivateGame(String n, Date d, String l) {
		super(n, d, l);
		attendingList = new ArrayList<Users>();
		declinedList = new ArrayList<Users>();
		maybeList = new ArrayList<Users>();
		inviteesList = new ArrayList<Users>();
	}
	
	public ArrayList<Users> getInviteesList() {
		return inviteesList;
	}

	public ArrayList<Users> getAttendingList() {
		return attendingList;
	}

	public ArrayList<Users> getDeclinedList() {
		return declinedList;
	}

	public ArrayList<Users> getMaybeList() {
		return maybeList;
	}
	
	public void addInvitee(Users i){
		inviteesList.add(i);
	}
	
	public void addAttending(Users a){
		attendingList.add(a);
	}
	
	public void addDecline(Users d){
		declinedList.add(d);
	}
	
	public void addMaybe(Users m){
		maybeList.add(m);
	}


}
