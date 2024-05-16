class ComplexNumber {
    int realPart;
    int imaginaryPart;

    public ComplexNumber(int real, int imaginary) {
        this.realPart = real;
        this.imaginaryPart = imaginary;
    }

    public void display() {
        System.out.println(this.realPart + " + " + this.imaginaryPart + "i");
    }

    public static ComplexNumber add(ComplexNumber num1, ComplexNumber num2) {
        int realResult = num1.realPart + num2.realPart;
        int imaginaryResult = num1.imaginaryPart + num2.imaginaryPart;
        return new ComplexNumber(realResult, imaginaryResult);
    }

    public static void main(String[] args) {
        ComplexNumber firstNumber = new ComplexNumber(4, 5);
        ComplexNumber secondNumber = new ComplexNumber(10, 5);

        System.out.print("First Complex number: ");
        firstNumber.display();

        System.out.print("Second Complex number: ");
        secondNumber.display();

        ComplexNumber result = ComplexNumber.add(firstNumber, secondNumber);

        System.out.println("Addition is:");
        result.display();
    }
}
