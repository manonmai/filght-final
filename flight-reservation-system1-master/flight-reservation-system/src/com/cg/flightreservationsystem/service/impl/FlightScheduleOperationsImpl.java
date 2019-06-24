package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;
import java.util.List;

import com.cg.flightreservationsystem.dto.ScheduleDTO;
import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.service.FlightScheduleOperations;
import com.cg.flightreservationsystem.staticdb.Scheduledb;

public class FlightScheduleOperationsImpl implements FlightScheduleOperations{
	 Scheduledb scheduledb = new Scheduledb();
	 static {
		 Scheduledb.add();
	 }
	public boolean modify(String scheduleId, String arrivalTime, String departureTime, String arrivalDate, String departureDate,String option, String price) throws EmptyListException
	{
		
		boolean flag;
		flag = false;
		List<ScheduleDTO>scheduleList = scheduledb.getScheduleList();
		if(scheduleList==null||scheduleList.isEmpty()) {
			throw new EmptyListException("Flight list is having issue");
		}
		else {
		if(option=="arrivalTime")
		{
			for(ScheduleDTO schedule: scheduleList)
			{
				if(schedule.getScheduleId().equals(scheduleId))
				{
					schedule.setArrivalTime(arrivalTime);
					break;
				}
			}
			
		}
		else if(option=="departureTime")
		{
				for(ScheduleDTO schedule: scheduleList)
				{
					if(schedule.getScheduleId().equals(scheduleId))
					{
						schedule.setDepartureTime(departureTime);
						break;
					}
				}
		}
		else if(option=="departureDate")
		{
				for(ScheduleDTO schedule: scheduleList)
				{
					if(schedule.getScheduleId().equals(scheduleId))
					{
						schedule.setDepartureDate(departureDate);
						break;
					}
				}
		}
		else if(option=="arrivalDate")
		{
				for(ScheduleDTO schedule: scheduleList)
				{
					if(schedule.getScheduleId().equals(scheduleId))
					{
						schedule.setArrivalDate(arrivalDate);
						break;
					}
				}
		}
		else if(option == "price")
		{
				for(ScheduleDTO schedule: scheduleList)
				{
					if(schedule.getScheduleId().equals(scheduleId))
					{
						schedule.setPrice(price);
						break;
					}
				}
		}
		}
		return flag;
		}
	public List<ScheduleDTO> view() throws EmptyListException {
		// TODO Auto-generated method stub
		if(!scheduledb.getScheduleList().isEmpty())
		{
		List<ScheduleDTO>scheduleList = new ArrayList<ScheduleDTO>();
		scheduleList.addAll(scheduledb.view());
		return scheduleList;
		}
		else {
			throw new EmptyListException("List is empty");
		}
	}


		
	}
