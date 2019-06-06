package entity;

/**
 * @Name StatusCode
 * @Description  状态码
 * @Auther Yudachi
 * @Craetetime 2019-03-18-21:59
 * @Version 1.0
 **/
public class StatusCode {
    //成功
    public static final int OK = 20000;
    //失败
    public static final int ERROR = 20001;
    //用户名或密码错误
    public static final int LOGINERROR = 20002;
    //权限不足
    public static final int ACCESSERROR = 20003;
    //远程调用失败
    public static final int REMOTEERROR = 20004;
    //重复操作
    public static final int REPERROR = 20005;
}