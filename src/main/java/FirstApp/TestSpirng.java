package FirstApp;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpirng {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Music testBean = context.getBean("musicBean", Music.class);
        MusicPlayer musicPlayer = new MusicPlayer(testBean);
        musicPlayer.playMusic();
        context.close();
    }
}
