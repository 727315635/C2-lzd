package Task10;

public class Computer {
    private USB []usbArr = new USB[4];
    public void add(USB usb) {
        for(int i=0;i<usbArr.length;i++) {
            if(usbArr[i]==null) {
                usbArr[i]=usb;
                break;
            }
        }
    }
    public void poweron()
    {
        for(int i=0;i<usbArr.length;i++) {
            if(usbArr[i]!=null) {
                usbArr[i].turnon();
            }
        }
        System.out.println("电脑开机成功");
    }
    public void poweroff() {
        for(int i=0;i<usbArr.length;i++) {
            if(usbArr[i]!=null) {
                usbArr[i].turnoff();
            }
        }
        System.out.println("电脑关机成功");
    }
}
