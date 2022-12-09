public class ScreenService {

    public static HomeScreen HomeScreen = new HomeScreen();
    public static FileOptionsScreen FileOptionsScreen = new FileOptionsScreen();

    public static Screen CurrentScreen = HomeScreen;


    public static Screen getCurrentScreen() {
        return CurrentScreen;
    }


    public static void setCurrentScreen(Screen currentScreen) {
        CurrentScreen = currentScreen;
    }

}
