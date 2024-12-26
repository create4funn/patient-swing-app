package util;

public class Utils {
    public static String generateAppointmentCode(int id) {
        // Tiền tố là "DK", định dạng ID thành chuỗi 3 chữ số (zero-padded)
        return String.format("DK%03d", id);
    }
}
