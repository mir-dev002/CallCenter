package com.mx.posadas.xdist.core.entity.hotel;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="TimeSpan")
public class TimeSpan {
	
	private String duration;
	private String end;
	private String rangeNum;
	private String start;
	
	public String getDuration() {
		return duration;
	}
	@XmlAttribute(name = "Duration")
	public void setDuration(String duration) {
		this.duration = duration;
	}
	public String getEnd() {
		return end;
	}
	@XmlAttribute(name = "End")
	public void setEnd(String end) {
		this.end = end;
	}
	public String getRangeNum() {
		return rangeNum;
	}
	@XmlAttribute(name = "RangeNum")
	public void setRangeNum(String rangeNum) {
		this.rangeNum = rangeNum;
	}
	public String getStart() {
		return start;
	}
	@XmlAttribute(name = "Start")
	public void setStart(String start) {
		this.start = start;
	}
	
}
