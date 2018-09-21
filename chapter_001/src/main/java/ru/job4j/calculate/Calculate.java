package ru.job4j.calculate;
/**
 * Calculate.
 * @author Kirill Konkov (kskonkov@mail.ru)
 * @since 18.07.2018
 * @version 1
*/
public class Calculate {
/**
* main.
* Конструктор, вывод строки в консоль.
* @param args - args.
* @return Hello World
*/	
	public static void main(String[] args) {
		System.out.println("Hello World");
	}
	/**
* Method echo.
* @param name Your name.
* @return Echo plus your name.
*/
public String echo(String name) {
    return "Echo, echo, echo : " + name;
}
}