package test01;

public class Demo1 {
    private String _user;
    private String _pwd;


    public Demo1() {
    }

    public Demo1(String _user, String _pwd) {
        this._user = _user;
        this._pwd = _pwd;
    }



    /**
     * 获取
     * @return _user
     */
    public String get_user() {
        return _user;
    }

    /**
     * 设置
     * @param _user
     */
    public void set_user(String _user) {
        this._user = _user;
    }

    /**
     * 获取
     * @return _pwd
     */
    public String get_pwd() {
        return _pwd;
    }

    /**
     * 设置
     * @param _pwd
     */
    public void set_pwd(String _pwd) {
        this._pwd = _pwd;
    }

    public String toString() {
        return "test01.Demo1{_user = " + _user + ", _pwd = " + _pwd + "}";
    }
}
