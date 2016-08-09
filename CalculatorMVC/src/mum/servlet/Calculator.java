package mum.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Calculator
 */
@WebServlet("/Calculator")
public class Calculator extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Calculator() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        int sum = 0;
		int product = 0;
		boolean addtionEmpty = true;
		boolean multiplyEmpty = true;
		String value1, value2, value3, value4, dispSum, dispProduct;
        String input1 = request.getParameter("input1");
		String input2 = request.getParameter("input2");
		String input3 = request.getParameter("input3");
		String input4 = request.getParameter("input4");
		
		if (!(input1.isEmpty() || input2.isEmpty())) {
			addtionEmpty = false;
			sum = Integer.parseInt(input1) + Integer.parseInt(input2);
		}
		if (!(input2.isEmpty() || input3.isEmpty())) {
			multiplyEmpty = false;
			product = Integer.parseInt(input3) * Integer.parseInt(input4);
		}

		if (input1.trim().equals(""))
			value1 = "value = ''";
		else
			value1 = "value = " + input1;
		if (input2.trim().equals(""))
			value2 = "value = ''";
		else
			value2 = "value = " + input2;
		if (input3.trim().equals(""))
			value3 = "value = ''";
		else
			value3 = "value = " + input3;
		if (input4.trim().equals(""))
			value4 = "value = ''";
		else
			value4 = "value = " + input4;
		if (addtionEmpty)
			dispSum = "value = ''";
		else
			dispSum = "value = " + sum;
		if (multiplyEmpty)
			dispProduct = "value = ''";
		else
			dispProduct = "value = " + product;
		
		request.setAttribute("input1", input1);
		request.setAttribute("input2", input2);
		request.setAttribute("input3", input3);
		request.setAttribute("input4", input4);
		request.setAttribute("output1", sum);
		request.setAttribute("output2", product);
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("result.jsp");
        dispatcher.forward(request, response);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
