package com.company;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	System.out.println("Hello Word!");


	WebDriver driver = new ChromeDriver();
        //  WebDriver driver = new FierfoxDriver();
       //перейти на сйт гугл
        driver.get("http://www.google.com/");
        //увеличить окно
        driver.manage().window().maximize();
        Thread.sleep(5000);
       //вывести имя сайта
       System.out.println("Title:"+ driver.getTitle());
       driver.get ("http://www.newsru.co.il/");
        Thread.sleep(5000);
        System.out.println("Title:"+ driver.getTitle());
       //изменить размер окна
        Dimension d = new  Dimension (500, 500);
        driver.manage().window().setSize(d);
        //вернуться назад
       driver.navigate().back();
        Thread.sleep(5000);
       System.out.println("Title:"+ driver.getTitle());
        //перейти вперед
        driver.navigate().forward();
        Thread.sleep(5000);
        System.out.println("Title:"+ driver.getTitle());

        // Sel-01
       //перейти на сайт 1
        driver.get ("https://www.e1.ru/");
        //использовать полноэкранный режим
        driver.manage().window().fullscreen();
        //рапечатать имя сайта
        System.out.println("Title:"+ driver.getTitle());
      //перейти на сайт 2
        driver.get ("https://kinohod.ru/online?utm_source=email_send&utm_medium=email&utm_campaign=26/03");
        //увеличить окно
        driver.manage().window().maximize();
        System.out.println("Title:"+ driver.getTitle());
        //вернуться назад
        driver.navigate().back();
        System.out.println("Title:"+ driver.getTitle());
        //вернуться вперед
        driver.navigate().forward();
        System.out.println("Title:"+ driver.getTitle());
        //перейти на сайт 3
        driver.get ("https://mail.ru/");
        System.out.println("Title:"+ driver.getTitle());
        //вернуться назад
        driver.navigate().back();
        System.out.println("Title:"+ driver.getTitle());
        //вернуться назад на сайт 1
        driver.navigate().back();
        System.out.println("Title:"+ driver.getTitle());

        driver.quit();
    }
}
