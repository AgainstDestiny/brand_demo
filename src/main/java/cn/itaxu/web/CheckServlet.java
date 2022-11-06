package cn.itaxu.web;

import cn.itaxu.pojo.User;
import cn.itaxu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @Description: ${PACKAGE_NAME}
 * @author: Axu
 * @date:2022/11/5 16:25
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
    UserService service = new UserService();
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决POST请求乱码问题
        request.setCharacterEncoding("UTF-8");
        Object code = request.getSession().getAttribute("code");
        String s = code.toString();
        String ch = request.getParameter("captcha");
        // 获取表单数据
        String username = request.getParameter("username");
        String nickname = request.getParameter("nickname");
        String gender = request.getParameter("gender");
        String password = request.getParameter("password");
        // 封装对象
        User user = new User();
        user.setName(username);
        user.setNickName(nickname);
        user.setGender(gender);
        user.setPassword(password);
        // 调用service
        boolean flag = service.register(user);
            if (s.equals(ch)) {
                if (flag) {
                    request.setAttribute("success", "注册成功!");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                }else {
                    request.setAttribute("str", "用户名已被占用!");
                    request.getRequestDispatcher("register.jsp").forward(request, response);
                }
            }else {
                request.setAttribute("str", "验证码错误!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }

    }
}
