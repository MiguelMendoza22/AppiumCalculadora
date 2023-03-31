Este proyecto fue realizado para ser utilizado como ejemplo en la realzación de pruebas moviles con appium, en este caso se usa Gradle con versión 6.5 para su compilación y la plataforma Android.

Es necesario tener presente que las dependencias utilizadas para este proyecto (Ubicadas en el archivo build.gradle) son:

Appium con versión 6.0.0
Serenity con versión 3.2.4
Junit con versión 4.12
Assertj-core con versión 3.8.0

Se realizó un testing basado en las operaciones basicas que posee la calculadora seleccionada, validando los resultados correspondientes.

En los ajustes de appium se encuentra el nombre por defecto que Android Studio (deviceName = "emulator-5554") utiliza y el servidor por defecto que utiliza el programa Appium (hub = "http://0.0.0.0:4723/wd/hub").