package api.servlet;

import storage.StroregeFoldersDependence;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "Upload", urlPatterns = {"/Upload"})
public class FileUploader extends HttpServlet {

    protected void processRequest(HttpServletRequest request,
            HttpServletResponse response) {
        try {
            response.setContentType("text/html;charset=UTF-8");
            final String path = request.getParameter("destination");

            new StroregeFoldersDependence().addToStorege(path);

            response.sendRedirect("/Servlet");
        } catch (IOException ex) {
        }
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }

}