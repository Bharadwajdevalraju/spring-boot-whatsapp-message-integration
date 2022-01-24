package com.hi5.laundromat.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hi5.laundromat.dto.WashDetailsDTO;
import com.hi5.laundromat.service.WashService;

@RequestMapping("/hi5/services/")
@RestController
public class BaseController {

	@Autowired
	private WashService washService;

	@PostMapping("/v1/addWash")
	ResponseEntity<?> addWash(@RequestBody WashDetailsDTO washDetailsDTO) {

		if (washDetailsDTO.getTokenNumber() == null)
			return new ResponseEntity<>("Invalid Token Number", HttpStatus.BAD_REQUEST);
		try {
			washService.addWash(washDetailsDTO);
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		
	}

}
