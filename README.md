# **Testing http://computer-database.gatling.io/computers**
macOS BigSur;  
IntelliJ IDEA;  
Google Chrome Version 99.0.4844.51 (Official Build) (x86_64);  
ChromeDriver 90.0.4430.24;  
# How to start code
 1.Download WebDriver ChromeDriver, this driver for users who use Chrome browser.   
 If you use another browser move to ----> https://www.selenium.dev/documentation/webdriver/getting_started/install_drivers/.   
 2.Create folder Driver on your computer, and put driver into the folder. 
 For Windows:  
 Example: "C:\Driver\Chromedriver.exe".   
 For macOS:       
 Example:"/Users/air/Documents/Driver/chrome-driver".   
 3.Start IDE, open folder src\test\MainTest class.      
 find element "System.setProperty("webdriver.chrome.driver","/Users/air/Documents/Driver/chrome-driver");    
 4.Change properties("Check Step 1", "Check Step 2");    
# **Task:**
http://computer-database.gatling.io/computers Написать автоматический тест для проверки того, что функциональность “Add a new computer” в “Computer database”   работает (или не работает).  

Желательно: заполнение всех данных в форме добавления нового компьютера. Introduced date: 10 лет назад до написания тестового Discontinued: дата написания тестового задания. 

Приветствуется стек технологий: Java + TestNG + Gradle + Selenium + любой инструмент для формирования репорта Добавьте документацию по работе с проектом и загрузите в паблик репозиторий на GitHub.  
