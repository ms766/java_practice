public interface ITelephone {
    //access modifiers arnt needed in interfaces
    public void powerOn();
    public void dial(int phoneNumber);
    public void answer();
    public boolean callPhone(int phoneNumber);
    public boolean isRinging();
}
