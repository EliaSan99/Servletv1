
package servlet;

import beans.Dato;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class SProcesar extends HttpServlet {
    
    
    public Dato dato[]=new Dato[10];
    private int cont =0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

      
       
        if(request.getParameter("btnRegistrar")!=null)
        {
            
            dato[cont]=new Dato();
            dato[cont].setMatricula(request.getParameter("tfMatricula"));
            dato[cont].setNombre(request.getParameter("tfNombre"));
            dato[cont].setApellidos(request.getParameter("tfApellidos"));
            dato[cont].setDdi(Integer.parseInt(request.getParameter("tfDdi")));
            dato[cont].setDwi(Integer.parseInt(request.getParameter("tfDwi")));
            dato[cont].setEcbd(Integer.parseInt(request.getParameter("tfEcbd")));
            dato[cont].promediar();
            cont++;
        }
        
        if(request.getParameter("btnRegistrar")!= null)
        {
            out.println("" +
            "<link rel=\"stylesheet\" href=\"css/Styles.css\">\n"+
            "<div id='frame'>"+
            " <table class = 'table' border= '1' cellspacing= '0'> " +
            "   <thead>"  +
            "       <tr>"  +
            "            <th>Matricula</th>" +
            "            <th>Nombre del Alumno</th>" +
            "            <th>DDI</th>" +
            "            <th>DWI</th>" +
            "            <th>ECBD</th>" +
            "            <th>Prom</th>" +
            "        </tr>" +
            "    </thead>"  +
            "</div>"        +
            "     <tbody>"  );
            
            for(int i=0;i<cont;i++)
            {
                out.println("" +
            " <tr>" +
            "    <td>"+ dato[i].getMatricula() +"</td>" +
            "    <td>"+ dato[i].getNombre()    + " " + dato[i].getApellidos()+"</td>" +
            "    <td>"+ dato[i].getDdi()       +"</td>" +
            "    <td>"+ dato[i].getDwi()       +"</td>" +
            "    <td>"+ dato[i].getEcbd()      +"</td>" +
            "    <td>"+ dato[i].getprom()      +"</td>" +
            " </tr>");
            }
            out.println("" +
            "    </tbody>" +
            "    </table>");
        }
        
        }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
 
 
}