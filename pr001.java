class pr001 {
	public static void main(String args[]) {
		System.out.println("Первая java программа" );
		//Преобразование типо
		
		// Целые типы данных
		byte b; // 8 бит
		b = -128;
		b = 127;
		b = (byte)130;
	        System.out.println(b);	
		short sh; // 16 бит
		sh = (short) 65536;
		int intg; //32 бита
		long l; //64 бита
		intg = 2000000000;
		l = intg;
		intg = intg*intg*intg;
		System.out.println(intg);
		l = l*l*l;
		System.out.println(l);
			
		//Вещественные типы
		float f; //32 бита
		double dd; //64 бита
		sh = b;
		b = (byte)sh;
		dd = 1.5;
		intg = (int)dd;
		dd = (double)10/3;
		f = intg;
		System.out.println(intg + "   " + dd);

		//Символьный тип данных
		char ch; //16 бит
		ch = 'А';
		ch++; ++ch;
		ch = (char)48;
		for (int i=0; i<68; i++)
			System.out.print(ch++ + " ");
		System.out.println();
		ch = '0';
		System.out.println(((int)ch));

		//Логический тип
		boolean bool, bool2 = false;
		bool = true;
		System.out.println(!bool);
		System.out.println(bool && bool2);
		System.out.println(bool || bool2);
		System.out.println(bool ^ bool2);
		System.out.println("Перевод строки\n" + "Табуляция\t" + "\"Кавычки в строке\"" + (!bool & (bool2 | bool)));
		ch = '\'';


	}

}
