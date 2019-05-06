/**
 * 
 */
package com.mc.main.entity;

/**
 * @author SAMARESH
 *
 */
public class Temperature {
	private long uuid;
	private int temperature;
	String date;

	public long getUuid() {
		return uuid;
	}

	public void setUuid(long uuid) {
		this.uuid = uuid;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
