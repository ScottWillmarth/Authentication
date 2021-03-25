package com.example.Authentication;


import com.example.Authentication.entities.User;
import com.example.Authentication.repositories.UserRepository;
import com.example.Authentication.services.UserService;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class EntityTests {

	@Test
	public void WhenSetPassword_CheckGetPassword() 
	{
		User testUser = new User();
		
		testUser.setPassword("mypassword");
		assertEquals(testUser.getPassword(),"mypassword");
	}
	
	@Test
	public void WhenSetId_CheckGetId() 
	{
		User testUser = new User();
		
		testUser.setId(13);
		assertEquals(testUser.getId(),13);
	}
	
	@Test
	public void WhenSetName_CheckGetName() 
	{
		User testUser = new User();
		
		testUser.setName("myname");
		assertEquals(testUser.getName(),"myname");
	}
}
