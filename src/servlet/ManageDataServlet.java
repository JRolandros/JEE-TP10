package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Bonus;
import dao.BonusDAO;

/**
 * Servlet implementation class ManageDataServlet
 */
@WebServlet("/ManageDataServlet")
public class ManageDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Bonus mBonus;
		if(request.getParameter("ssn1")!=null){
			mBonus=(Bonus)(request.getAttribute("item"));			
			BonusDAO.getInstance().delete(mBonus);
			
			Bonus.listBonus=BonusDAO.getInstance().findAll();
			
			request.setAttribute("bonus", mBonus.listBonus);
			request.getRequestDispatcher("/WEB-INF/bonus.jsp").forward(request, response);
		}
		
	}

}
