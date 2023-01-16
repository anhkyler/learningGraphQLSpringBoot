package com.example.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.exception.ApiRequestException;

@RestController
public class TestingController {

	@GetMapping("/sample")
	public String sampleReq() {
		throw new ApiRequestException("oops");
	}
}
