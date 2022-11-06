package cn.itaxu.web;

import cn.hutool.captcha.LineCaptcha;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${PACKAGE_NAME}
 * @author: Axu
 * @date:2022/11/5 14:15
 */
@WebServlet("/CaptchaServlet")
public class CaptchaServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("image/jpg");
        // 生成验证码
        LineCaptcha captcha = new LineCaptcha(80,30,4,50);
        request.getSession().setAttribute("code",captcha.getCode());
        ServletOutputStream outputStream = response.getOutputStream();
        captcha.write(outputStream);
    }
}
