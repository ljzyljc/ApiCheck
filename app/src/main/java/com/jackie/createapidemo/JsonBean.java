package com.jackie.createapidemo;

import java.util.ArrayList;
public class JsonBean {

	private String id;
	private String name;
	private Info info;

	public static class Info {
		private String uid;
		private ArrayList<String> stuName;

		public String getUid() {
			return uid;
		}

		public void setUid(String uid) {
			this.uid = uid;
		}

		public ArrayList<String> getStuName() {
			return stuName;
		}

		public void setStuName(ArrayList<String> stuName) {
			this.stuName = stuName;
		}
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Info getInfo() {
		return info;
	}

	public void setInfo(Info info) {
		this.info = info;
	}

}

