package com.example.PaymentSer;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/aven")
public class AvengersExcution
{
	@GetMapping(path="/getnames")
	public String getallAven()
	{
		return "avengers are here ";
	}
}
