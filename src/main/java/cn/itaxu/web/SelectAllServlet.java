package cn.itaxu.web;

import cn.itaxu.pojo.Brand;
import cn.itaxu.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

/**
 * @Description: ${PACKAGE_NAME}
 * @author: Axu
 * @date:2022/11/4 21:13
 */
@WebServlet("/SelectAllServlet")
public class SelectAllServlet extends HttpServlet {
   private BrandService brandService = new BrandService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1.调用BrandService完成查询
        List<Brand> brands = brandService.selectAll();

        // 2.存入request域中
        request.setAttribute("brands",brands);

        // 3.转发到brand.jsp
        request.getRequestDispatcher("brand.jsp").forward(request,response);


    }
}
