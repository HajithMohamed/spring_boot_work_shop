package Observer;

public class ObserverDemo {
    public static void main(String[] args) {
        WeatherStation st = new WeatherStation();
        MobileDisplay md = new MobileDisplay();
        WebDisplay wd = new WebDisplay();
        st.addObserver(md);
        st.addObserver(wd);

        st.setTemperature(30.5);
        st.setTemperature(28.0);
    }
}
