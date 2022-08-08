package org.sample2;

public class MyPhone {
	
	private void phoneName() {
		
		System.out.println("My Phone Name is Motorola");
	}
	
	private void phoneCamera() {
		
		System.out.println("My Phone Camera is 64 mega pixal");
	}
	
	private void phoneStorage() {
		
		System.out.println("My Phone Storage is 128GB");
	}
	
	private void phoneOs() {
		
		System.out.println("My Phone OS is Android 11");
	}
	
	public static void main(String[] args) {
		
		MyPhone mp = new MyPhone();
		
		mp.phoneName();
		mp.phoneCamera();
		mp.phoneStorage();
		mp.phoneOs();
	}

}
