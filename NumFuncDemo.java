class NumericFns<T extends Number> {
	T num;

	NumericFns(T n) {
		num = n;
	}
	double reciprocal() {
		return 1 / num.doubleValue();
	}
	double fraction() {
		return num.doubleValue() - num.intValue();
	}
	boolean absEqual (NumericFns<?> ob) {
		if(Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue()))
			return true;
		return false;
		
	}
}
/*
 * Можно ограничивать классы родственными связами:
 * class Pair <T, V extends T> {
 *	
 * }
 * 
 */
class NumFuncDemo {
	public static void main(String[] args) {
		NumericFns Ob;
		NumericFns<Integer> iOb;
		iOb = new NumericFns<>(5);
		Ob = iOb;

		System.out.println("Обратная величина Ob: " + Ob.reciprocal());
		System.out.println("Дробная часть Ob: " + Ob.fraction());

		NumericFns<Double> dOb = new NumericFns<>(5.2);
		
		Ob = dOb;

		System.out.println("Обратная величина dOb: " + dOb.reciprocal());
                System.out.println("Дробная часть dOb: " + dOb.fraction());

		//Нарушение ограничений на обобщенный тип
		//NumericFns <Char>

		NumericFns<Integer> intOb = new NumericFns<>(7);
		NumericFns<Double> dblOb = new NumericFns<>(-7.0);

		if (intOb.absEqual(dblOb))
			System.out.println("Модули чисел intOb dblOb равны");
		else 
			System.out.println("Модули чисел intOb dblOb не равны");
		if (intOb.absEqual(dOb))
                        System.out.println("Модули чисел равны");
                else
                        System.out.println("Модули чисел не равны");



	}
}
