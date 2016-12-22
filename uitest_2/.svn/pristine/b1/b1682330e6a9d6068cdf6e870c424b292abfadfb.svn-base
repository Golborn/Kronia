Test funcionales de UI con Selenium y Appium
============================================

Requisitos
----------

- Una máquina local con JDK 1.7 o superior y Maven 3.3 o superior
- Un servidor remoto Selenium 2.52 o superior
- Un servidor remoto Appium 1.4 o superior


Configuración de máquina local
------------------------------

La máquina local se conecta con servidores remotos de Selenium y Appium para ejecutar los tests. Los tests se ejecutan usando Maven, vía el plugin de JUnit y las bibliotecas Java de acceso remoto a Selenium y Appium.

La dirección de los servidores remotos de Selenium y Appium está en `src/main/resources/uitest.properties`:

    appium.host = localhost
    appium.port = 4723

    selenium.host = localhost
    selenium.port = 4444   

Si el servidor Selenium y el servidor Appium están ejecutando en la misma máquina local, entonces use `localhost` para `appium.host` y `selenium.host`....


Configuración de servidor Selenium
----------------------------------

Para el servidor Selenium se recomienda usar una máquina Windows 7 o superior, para tener acceso nativo a una instancia de Internet Explorer.

El servidor Selenium debe tener instalado el [chromedriver](https://github.com/SeleniumHQ/selenium/wiki/ChromeDriver) y el [IEDriverServer](https://github.com/SeleniumHQ/selenium/wiki/InternetExplorerDriver)

Configuración de servidor Appium
--------------------------------

El servidor Appium debe tener instalado el Android SDK, y el ADB (Android Debug Bridge) debe estar configurado para conectarse con un dispositivo físico Android 2.2 vía un cable USB.


Compilación y ejecución
-----------------------

Para compilar y ejecutar todos los tests desde la máquina local:

    mvn test

Para ejecutar un test particular:

    mvn -Dtest=cl.entel.test.TestAndroidA000 test
    mvn -Dtest=cl.entel.test.TestWebA000 test
