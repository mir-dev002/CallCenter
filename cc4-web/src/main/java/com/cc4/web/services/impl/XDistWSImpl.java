package com.cc4.web.services.impl;

import org.springframework.stereotype.Service;

import com.cc4.web.services.XDistWS;
import com.mx.posadas.core.ctes.RQ;
import com.mx.posadas.core.utils.XDistService;
import com.mx.posadas.xdist.core.entity.hotel.HotelAvailRS;

@Service
public class XDistWSImpl implements XDistWS{

	@Override
	public HotelAvailRS executor() {
		
		XDistService<HotelAvailRS> xDist = new XDistService<HotelAvailRS>(new HotelAvailRS(), RQ.HOTEL_AVAIL);
		HotelAvailRS rs = xDist.executor();
		
		return  rs;
	}

}
