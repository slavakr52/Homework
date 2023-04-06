package Homework.Homework024;
/*
 * интерфейс для объединения остальных интерфейсов в единый
 */
public interface I_AllInfo extends I_Engine, I_Chassis, I_Body, I_Interior {

    void getInfo();

}
