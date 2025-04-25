package chatGPT2;

	public class Fraction {

		private int num1;
		private int num2;
		private int result;
		//addition method
		public int addMethod(int num1, int num2) {
		result = num1 + num2;
		return result;
		}

		//substraction method
		public int subMethod(int num1, int num2) {
		result = num1 - num2;
		return result;
		}

		//multiplication method
		public int multMethod(int num1, int num2) {
		result = num1 * num2;
		return result;
		}

		//division method
		public int divMethod(int num1, int num2) {
		result = num1 / num2;
		return result;
		}

		//bonus: remainder method
		public int modMethod(int num1, int num2) {
		result = num1 % num2;
		return result;
		}
	// constructors
		public Fraction() {
			this(0,1);}

			public Fraction(int num1, int num2) {
			this.num1 = num1;
			this.num2 = num2;
			}
}
