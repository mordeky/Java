package ch05.sec02.enumer;

//³ÌÐò5-9 TrafficLight.java

enum Signal {
	GREEN, YELLOW, RED
}

public class TestEnum {
	Signal color = Signal.RED;

	public void change() {
		

		switch (color) {
		case RED:
			color = Signal.GREEN;
			break;
		case YELLOW:
			color = Signal.RED;
			break;
		case GREEN:
			color = Signal.YELLOW;
			break;
		}

	}
}
