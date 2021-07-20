# qa_guru_5_24_katyushin_diploma_demowebshop
# Автотесты на http://demowebshop.tricentis.com

![Java](files/icons/Java.png)
![Gradle](files/icons/Gradle.png)
![JUnit5](files/icons/JUnit5.png)
![Rest-Assured](files/icons/Rest-Assured.png)
![Selenide](files/icons/Selenide.png)
![Intelij_IDEA](files/icons/Intelij_IDEA.png)
![Github](files/icons/Github.png)
![Selenoid](files/icons/Selenoid.png)
![Jenkins](files/icons/Jenkins.png)
![Allure Report](files/icons/Allure_Report.png)
![AllureTestOps](files/icons/AllureTestOps.png)
![Jira](files/icons/Jira.png)
![Telegram](files/icons/Telegram.png)

Java, Gradle, JUnit5, Rest-Assured, Selenide, IntelliJ IDEA, Github, Selenoid, Jenkins, Allure Report, Allure TestOps, Jira, Telegram (reports).

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
![Selenoid](files/Selenoid.gif)

### Запуск в Jenkins
https://jenkins.autotests.cloud/job/c05_katyushin_edit_diploma/

Статистика по запускам
![Jenkins](files/Jenkins_1.png)
Указание параметров для запуска
![Jenkins](files/Jenkins_2.png)

### Отчёт в Allure Report
https://jenkins.autotests.cloud/job/c05_katyushin_edit_diploma/8/allure/#

![Allure](files/AllureReport.png)

### Хранение тест-кейсов в Allure TestOps
https://allure.autotests.cloud/project/262/test-cases?treeId=554 

Ручные и автотесты
![Allure](files/Allure_TO_1.png)
![Allure](files/Allure_TO_2.png)
Дашборд
![Allure](files/Allure_dash.png)
Ланчи
![Allure](files/Allure_laun.png)
Результат запуска ланча
![Allure](files/Allure_laun2.png)

### Интерграция с Jira
https://jira.autotests.cloud/browse/QC5-8

Отображение тест-кейсов и ланча
![Jira](files/jira.png)

### Уведомления в Telegram
![Telegram](files/telegram.png)