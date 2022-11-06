package cn.itaxu.pojo;

/**
 * @Description: cn.itaxu.pojo
 * @author: Axu
 * @date:2022/11/2 21:24
 */
public class User {
    private Integer id;
    private String name;
    private String nickName;
    private String password;
    private String gender;
    private Integer status;

    public User() {
    }

    public User(Integer id, String name, String password, String gender, Integer status, String nickName) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.gender = gender;
        this.status = status;
        this.nickName = nickName;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getStatusStr(){
        if (status!=null){
          return status == 0 ? "正常":"异常";
        }
        return "未知";
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", nickName='" + nickName + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", status=" + status +
                '}';
    }
}
