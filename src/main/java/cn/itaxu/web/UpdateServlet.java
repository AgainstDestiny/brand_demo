package cn.itaxu.web;

import cn.itaxu.pojo.Brand;
import cn.itaxu.service.BrandService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${PACKAGE_NAME}
 * @author: Axu
 * @date:2022/11/5 9:56
 */
@WebServlet("/UpdateServlet")
public class UpdateServlet extends HttpServlet {
    private BrandService service = new BrandService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决POST请求中文乱码问题
        request.setCharacterEncoding("UTF-8");
        // 1.接收提交过来的表单数据
        String id = request.getParameter("id");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        // 2.封装对象
        Brand brand = new Brand(Integer.parseInt(id), brandName, companyName, Integer.parseInt(ordered), description,
                Integer.parseInt(status));
        // 3.调用service
        service.update(brand);
        // 4.转发到SelectAllServlet
        request.getRequestDispatcher("/SelectAllServlet").forward(request,response);
    }
}
