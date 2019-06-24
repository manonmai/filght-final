package com.cg.flightreservationsystem.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.flightreservationsystem.exception.DateInvalidException;
import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.cg.flightreservationsystem.exception.TimeInvalidException;
import com.flightreservationsystem.utility.Validation;

public class FlightScheduleOperationsImplTest {
	Validation validate= new Validation();
	@Test
	public void checkScheduleId() throws IdInvalidException, NullValueException {
		boolean expected =true;
		boolean actual = validate.isScheduleIdValid("sc101");
		assertEquals(expected, actual);
	}
	@Test(expected = IdInvalidException.class)
	public void checkIncorectId() throws IdInvalidException, NullValueException {
		validate.isScheduleIdValid("scs10156");
	}
	@Test
	public void checkDate() throws DateInvalidException, NullValueException {
		boolean expected =true;
		boolean actual = validate.isDateValid("24-05-2019");
		assertEquals(expected, actual);
	}
	@Test(expected = DateInvalidException.class)
	public void checkIncorectDate() throws DateInvalidException, NullValueException {
		validate.isDateValid("30-02-2019");
	}
	@Test(expected = NullValueException.class)
	public void checkEmptyId() throws IdInvalidException, NullValueException {
		validate.isScheduleIdValid("");
	}
	@Test
	public void checkTime() throws TimeInvalidException, NullValueException {
		boolean expected =true;
		boolean actual = validate.isTimevalid("12:50");
		assertEquals(expected, actual);
	}
	

}
