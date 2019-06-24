package com.cg.flightreservationsystem.dto;

public class PassengerDTO {
	private String name;
	private String age;
	private String mobileNo;
	private String emailId;
//	private float luggage;
//	private float extraLuggage;
	
	public PassengerDTO(String name, String age, String mobileNo, String emailId) {
		super();
		this.name = name;
		this.age = age;
		this.mobileNo = mobileNo;
		this.emailId = emailId;
//		this.luggage = luggage;
//		this.extraLuggage = extraLuggage;
	}

	public String getName() {
		return name;
	}

//	public void setName(String name) {
//		this.name = name;
//	}

	public String getAge() {
		return age;
	}

//	public void setAge(int age) {
//		this.age = age;
//	}

	public String getMobileNo() {
		return mobileNo;
	}

//	public void setMobileNo(String mobileNo) {
//		this.mobileNo = mobileNo;
//	}

	public String getEmailId() {
		return emailId;
	}

//	public void setEmailId(String emailId) {
//		this.emailId = emailId;
//	}

//	public float getLuggage() {
//		return luggage;
//	}

//	public void setLuggage(float luggage) {
//		this.luggage = luggage;
//	}

//	public float getExtraLuggage() {
//		return extraLuggage;
//	}

//	public void setExtraLuggage(float extraLuggage) {
//		this.extraLuggage = extraLuggage;
//	}

	@Override
	public String toString() {
		return "Passenger :\n\tname=" + name + "\n\tage=" + age + "\n\tmobileNo=" + mobileNo + "\n\temailId=" + emailId;
	}
	
}
