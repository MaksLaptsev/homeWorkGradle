HomeWork Gradle

1.Install Gradle

2.Assemble custom jar utils-1.3.5.jar. It should be compatible with java 8. The manifest file should contain the name and version of your jar. The jar should contain class StringUtils with method boolean isPositiveNumber(String str). Use Apache Commons Lang 3.10 library to implement this method. Write one any unit test for your StringUtils.isPositiveNumber(String str) using JUnit 5.+.

3.Create a project multi-project with two subprojects core and api. The core subproject should contain class Utils with method boolean isAllPositiveNumbers(String... str). Use utils-1.3.5.jar from the previous task to implement this method. The api subproject should contain class App with the main method. Call Utils.isAllPositiveNumbers("12", "79") from the main method of api subproject.

Дополнительно:

--Сделать gradle плагин, который также опубликовать и подключить к проекту.

--Как пример функциональности плагина - тестирование и формирование отчета.

WHATS DONE:
1. - Установил Gradle :D

2. - Собрал jar utils-1.3.5.jar, она совместима с java 8. Манифест содержит в себе имя и версию jar. utils-1.3.5.jar содержит class StringUtils с методом boolean isPositiveNumber(String str). Была использована библиотека Apache Commons Lang 3.10 для реализации метода isPositiveNumber(String str). Для тестирования метода был использован JUnit 5.+

3. - Создан мультипроект содержащий в себе 2 подпроекта core и api. Подпроект core содержит класс Utils с методом boolean isAllPositiveNumbers(String... str). Для реализации метода использовался utils-1.3.5.jar из предыдущего задания. Подпроект api содержит класс App с main методом. В мейн методе вызывается Utils.isAllPositiveNumbers("12", "79").

Из дополнительного:
--Сделал custom gradle плагин, подключил его к проекту с utils-1.3.5
по сути этот плагин бесполезен - он выводит в консоль местоположение отчета по тестам junit, дату/время(актуальную на момент вызова).

---------------------------------------------------------------
Сборка и запуск:

1.Собрать и опубликовать в локальный репозиторий плагин
- Проект с плагином находится в ветке myCustomPlugin
- Для сборки использовать "gradle build"
- Для публикации - "gradle publishToMavenLocal"
------
2. Собрать и опубликовать в локальный репозиторий utils-1.3.5
- Проект с utils-1.3.5 находится в ветке utils
- для сборки "gradle build"
- для публикации - "gradle publishToMavenLocal"
- для запуска задачи из тестового плагина использовать "gradle build myTask" (иначе информация о местоподожении тестов будет неактуальной :D)
-----
3. Собрать мультипроект 
- Мультипроект находится в основной ветке master
- Для сборки использовать "gradle build"
- Запуск происходит в методе мейн в классе App
- Так же можно собрать flat jar с помощью таски allJar, для этого использовать команду "gradle allJar". Будет создан multiProject-1.0.jar в (YourDirectoryWhenYouSaveProject)/build/libs
- Для запуска jar из корня проекта использовать команду java -jar build/libs/multiProject-1.0.jar .При запуске без аргументов будет использованы предустановленые значения: "12","79"; С аргументами(java -jar build/libs/multiProject-1.0.jar 12 15 88 -1) - использованы будут они.

P.S. Плагин и utils-1.3.5 так же дублируются в мультипроекте в папке lib(которая находится в корне проекта), поэтому в случае их не публикации в локальный репозиторий - они будут взяты оттуда.
