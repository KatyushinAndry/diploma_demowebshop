# qa_guru_5_24_katyushin_diploma_demowebshop
# Автотесты на http://demowebshop.tricentis.com

![Intelij_IDEA](src/test/resources/files/icons/Intelij_IDEA.png)![Java](src/test/resources/files/icons/Java.png)![Selenide](src/test/resources/files/icons/Selenide.png)![Selenoid](src/test/resources/files/icons/Selenoid.png)![Gradle](src/test/resources/files/icons/Gradle.png)![JUnit5](src/test/resources/files/icons/JUnit5.png)![Allure Report](src/test/resources/files/icons/Allure_Report.png)![AllureTestOps](src/test/resources/files/icons/AllureTestOps.png)![Github](src/test/resources/files/icons/Github.png)![Jenkins](src/test/resources/files/icons/Jenkins.png)![Rest-Assured](src/test/resources/files/icons/Rest-Assured.png)![Telegram](src/test/resources/files/icons/Telegram.png)![Jira](src/test/resources/files/icons/Jira.png)

IntelliJ IDEA, Java, Selenide, Selenoid, Gradle, JUnit5, Allure Report, Allure TestOps, Github, Jenkins, Rest-Assured,
Telegram (reports), Jira.

## Реализованы проверки:
В реализации использованы разные подходы проектирования, позволяющие достичь разного представления в отчетах
### UI
- [X] - Console log should not have any errors
- [X] - Check that the 'Books' item was opened via CATEGORIES
- [X] - Check that the 'Computers' was opened item via CATEGORIES
- [X] - Check that the 'Electronics' item  was opened via CATEGORIES
- [X] - Check that the 'Apparel & Shoes' item  was opened via CATEGORIES
- [X] - Check that the 'Digital downloads' item was opened via CATEGORIES
- [X] - Check that the 'Jewelry' item  was opened via CATEGORIES
- [X] - Check that the 'Gift Cards' item  was opened via CATEGORIES
- [X] - Check that the 'Desktops' item was opened via CATEGORIES
- [X] - Check that the 'Desktops' item  was opened via CATEGORIES
- [X] - Check that the 'Accessories' item  was opened via CATEGORIES
- [X] - Check that the 'Camera, photo' item was opened via CATEGORIES
- [X] - Check that the 'Cell phones' item was opened via CATEGORIES
- [X] - Login with incorrect credentials
- [X] - Check that the cart was empty by default
- [X] - Check that the Wishlist was empty by default

### API
- [X] - Add product to cart via api and check from UI with AUTHORIZATION
- [X] - Add product to cart via api and check from UI without AUTHORIZATION
- [X] - AUTHORIZATION via api

### Команда для запуска из терминала
Локально должны быть заданы параметры в local.properies, app.properties
```
gradle clean
```
Для запуска в несколько потоков
```
gradle clean -Dthreads=5
```
### Видео о прохождении тестов
![Selenoid](src/test/resources/files/Selenoid.gif)

### Запуск в Jenkins
Статистика по запускам
![Jenkins](src/test/resources/files/Jenkins_1.png)
Указание параметров для запуска
![Jenkins](src/test/resources/files/Jenkins_2.png)

### Отчёт в Allure Report
![Allure](src/test/resources/files/AllureReport.png)

### Хранение тест-кейсов в Allure TestOps
Ручные и автотесты
![Allure](src/test/resources/files/Allure_TO_1.png)
![Allure](src/test/resources/files/Allure_TO_2.png)
Дашборд
![Allure](src/test/resources/files/Allure_dash.png)
Ланчи
![Allure](src/test/resources/files/Allure_laun.png)
Результат запуска ланча
![Allure](src/test/resources/files/Allure_laun2.png)

### Интерграция с Jira
Отображение тест-кейсов и ланча
![Jira](src/test/resources/files/jira.png)

### Уведомления в Telegram
![Telegram](src/test/resources/files/telegram.png)