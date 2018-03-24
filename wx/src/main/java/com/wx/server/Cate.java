package com.wx.server;

import java.util.ArrayList;

public class Cate {
	private int cate_id;
	private String cate_name;
	private boolean ishaveChild;
	private ArrayList<Children> children;

	public Cate(int cate_id, String cate_name, boolean ishaveChild, ArrayList<Children> children) {
		super();
		this.cate_id = cate_id;
		this.cate_name = cate_name;
		this.ishaveChild = ishaveChild;
		this.children = children;
	}

	public int getCate_id() {
		return cate_id;
	}

	public void setCate_id(int cate_id) {
		this.cate_id = cate_id;
	}

	public String getCate_name() {
		return cate_name;
	}

	public void setCate_name(String cate_name) {
		this.cate_name = cate_name;
	}

	public boolean isIshaveChild() {
		return ishaveChild;
	}

	public void setIshaveChild(boolean ishaveChild) {
		this.ishaveChild = ishaveChild;
	}

	public ArrayList<Children> getChildren() {
		return children;
	}

	public void setChildren(ArrayList<Children> children) {
		this.children = children;
	}

}
