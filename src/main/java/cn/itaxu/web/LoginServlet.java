package cn.itaxu.web;

import cn.itaxu.pojo.User;
import cn.itaxu.service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLEncoder;

/**
 * @Description: ${PACKAGE_NAME}
 * @author: Axu
 * @date:2022/11/5 17:27
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
    private UserService service = new UserService();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // 解决POST请求中文乱码问题
        request.setCharacterEncoding("UTF-8");
        // 接收表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String nickname = request.getParameter("nickname");
        String gender = request.getParameter("gender");
        String remember = request.getParameter("remember");
        // 封装对象
        User user = new User();
        user.setName(username);
        user.setPassword(password);
        user.setNickName(nickname);
        user.setGender(gender);
        // 调用service
        User u = service.select(user);
        response.setContentType("text/html;charset=utf8");
        PrintWriter writer = response.getWriter();
        if (u != null) {
            if ("1".equals(remember)) {
                // 勾选了记住我

                // 1.创建Cookie
                Cookie c_username = new Cookie("username",username);
                Cookie c_password = new Cookie("password",password);
                Cookie c_nickname = new Cookie("nickname",nickname);
                String encode = URLEncoder.encode(gender, "UTF-8");
                Cookie c_gender = new Cookie("gender",encode);

                // 设置Cookie存活时间 1天
                c_username.setMaxAge(3600*24);
                c_password.setMaxAge(3600*24);
                c_nickname.setMaxAge(3600*24);
                c_gender.setMaxAge(3600*24);

                // 2.发送
                response.addCookie(c_username);
                response.addCookie(c_password);
                response.addCookie(c_nickname);
                response.addCookie(c_gender);
            }
            request.setAttribute("success",username+"欢迎您!");
            request.getRequestDispatcher("/SelectAllServlet").forward(request,response);
        } else {
            request.setAttribute("errMsg", "用户名或密码错误!");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        }
    }
}
