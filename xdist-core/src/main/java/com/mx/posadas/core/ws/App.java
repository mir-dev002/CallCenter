package com.mx.posadas.core.ws;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import org.w3c.dom.Document;

import com.mx.posadas.core.ctes.RQ;
import com.mx.posadas.core.utils.DocumentUtils;
import com.mx.posadas.core.utils.XDistService;
import com.mx.posadas.xdist.core.entity.hotel.HotelAvailRS;
import com.mx.posadas.xdist.core.entity.hotel.RoomStay;
import com.mx.posadas.xdist.core.entity.hotel.rates.RoomRate;

/**
 * Hello world!
 *
 */
public class App 
{
	
	private static final String HOTEL_AVAIL_RQ = "HotelAvailRQ.xsl";
	private static final String HOTEL_AVAIL_RS = "HotelAvailRS.xsl";
	private static final String VEHICLE_AVAIL_RQ = "VehAvailRateRQ.xml";
	
    public static void main( String[] args )
    {
    	
        	
    	
    	XDistService<HotelAvailRS> xDist = new XDistService<HotelAvailRS>(new HotelAvailRS(), RQ.HOTEL_AVAIL);
    	HotelAvailRS hotel = xDist.executor();
    	
    	 try{

    		/*
    	    Document doc = DocumentUtils.getDocumentXMLResource(HOTEL_AVAIL_RS);
	    	
	        JAXBContext jc = JAXBContext.newInstance( HotelAvailRS.class );
	        Unmarshaller u = jc.createUnmarshaller();
	      
	    	
	    	HotelAvailRS hotel = (HotelAvailRS) u.unmarshal(doc);
	    	*/
	    	
	    	int x = 0;
	    	
	    	System.out.println(hotel);
	    	System.out.println(hotel.getRoomStays());
	    	System.out.println(hotel.getRoomStays().getRoomStays());
	    	System.out.println(hotel.getRoomStays().getRoomStays().get(0).getRoomRates().getRoomRates().size());
	    	
	    	for(RoomStay roomStay: hotel.getRoomStays().getRoomStays()){
	    		
	    		//for(RoomRate roomRate : roomStay.getRoomRates().getRoomRates()){
	    		
	    			/*
	    			System.out.println("-------------------Rate:Base---------------------------------");
	    			System.out.println(roomRate.getRates().getRate().getBase().getAmountAfterTax());
	    			System.out.println(roomRate.getRates().getRate().getBase().getAmountBeforeTax());
	    			System.out.println(roomRate.getRates().getRate().getBase().getCurrencyCode());
	    			System.out.println(roomRate.getRates().getRate().getBase().getOriginalAmountAfterTax());
	    			System.out.println(roomRate.getRates().getRate().getBase().getOriginalAmountBeforeTax());
	    			System.out.println(roomRate.getRates().getRate().getBase().getOriginalCurrencyCode());
	    			System.out.println("-------------------Rate:NightlyRates---------------------------------");
	    			for(NightlyRate nightlyRate : roomRate.getRates().getRate().getNightlyRates().getNightlyRates()){	    				
	    				System.out.println(nightlyRate.getEffectiveDate());
	    				System.out.println(nightlyRate.getAmountAfterTax());
	    				System.out.println(nightlyRate.getAmountBeforeTax());
	    				System.out.println(nightlyRate.getCurrencyCode());	    					    					
	    			}
	    			System.out.println("-------------------Rate:Total---------------------------------");
	    			System.out.println(roomRate.getRates().getRate().getTotal().getAmountAfterTax());
	    			System.out.println(roomRate.getRates().getRate().getTotal().getAmountBeforeTax());
	    			System.out.println(roomRate.getRates().getRate().getTotal().getCurrencyCode());
	    			System.out.println(roomRate.getRates().getRate().getTotal().getOriginalAmountAfterTax());
	    			System.out.println(roomRate.getRates().getRate().getTotal().getOriginalAmountBeforeTax());
	    			System.out.println(roomRate.getRates().getRate().getTotal().getOriginalCurrencyCode());
	    			System.out.println("-------------------Rate:PriceAdjustments---------------------------------");
	    			System.out.println(roomRate.getRates().getRate().getPriceAdjustments().getAmount());
	    			System.out.println(roomRate.getRates().getRate().getPriceAdjustments().getCurrencyCode());
	    			System.out.println(roomRate.getRates().getRate().getPriceAdjustments().getPriceAdjustment().getAmount());
	    			System.out.println(roomRate.getRates().getRate().getPriceAdjustments().getPriceAdjustment().getCode());
	    			System.out.println(roomRate.getRates().getRate().getPriceAdjustments().getPriceAdjustment().getCurrencyCode());
	    			*/
	    			
	    			/*
	    			System.out.println("-------------------Rate:TPAExtensions:Base---------------------------------");
	    			if(roomRate.getRates().getRate().getTpaExtensions()!=null){
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getAmountAfterTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getAmountBeforeTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getCurrencyCode());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getOriginalAmountAfterTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getOriginalAmountBeforeTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getBase().getOriginalCurrencyCode());	    
		    			
		    			System.out.println("-------------------Rate:TPAExtensions:NightlyRates---------------------------------");
		    			for(NightlyRate nightlyRate : roomRate.getRates().getRate().getTpaExtensions().getNightlyRates().getNightlyRates()){	    				
		    				System.out.println(nightlyRate.getEffectiveDate());
		    				System.out.println(nightlyRate.getAmountAfterTax());
		    				System.out.println(nightlyRate.getAmountBeforeTax());
		    				System.out.println(nightlyRate.getCurrencyCode());	    					    					
		    			}
		    			
		    			
		    			System.out.println("-------------------Rate:TPAExtensions:Total---------------------------------");
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getAmountAfterTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getAmountBeforeTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getCurrencyCode());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getOriginalAmountAfterTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getOriginalAmountBeforeTax());
		    			System.out.println(roomRate.getRates().getRate().getTpaExtensions().getTotal().getOriginalCurrencyCode());
		    			
		    			
		    			System.out.println("-------------------Rate:TPAExtensions:Rules---------------------------------");
		    			for(Rule rule : roomRate.getRates().getRate().getTpaExtensions().getRules().getRules()){	
			    			System.out.println(rule.getDescription());
			    			System.out.println(rule.getNightNumber());
		    			}
	    			}
	    			*/
	    			
	    			/*
	    			System.out.println("-------------------TimeSpan---------------------------------");
	    			System.out.println(roomStay.getTimeSpan().getStart());
	    			System.out.println(roomStay.getTimeSpan().getEnd());
	    			System.out.println(roomStay.getTimeSpan().getDuration());
	    			
	    			*/
	    			
	    			/*
	    			System.out.println("-------------------BasicPropertyInfo---------------------------------");
	    			System.out.println(roomStay.getBasicPropertyInfo().getBrandCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getHotelCityCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getOJhotelName());
	    			System.out.println(roomStay.getBasicPropertyInfo().getOJHotelCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getHotelName().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getPosition().getLatitude());
	    			System.out.println(roomStay.getBasicPropertyInfo().getPosition().getLongitude());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getAddressLine().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getArea().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getCityName().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getCountryName().getCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getPostalCode().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getStateProv().getValue());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAddress().getStreetNmbr().getValue());
	    			for(Phone phone : roomStay.getBasicPropertyInfo().getPhones().getPhones()){
	    				System.out.println(phone.getPhoneNumber());
	    				System.out.println(phone.getPhoneUsageType());
	    			}
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getBrandCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getChainCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getEnabled());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getExternal());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getHotelCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getPriority());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getCompanyName().getCode());
	    			System.out.println(roomStay.getBasicPropertyInfo().getAffiliationInfo().getDistribSystems().getDistribSystem().getMarketing().getValue());
	    			
	    			for(VendorMessage vendorMessage : roomStay.getBasicPropertyInfo().getVendorMessages().getVendorMessages()){
	    				if(x==0){
		    				System.out.println("---------------------------------------------");
		    				System.out.println(vendorMessage.getInfoType());
		    				System.out.println(vendorMessage.getSubSection().getSubTitle());
		    				if(vendorMessage.getSubSection().getParagraph()!=null){
			    				System.out.println(vendorMessage.getSubSection().getParagraph().getContentData());
			    				if(vendorMessage.getSubSection().getParagraph().getImage()!=null){
			    					System.out.println(vendorMessage.getSubSection().getParagraph().getImage().getValue());
			    				}
			    				if(vendorMessage.getSubSection().getParagraph().getUrl()!=null){
			    					System.out.println(vendorMessage.getSubSection().getParagraph().getUrl().getValue());
			    				}		
		    				}
	    				
	    				}
	    			}
	    			
	    			x++;
	    			*/
	    			
	    		//}
	    		
	    		
	    		/*
	    		for(RoomType roomType: roomStay.getRoomTypes().getRoomTypes()){
	    			System.out.println(roomStay.getReference());
	    			System.out.println(roomType.getRoomTypeCode());
	    			System.out.println(roomType.getRoomTypeName());
	    			
	    			System.out.println(roomType.getRoomDescription().getText().getValue());
	    			System.out.println(roomType.getRoomDescription().getText().getLanguage());
	    			System.out.println(roomType.getAdditionalDetails().getAdditionalDetail().getDetailDescription().getName());
	    			System.out.println(roomType.getAdditionalDetails().getAdditionalDetail().getDetailDescription().getText().getValue());
	    			
	    			for(VendorMessage vendorMessage : roomType.getTpaExtensions().getVendorMessages().getVendorMessages()){
	    				if(x==0){
	    				System.out.println("---------------------------------------------");
	    				System.out.println(vendorMessage.getSubSection().getSubTitle());
	    				System.out.println(vendorMessage.getSubSection().getParagraph().getContentData());
	    				System.out.println(vendorMessage.getSubSection().getParagraph().getImage().getValue());
	    				System.out.println(vendorMessage.getSubSection().getParagraph().getUrl().getValue());
	    				}
	    			}
	    			
	    			System.out.println(roomStay.getRatePlans().getOJHotelCode());
	    			System.out.println(roomStay.getRatePlans().getRatePlan().getCurrencyCode());
	    			System.out.println(roomStay.getRatePlans().getRatePlan().getSupplierCode());

	    			x++;
	    			System.out.println("-------------------------------------");
	    		}
	    		
	    		*/
	    		
	    		/*
    			System.out.println("-------------------ns1:ExchangeRate---------------------------------");
    			System.out.println(roomStay.getExchangeRate().getDate());
    			System.out.println(roomStay.getExchangeRate().getFromCurrency());
    			System.out.println(roomStay.getExchangeRate().getRate());
    			System.out.println(roomStay.getExchangeRate().getToCurrency());
	    		*/
	    		
    			System.out.println("-------------------ns1:ReportingExchangeRates---------------------------------");
    			System.out.println(roomStay.getReportingExchangeRates().getDate());
    			System.out.println(roomStay.getReportingExchangeRates().getFromCurrency());
    			System.out.println(roomStay.getReportingExchangeRates().getRate());
    			System.out.println(roomStay.getReportingExchangeRates().getToCurrency());
	    		
	    		
	    	}

    	
    	
         } catch (Exception e) {
 			// TODO Auto-generated catch block
 			e.printStackTrace();
 		}
        //SOAPBody body = ConnectionWS.callSoapWebService(HOTEL_AVAIL_RQ);
        /*
        
        try{
        	
	        DOMSource source = new DOMSource(body.getFirstChild());
	        FileWriter writer = new FileWriter(new File("C:\\temp\\document.xml"));
	        StreamResult result = new StreamResult(writer);
	
	        TransformerFactory transformerFactory = TransformerFactory.newInstance();
	        Transformer transformer = transformerFactory.newTransformer();
	        transformer.transform(source, result);
        
        } catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	*/
    	
    	//Document doc = DocumentUtils.getDocumentXMLResource(HOTEL_AVAIL_RS);
    	
        /*
        try {
        	
	    
	        Hotel hotel = (Hotel) Marshallable.unmarshal(body.getFirstChild(), Hotel.class);
	        
    		System.out.println("hotel " + hotel);
    		System.out.println("version " + hotel.getVersion());
        
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
*/
    	
    }
    

    
   
    
}
