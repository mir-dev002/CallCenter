<OTA_HotelAvailRQ xmlns="http://www.opentravel.org/OTA/2003/05" MaxResponses="100" PackageType="H" PrimaryLangID="es" SearchCacheLevel="The Front Door" SupplierDirect="false" Version="2.006">
	<POS>
		<Source AgentDutyCode="427800" ISOCountry="MX" ISOCurrency="MXN" PseudoCityCode="HOTEL" portal="FAVC">
			<RequestorID ID="favc" Type="1"/>
			<RequestorID ID="FAVC" Type="18"/>
		</Source>
	</POS>
	<AvailRequestSegments>
		<AvailRequestSegment>
			<StayDateRange Duration="2" End="2017-10-28T00:00:00" RangeNum="1" Start="2017-10-26T00:00:00"/>
				<RoomStayCandidates>
					<RoomStayCandidate PromotionCode="" Quantity="1" RPH="1">
						<GuestCounts>
							<GuestCount AgeQualifyingCode="10" Count="2"/>
						</GuestCounts>
					</RoomStayCandidate>
				</RoomStayCandidates>
			<HotelSearchCriteria>
				<Criterion ExactMatch="true">
					<HotelRef HotelCityCode="CITY_CUN_MX" HotelCodeContext="LocationId"/>
				</Criterion>
			</HotelSearchCriteria>
		</AvailRequestSegment>
	</AvailRequestSegments>
</OTA_HotelAvailRQ>