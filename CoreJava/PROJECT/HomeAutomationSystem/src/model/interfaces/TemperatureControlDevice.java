package model.interfaces;

public interface TemperatureControlDevice {

	void increaseTemperature();
    void decreaseTemperature();
    void setTemperature();
    int getCurrentTemperature();
}
