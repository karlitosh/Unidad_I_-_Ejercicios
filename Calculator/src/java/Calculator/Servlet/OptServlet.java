/*
*Nombre: OptServlet.java
*Objetivo: WebServices (GlassFish)
           Formulario html + jsp que calcula las 4 operaciones aritmeticas
           básicas en un Servlet de Java.
*Autor: Ing. Carlos Alberto Cásares Farías
*Fecha: 07/11/2015
 */
package Calculator.Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Karlitosh
 */
public class OptServlet extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        //crear objeto java tipo calculator
        //con las operaciones
        Calculator calc = new Calculator();
        
        //recibir valores del index
        String vNum1 = request.getParameter("num1");
        String vNum2 = request.getParameter("num2");
        String vOperator = request.getParameter("opt");
        
        //convertir cadena a numero
        int a = Integer.parseInt(vNum1);
        int b = Integer.parseInt(vNum2);
        
        //variable para colocar el resultado
        int result = -1;
        
        //realizar operacion matematica
        if (vOperator.equals("+"))
            result=calc.sumar(a,b);
        else if (vOperator.equals("-"))
            result=calc.restar(a,b);
        else if (vOperator.equals("x"))
            result=calc.multiplicar(a,b);
        else if (vOperator.equals("/"))
            result=calc.dividir(a,b);
        
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet OptServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet OptServlet at " + request.getContextPath() + "</h1>");
            
            //imprimir el resultado
            //out.println("El resultado de " + vNum1 + vOperator + vNum2 + " es: " + result);
            
            //enviar el resultado a un formulario jsp
            //solo enviamo la variable resultado
            RequestDispatcher rd = request.getRequestDispatcher("Resultados.jsp");
            
            //enviar los atributos al otro formulario
            request.setAttribute("message","Enviando los resultados del Servlet al formulario Resultados - jsp");
            request.setAttribute("vNum1",vNum1);
            request.setAttribute("vNum2",vNum2);
            request.setAttribute("vOperator",vOperator);
            request.setAttribute("vResult",result);
            
            //Instruccion para mandar los atributos
            rd.forward(request, response);
            
            out.println("</body>");
            out.println("</html>");
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
