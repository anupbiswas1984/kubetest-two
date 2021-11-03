package com.kubetesttwo.controllers;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstController {

	@GetMapping({"/","/info"})
	public String methodOne() {
		String returnmessage = "";
		try {
			String hostname = InetAddress.getLocalHost().getHostAddress();
			String hostAddress = InetAddress.getLocalHost().getHostName();
			returnmessage = "hostname: "+ hostname + " hostAddress: " + hostAddress;
		} catch (UnknownHostException e) {
			returnmessage = "error";
			e.printStackTrace();
		}
		return "kubetesttwo::firstmethod::"+ returnmessage;
	}
}
