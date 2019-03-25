package com.exampl;

public class Test {

	public static void main(String[] args) {

		System.out.println("Czeœæ tu Robert !!!");

		Helper helper = new Helper();
		helper.liczba = 3;
		Printer.print(helper.potegaLiczby());
	}

}
