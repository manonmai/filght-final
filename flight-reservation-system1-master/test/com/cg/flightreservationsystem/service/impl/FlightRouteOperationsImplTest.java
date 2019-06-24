package com.cg.flightreservationsystem.service.impl;

import static org.junit.Assert.*;

import org.junit.Test;

import com.cg.flightreservationsystem.exception.IdInvalidException;
import com.cg.flightreservationsystem.exception.NullValueException;
import com.cg.flightreservationsystem.exception.PlaceInvalidException;
import com.flightreservationsystem.utility.Validation;

public class FlightRouteOperationsImplTest {
	Validation validate= new Validation();
	@Test(expected = NullValueException.class)
	public void checkEmptyId() throws IdInvalidException, NullValueException {
		validate.isRouteIdValid("");
	}

	@Test
	public void checkRouteId() throws IdInvalidException, NullValueException {
		boolean expected =true;
		boolean actual = validate.isRouteIdValid("ro101");
		assertEquals(expected, actual);
	}
	@Test(expected = IdInvalidException.class)
	public void checkIncorectRouteId() throws IdInvalidException, NullValueException {
		validate.isRouteIdValid("scs10156");
	}
	@Test
	public void checkSource() throws PlaceInvalidException, NullValueException {
		boolean expected =true;
		boolean actual = validate.isPlaceValid("Mumbai");
		assertEquals(expected, actual);
	}
	@Test(expected = PlaceInvalidException.class)
	public void checkIncorectSource() throws PlaceInvalidException, NullValueException {
		validate.isPlaceValid("564mumbai45645");
	}
}
