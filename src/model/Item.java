package model;

public class Item {
	private String id;
	private String label;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public Item(String id, String label) {
		super();
		this.id = id;
		this.label = label;
	}
	public Item() {
		super();
	}
	
	public String toString() {
		return String.format("id:%s,label:%s", id, label);
	}
}
