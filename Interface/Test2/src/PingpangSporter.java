public class PingpangSporter extends Sporter implements English{
    public PingpangSporter() {
    }

    public PingpangSporter(String name, int age) {
        super(name, age);
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球运动员在说英语");
    }

    @Override
    public void study() {
        System.out.println("乒乓球运动员在学乒乓球");
    }
}
