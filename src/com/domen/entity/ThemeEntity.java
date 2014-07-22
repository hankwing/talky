package com.domen.entity;

import android.graphics.drawable.Drawable;

public class ThemeEntity {
	private String name;
	private String introduce;
	private Drawable picture;
	private String temp;
	public ThemeEntity(String name,String introduce,Drawable picture) {
		// TODO Auto-generated constructor stub
		this.name = name;
		this.introduce = introduce;
		this.picture = picture;
	}
	public ThemeEntity(){
		this.introduce = null;
		this.name = null;
		this.picture = null;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the introduce
	 */
	public String getIntroduce() {
		return introduce;
	}
	/**
	 * @param introduce the introduce to set
	 */
	public void setIntroduce(String introduce) {
		this.introduce = introduce;
	}
	/**
	 * @return the picture
	 */
	public Drawable getPicture() {
		return picture;
	}
	/**
	 * @param picture the picture to set
	 */
	public void setPicture(Drawable picture) {
		this.picture = picture;
	}
	/**
	 * @return the temp
	 */
	public String getTemp() {
		return temp;
	}
	/**
	 * @param temp the temp to set
	 */
	public void setTemp(String temp) {
		this.temp = temp;
	}
	
}