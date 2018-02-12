

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class Listener implements ServletContextListener {

	@Override
	public void contextDestroyed(ServletContextEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void contextInitialized(ServletContextEvent event) {
		System.setProperty("webApp", event.getServletContext().getRealPath("/"));
		System.out.println(event.getServletContext().getRealPath("/"));
		System.setProperty("user.dir","/home/dev/Documents/my_work_new/Experiments/Experiments/Log4j_Maven");
		
	}

}
