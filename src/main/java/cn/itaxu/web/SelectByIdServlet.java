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
@WebServlet("/SelectByIdServlet")
public class SelectByIdServlet extends HttpServlet {
   private BrandService brandService = new BrandService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 1.接收id
        String id = request.getParameter("id");
        // 2.调用service查询
        Brand brand = brandService.selectById(Integer.parseInt(id));
        // 3.存储到request域中
        request.setAttribute("brand", brand);
        // 4.转发到update.jsp中去
        request.getRequestDispatcher("/update.jsp").forward(request,response);

    }
}
