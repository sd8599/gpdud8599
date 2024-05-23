package loop;

public class ForFor {
	public static void main(String[] args) {
		
		String s = "*";
		
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 10; j++) {
				System.out.print(s);
			}System.out.println();
		}

		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(s);
			}System.out.println();
		}System.out.println();

		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i; j--) {
				System.out.print(s);
			}System.out.println();
		}
	}
}

//**********
//**********
//**********
//**********
//**********
//
//*
//**
//***
//****
//
//*****
//****
//***
//**
//*





