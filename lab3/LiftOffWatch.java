package lab3;

public class LiftOffWatch {

    private double temprature;
    private String weather;
    private double wind;

    public void setTemp(double temp) {
        this.temprature = temp;
    }

    public void setWeather(String state) {
        this.weather = state;
    }

    public void setWind(double speed) {
        this.wind = speed;
    }

    public boolean canWeLaunch() {
        if (temprature <= 34.0 && temprature >= 16.5) {
            if (weather.equalsIgnoreCase("sunny") && wind <= 60) {
                return true;
            } else if (weather.equalsIgnoreCase("cloudy") && wind <= 45) {
                return true;
            }
        }
        return false;
    }
}
