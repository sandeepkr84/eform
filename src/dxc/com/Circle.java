package dxc.com;

public class Circle {
	private String Type;
	
	public String getType() {
		return Type;
	}

	public void setType(String type) {
		Type = type;
	}

	public void draw(){
		System.out.println(Type+" Type Circle Drawn");
	}

}
