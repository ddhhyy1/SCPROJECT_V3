package com.studycafe.prac.dao;

import java.util.ArrayList;

import com.studycafe.prac.dto.seatDto;

public interface TodayTicketDao {

	public void regist(int seatNo, String userId, String ticketName, String selectedDate, String selectedTime);
	public ArrayList<seatDto> registTodayConfirm();
	
	
}
