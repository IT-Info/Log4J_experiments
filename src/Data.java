
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;

@WebServlet("/Data")
public class Data extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private Logger logger = Logger.getLogger(Data.class);
	
	public static int no = 0;
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.getWriter().append("Served at: ").append(request.getContextPath());
		Properties e = System.getProperties();
		Enumeration names = e.propertyNames();
		while(names.hasMoreElements()) {
			String key = (String)names.nextElement();
			System.out.println(key + " : " + e.getProperty(key));
		}
		//ata, bari, chole, dhaniya powder
		for (int i = 1; i < 20; i++) {
			logger.info("This is an info log entry : " + no);
			logger.debug("This is an info log entry : " + no);
			logger.error("This is an error log entry : " + no++);
		}
		
		logger.error("Error message");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
