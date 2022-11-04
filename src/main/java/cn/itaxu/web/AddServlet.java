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
        // 解决中文乱码问题
        request.setCharacterEncoding("UTF-8");
        // 1.接收表单数据
        Integer id = Integer.valueOf(request.getParameter("id"));
        String brandName = request.getParameter("brandName");
        String companyName = request.getParameter("companyName");
        Integer ordered = Integer.valueOf(request.getParameter("ordered"));
        String description = request.getParameter("description");
        // 封装User对象
        Brand brand = new Brand();
        brand.setId(id);
        brand.setBrandName(brandName);
        brand.setCompanyName(companyName);
        brand.setOrdered(ordered);
        brand.setDescription(description);
        // 调用BrandMapper.add()
        int count = brandService.add(brand);
        if (count != 1){
            System.out.println("添加成功!");
        }else {
            System.out.println("添加失败!");
        }
    }
}
