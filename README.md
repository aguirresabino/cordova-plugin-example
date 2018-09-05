# Criando um plugin para o Cordova

![Screenshot](https://raw.githubusercontent.com/aguirresabino/cordova-plugin-example/master/screenshot.png)

##  Iniciando projeto cordova

`cordova create appcordova com.example.appcordova AppCordova`

## Adicionando Plataformas

`cordova platform add android`

## Instalar o plugman via npm:
`npm i plugman -g`

## Criando o plugin

`plugman create -name HelloPlugin -plugin_id helloPlugin.example -plugin_version 1.0.0`

## Habilitando o plugin

`plugman platform add -platform_name android`

## Criando o package.json
`plugman createpackagejson HelloPlugin`

## Adicionando o plugin ao projeto cordova
`cordova plugin add HelloPlugin`

## Construindo aplicação

`cordova build`

## Testando aplicação no emulador

`cordova emulate android`

## Testando aplicação diretamente num smartphone android

`cordova run android`

## Verificando logs através do adb

`adb logcat -s "[nome da tag]"`
