package mum.edu.validator;

import java.util.ArrayList;
import java.util.List;

import mum.edu.domain.Calculator;

public class CalculatorValidatorImpl implements CalculatorValidator {

	@Override
	public List<String> validate(Object object) {
		List<String> errors = new ArrayList<String>();
		System.out.println("inside validate");
		Calculator calc = (Calculator) object;
		Integer inputadd1 = calc.getInputadd1();
		System.out.println(inputadd1);
		Integer inputadd2 = calc.getInputadd2();
		Integer inputmul1 = calc.getMul1();
		Integer inputmul2 = calc.getMul2();
		System.out.println("......");
		System.out.println("......");
		if (inputadd1==null || inputadd2==null) {
			System.out.println("Enter all input fields1");
			errors.add("Enter all input fields");
		}
		if (inputmul1==null || inputmul2==null) {
			System.out.println("Enter all input fields2");
			errors.add("Enter all input fields");
		}
		System.out.println("errors returninng");
		return errors;
	}

}
