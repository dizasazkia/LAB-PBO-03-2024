package login_app.utils;

public class StringUtils {
    public static String generateNickname(String fullName) {
        String[] bagian = fullName.split(" ");
        if (bagian.length == 1) {
            return fullName;
        } else {
            return bagian[1];
        }
    }
}

