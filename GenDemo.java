//Пример обобщенного класса
class Gen <T> {
	//щбъявление ссылки на объект обобщенного типа
	T ob;

	//Конструктор
	Gen(T o) {
		ob = o;
	}
	//Методы для проверки информации об объектах
	T getOb() {
		return ob;
	}

	void showType() {
		System.out.println("Тип Т: " + ob.getClass().getName());

	}
}
class GenDemo {
	public static void main(String[] args) {
		//объявили переменную класса Gen
		Gen <Integer> iOb;
		//Создаем объект
		iOb = new Gen <Integer> (100);
		//Ошибочное использование 
		//iOb = new Gen <Integer> (100.0);

		iOb.showType();
		int v = iOb.getOb();
		System.out.println("Значение v: " + v);
		System.out.println();

		//объявили переменную класса Gen
                Gen <Double> dOb;
                //Создаем объект
                dOb = new Gen <Double> (100.00);
                //Ошибочное использование
                //iOb = new Gen <Integer> (100.0);

                dOb.showType();
                double x = dOb.getOb();
                System.out.println("Значение x: " + x);
                System.out.println();

		Gen <String> sOb;
		sOb = new Gen<>("Строка");
		sOb.showType();
		String s = sOb.getOb();
		System.out.println("Значение s: " + s);
		System.out.println();

		//Неверное присваивание несовместимых объектов
		//dOb = iOb;

	}
}
