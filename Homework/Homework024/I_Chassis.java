package Homework.Homework024;
/*
 * интерфейс описывает параметры шасси автомобиля
 */
public interface I_Chassis {

    String getDriveType(); // тип привода (передний, задний, полный)

    String getBrakeType(); // тип тормозной системы (дисковая, барабанная)
}
