public class PingpangCoach extends Coach implements English{

    public PingpangCoach() {
    }

    public PingpangCoach(String name, int age) {
        super(name, age);
    }

    @Override
    public void teach() {
        System.out.println("乒乓球教练在教乒乓球");
    }

    @Override
    public void speakEnglish() {
        System.out.println("乒乓球教练在学英语");
    }
}
