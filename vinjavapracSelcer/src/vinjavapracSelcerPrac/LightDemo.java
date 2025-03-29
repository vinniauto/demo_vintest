package vinjavapracSelcerPrac;

class Light{
	boolean isOn;
	void turnOn(){
		isOn=true;
	}
	void turnOff(){
		isOn=false;
	}
}

public class LightDemo {

	public static void main(String[] args) {
		Light light1=new Light();
		Light light2=new Light();
		light1.turnOn();
		System.out.println(light1.isOn);
		light1.turnOff();
		System.out.println(light1.isOn);
		System.out.println(light2.isOn);	
	}

}
