package com.cc4.web.services.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.cc4.web.model.Hotel;
import com.cc4.web.services.SearchResultService;
import com.mx.posadas.xdist.core.entity.hotel.HotelAvailRS;
import com.mx.posadas.xdist.core.entity.hotel.RoomStay;
import com.mx.posadas.xdist.core.entity.hotel.vendor.Paragraph;
import com.mx.posadas.xdist.core.entity.hotel.vendor.VendorMessage;

@Service
public class SearchResultServiceImpl extends XDistWSImpl implements SearchResultService {

	
	@Override
	public List<Hotel> searchHotelsAvail() {
		
		HotelAvailRS rs = this.executor();
	
		Hotel hotel = null;
		List<Hotel> hoteles = new ArrayList<Hotel>();
		
		for(RoomStay roomStay : rs.getRoomStays().getRoomStays()){
			hotel = new Hotel();
			hotel.setId(roomStay.getReference());
			hotel.setName(roomStay.getBasicPropertyInfo().getOJhotelName());
			hotel.setCode(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getHotelCode());
			
			for(VendorMessage vendorMessage: roomStay.getBasicPropertyInfo().getVendorMessages().getVendorMessages()){
				if(vendorMessage.getSubSection().getSubTitle().equals("HotelImage")){
					for(Paragraph paragraph : vendorMessage.getSubSection().getParagraphs()){
						if(paragraph.getContentData().equals("small")){
							hotel.setImage(paragraph.getUrl().getValue());
						}
					}

				}
			}
			if(roomStay.getRoomRates().getRoomRates()!=null){
				hotel.setPuntos(Double.parseDouble(roomStay.getRoomRates().getRoomRates().get(0).getRates().getRate().getBase().getAmountAfterTax()));
			}
			
			hotel.setRating(Integer.parseInt(roomStay.getBasicPropertyInfo().getAffiliationInfo().getAwards().getAwards().get(0).getRating()));
			
			
			hoteles.add(hotel);
		}
		
		
		
		return hoteles;
	}

	
	
}
