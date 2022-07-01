package marketPlace;

import java.net.Socket;

public class MyInfo {
  	public static String first_name;
        public static String last_name;
	public static String email;
	public static String address;
        public static String phone;
        public static String postalcode;
        public static String username;
        public static String pass;
	public static boolean socketConnect = false;
	public static Socket socket;
	public static String onePostNum;
	
 
    public static void setFirst_name(String first_name) {
        MyInfo.first_name = first_name;
    }

    public static void setLast_name(String last_name) {
        MyInfo.last_name = last_name;
    }

    public static void setEmail(String email) {
        MyInfo.email = email;
    }

    public static void setAddress(String address) {
        MyInfo.address = address;
    }

    public static void setPhone(String phone) {
        MyInfo.phone = phone;
    }

    public static void setPostalcode(String postalcode) {
        MyInfo.postalcode = postalcode;
    }

    public static void setUsername(String username) {
        MyInfo.username = username;
    }

    public static void setPass(String pass) {
        MyInfo.pass = pass;
    }

    public static void setConnect(boolean socketConnect) {
        MyInfo.socketConnect = socketConnect;
    }

    public static void setSocket(Socket socket) {
        MyInfo.socket = socket;
    }

    public static void setOnePostNum(String onePostNum) {
        MyInfo.onePostNum = onePostNum;
    }

    public static String getFirst_name() {
        return first_name;
    }

    public static String getLast_name() {
        return last_name;
    }

    public static String getEmail() {
        return email;
    }

    public static String getAddress() {
        return address;
    }

    public static String getPhone() {
        return phone;
    }

    public static String getUsername() {
        return username;
    }

    public static String getPass() {
        return pass;
    }

    public static String getOnePostNum() {
        return onePostNum;
    }
 
     
}
