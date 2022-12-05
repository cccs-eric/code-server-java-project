## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Required Extensions

In order to let Code Server understand what is a Java Project, you will need to install `Extension Pack for Java` (vscjava.vscode-java-pack) from the Marketplace.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).

## Pre-configured Tasks

This project comes pre-packaged with two configured tasks:
1. `Generate application jar (no dependency)`: generates a JAR from the `.class` files of this project
2. `Submit to Spark`: submits the JAR of the application to Spark

To execute a task, go to the hamburger menu (top-left) -> `Terminal` -> `Run Task...`.  

> In order to generate the application JAR, the VSCode Java extension needs to be enabled.  To do so, simply open a Java file in order to force loading the extension.
