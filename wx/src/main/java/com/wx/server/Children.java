package com.wx.server;

public class Children {

	private int child_id;
	private String name;
	private String image;

	public Children(int child_id, String name, String image) {
		super();
		this.child_id = child_id;
		this.name = name;
		this.image = image;
	}

	public int getChild_id() {
		return child_id;
	}

	public void setChild_id(int child_id) {
		this.child_id = child_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

}
