package in.ineuron.controller;

import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		File file = new File("D:\\Servlets\\ResponseInfoApp\\Sagar.JPG");
		FileInputStream fis = new FileInputStream(file);

		byte[] b = new byte[(int) file.length()];
		fis.read(b);

		ServletOutputStream outputStream = response.getOutputStream();

		outputStream.write(b);
		outputStream.flush();
		outputStream.close();

	}

}
