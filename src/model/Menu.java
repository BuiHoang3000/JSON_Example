package model;

import java.util.List;

public class Menu {
	private String header;
	private List<Item> items;
	
	public String getHeader() {
		return header;
	}

	public void setHeader(String header) {
		this.header = header;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

	public Menu() {
		super();
	}

	public Menu(String header, List<Item> items) {
		super();
		this.header = header;
		this.items = items;
	}

	public String toString() {
		return String.format("header:%s,items:%s", header, items);
	}
}
