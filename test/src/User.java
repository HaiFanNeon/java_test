public class User {
    private String _username;
    private String _pwd;
    private String _email;


    public User() {
    }

    public User(String _username, String _pwd, String _email) {
        this._username = _username;
        this._pwd = _pwd;
        this._email = _email;
    }

    /**
     * 获取
     * @return _username
     */
    public String get_username() {
        return _username;
    }

    /**
     * 设置
     * @param _username
     */
    public void set_username(String _username) {
        this._username = _username;
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

    /**
     * 获取
     * @return _email
     */
    public String get_email() {
        return _email;
    }

    /**
     * 设置
     * @param _email
     */
    public void set_email(String _email) {
        this._email = _email;
    }

//    public String toString() {
//        return "User{_username = " + _username + ", _pwd = " + _pwd + ", _email = " + _email + "}";
//    }
}
