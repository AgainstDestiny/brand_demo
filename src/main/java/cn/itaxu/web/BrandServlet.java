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
@WebServlet("/BrandServlet")
public class BrandServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        // 1.调用BrandService完成查询
        BrandService brandService = new BrandService();
        List<Brand> brands = brandService.selectAll();

    }
}
