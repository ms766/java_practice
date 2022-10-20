public class Main {
    public static void main(String[] args) {
        ITelephone timsPhone;
        timsPhone = new DeskPhone(1234567890);
        timsPhone.powerOn();
        timsPhone.callPhone(1234567890);
        timsPhone.answer();

        System.out.println("---");
        timsPhone = new MobilePhone(24585);
        //timsPhone.powerOn();
        timsPhone.callPhone(24585);
        timsPhone.answer();
    }
}