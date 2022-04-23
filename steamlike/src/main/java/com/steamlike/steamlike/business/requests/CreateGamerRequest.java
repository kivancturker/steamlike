package com.steamlike.steamlike.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateGamerRequest {
	
	private String email;
	
	private String password;
	
	private String firstName;

	private String lastName;

	private String ssn;
	
	private int dateOfBirth;
}
