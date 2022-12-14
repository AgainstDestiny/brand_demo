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
 * @date:2022/11/4 22:50
 */
@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    private BrandService brandService = new BrandService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决POST请求中文乱码问题
        request.setCharacterEncoding("UTF-8");
        // 1.接收表单数据
        String id = request.getParameter("id");
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        String ordered = request.getParameter("ordered");
        String description = request.getParameter("description");
        String status = request.getParameter("status");
        // 封装User对象
        Brand brand = new Brand();
        brand.setId(Integer.parseInt(id));
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(Integer.parseInt(ordered));
        brand.setDescription(description);
        brand.setStatus(Integer.parseInt(status));
        // 调用BrandMapper.add()
        brandService.add(brand);
        // 转发到查询所有的SelectAllServlet
        request.getRequestDispatcher("/SelectAllServlet").forward(request,response);
    }
}
