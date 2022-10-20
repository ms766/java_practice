public class MobilePhone implements ITelephone {
    private int myNumber;
    private boolean isRinging;
    private boolean isOn = false;


    public MobilePhone(int myNumber) {
        this.myNumber = myNumber;
    }

    @Override
    public void powerOn() {
        isOn = true;
        System.out.println("Mobile phone powered up");
    }

    @Override
    public void dial(int phoneNumber) {
        if(isOn){
            System.out.println("now ringing "+phoneNumber+" on mobile phone");
        }else{
            System.out.println("phone is switched off");
        }

    }

    @Override
    public void answer() {
        if(isRinging){
            System.out.println("Answering the mobile phone");
            isRinging = false;
        }
    }

    @Override
    public boolean callPhone(int phoneNumber) {
        if(phoneNumber == myNumber){
            isRinging = true;
            System.out.println("Melody ring");
        }else{
            isRinging = false;
            System.out.println("mobile phone not on or number dif");
        }
        return isRinging;
    }

    @Override
    public boolean isRinging() {
        return isRinging;
    }
}
