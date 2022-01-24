package com.hi5.laundromat.service.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hi5.laundromat.dto.WashDetailsDTO;
import com.hi5.laundromat.entity.WashDetails;
import com.hi5.laundromat.repository.WashDetailsRepository;
import com.hi5.laundromat.service.WashService;
import com.hi5.laundromat.service.WhatsAppService;

@Service
public class WashServiceImpl implements WashService {

	@Autowired
	private WashDetailsRepository washDetailsRepository;

	@Autowired
	private WhatsAppService whatsAppService;

	@Override
	public void addWash(WashDetailsDTO washDetailsDTO) {

		WashDetails washDetails = new WashDetails();
		washDetails.setTokenNumber(washDetailsDTO.getTokenNumber());
		washDetails.setCustomerName(washDetailsDTO.getCustomerName());
		washDetails.setMobileNumber(washDetailsDTO.getMobileNumber());
		washDetails.setWeight(washDetailsDTO.getWeight());
		washDetails.setIsExpressWash(washDetailsDTO.getIsExpressWash());
		washDetails.setModeOfPayment(washDetailsDTO.getModeOfPayment());
		washDetailsRepository.save(washDetails);

		// TODO create whats app template message

		// TODO send WhatsApp message
		whatsAppService.sendMessage();

	}

}
