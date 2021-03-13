# TALLER DE MODULARIZACIÓN CON VIRTUALIZACION E INTRODUCCION A DOCKER Y AWS 

## Manual de usuario

Si se deseea hacer uso del programa lo primero que debe realizarse el clonar el repositorio almacenado en Github a través del siguiente comando:

```
git clone https://github.com/csarssj/AREP-LAB-4.git

```
O si desea puede descargarlo como archivo zip y luego descomprimirlo en la carpeta que desee.

Una vez hecho alguno de los dos pasos anteriores, nos dirigimos a la ruta de instalación y por medio de la consola digitamos el siguiente comando:

```
mvn package

```

Ejecutando el siguiente comando puede generar la documentacion:

```
mvn javadoc:javadoc

```

Ejecutando el siquiente comando en la consola y accediendo al siguiente link se puede visualizar una prueba.

```
java -cp target/classes edu.escuelaing.arep.nanoSpring.App edu.escuelaing.arep.nanoSpring.HelloController


```
o ingresando a través de este link desplegado en heroku:

[heroku](https://secure-reaches-84671.herokuapp.com/example.html)

![image](https://github.com/csarssj/ARSW-4-Servidor-Web/blob/master/img/prueba.png)

### Prerequisitos

Este proyecto necesita tener los siguientes progamas instalados en la máquina donde se deseea ejecutar:

```
  java version "1.8.0_251"
  Apache Maven 3.6.3
  git version 2.25.0.windows.1
  jdk1.8.0_251
```

El sistema, mas alla de facilitar el registro de las iniciativas e ideas de proyectos, es una valiosa base de conocimiento donde los diferentes actores pueden revisar si hay iniciativas, ideas o intereses similares y aunar esfuerzos para la materializacion.

### Diagrama de clases y Reporte de pruebas

[Se encuentran en este documento](https://github.com/csarssj/AREP-LAB-3/blob/master/Arquitectura_Empresarial__4.pdf)


## Construido en

* [Maven](https://maven.apache.org/) - Dependency Management


## Integración continua

[![CircleCI](https://circleci.com/gh/circleci/circleci-docs.svg?style=svg)](https://app.circleci.com/pipelines/github/csarssj/AREP-LAB-3)

## Control de versiones 

[Github](https://github.com/) para el versionamiento.

## Authors

[César González](https://github.com/csarssj) 

_Fecha : 13 de Marzo del 2021_ 


## License

This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) 
