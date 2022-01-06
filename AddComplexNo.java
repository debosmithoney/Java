public class AddComplexNo {

	public static void main(String[] args) {

		ComplexNo C1 = new ComplexNo();
		C1.set(3f, 2f);
		System.out.println("Complex number 1 : " + C1.real + " + i" + C1.imaginary);

		ComplexNo C2 = new ComplexNo();
		C2.set(6f, 5f);

		System.out.println("Complex number 2 : " + C2.real + " + i" + C2.imaginary);

		ComplexNo C3 = new ComplexNo();
		C3 = C3.sum(C1, C2);
		C3.disp();
	}
}

class ComplexNo {
	ComplexNo t;
	float real, imaginary;

	ComplexNo() {
	}

	void set(float tempReal, float tempImaginary) {
		real = tempReal;
		imaginary = tempImaginary;
	}

	ComplexNo sum(ComplexNo C1, ComplexNo C2) {
		ComplexNo temp = new ComplexNo();

		temp.real = C1.real + C2.real;
		temp.imaginary = C1.imaginary + C2.imaginary;

		this.t = temp;
		return temp;
	}

	void disp() {
		System.out.println("Sum of complex number : " + real + " " + "+ " + imaginary + "i");
	}
}