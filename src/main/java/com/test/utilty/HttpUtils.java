package com.test.utilty;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletResponse;

public class HttpUtils {

	public static void writeToPage(HttpServletResponse response, String str) {
		try {

			response.setHeader("Content-type", "application/json;charset=UTF-8");
			response.setCharacterEncoding("UTF-8");
			PrintWriter write = response.getWriter();

			// write.flush();
			write.write(str);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
