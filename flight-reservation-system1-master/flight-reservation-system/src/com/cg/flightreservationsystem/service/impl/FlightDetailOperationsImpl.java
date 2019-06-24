package com.cg.flightreservationsystem.service.impl;

import java.util.ArrayList;

import java.util.List;

import com.cg.flightreservationsystem.dto.FlightDTO;

import com.cg.flightreservationsystem.exception.EmptyListException;
import com.cg.flightreservationsystem.service.FlightDetailOperations;
import com.cg.flightreservationsystem.staticdb.Flightdb;


public class FlightDetailOperationsImpl implements FlightDetailOperations {
	 Flightdb flightdb = new Flightdb();
	 static {
		 Flightdb.add();
	 }
	public boolean modify(String flightId, String capacity) throws EmptyListException {
		// TODO Auto-generated method stub
		boolean flag;
		flag = false;
		List <FlightDTO>flightList = flightdb.getFlightList();
		if(flightList==null||flightList.isEmpty()) {
		throw new EmptyListException("Flight list is having issue");
		}
		else
		{
			for(FlightDTO flight: flightList)
			{System.out.println(flight.getFlightId());
			System.out.println(flightId);
				
				if(flight.getFlightId().equals(flightId))
				{
					System.out.println(flight.getFlightId());
					System.out.println(flightId);
					flight.setCapacity(capacity);
					flag=true;
					break;
				}
			}
		}
		return flag;
	}

	public List<FlightDTO> view() throws EmptyListException {
		// TODO Auto-generated method stub
		if(!flightdb.getFlightList().isEmpty())
		{
		List<FlightDTO>flightList = new ArrayList<FlightDTO>();
		flightList.addAll(flightdb.view());
		return flightList;
		}
		else {
			throw new EmptyListException("List is empty");
		}
	}
}
